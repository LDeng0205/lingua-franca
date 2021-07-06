/*
 * Copyright (c) 2021, TU Dresden.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.lflang.generator.rust

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.lflang.*
import org.lflang.Target
import org.lflang.generator.GeneratorBase
import org.lflang.generator.cpp.name
import org.lflang.lf.Action
import org.lflang.lf.Reaction
import org.lflang.lf.VarRef

/**
 * Generates Rust code.
 */
class RustGenerator(fileConfig: RustFileConfig, errorReporter: ErrorReporter) : GeneratorBase(fileConfig, errorReporter) {

    override fun doGenerate(resource: Resource, fsa: IFileSystemAccess2, context: IGeneratorContext) {
        super.doGenerate(resource, fsa, context)

        // stop if there are any errors found in the program by doGenerate() in GeneratorBase
        if (errorsOccurred()) return

        // abort if there is no main reactor
        if (mainDef == null) {
            println("WARNING: The given Lingua Franca program does not define a main reactor. Therefore, no code was generated.")
            return
        }

        FileConfig.createDirectories(fileConfig.srcGenPath)

        val gen = makeGenerationInfo(resource, fsa, context)
        RustEmitter.generateFiles(fileConfig as RustFileConfig, gen)

        if (targetConfig.noCompile || errorsOccurred()) {
            println("Exiting before invoking target compiler.")
        } else {
            invokeRustCompiler()
        }
    }

    private fun makeGenerationInfo(resource: Resource, fsa: IFileSystemAccess2, context: IGeneratorContext): GenerationInfo {
        val reactors = makeReactorInfos()

        return GenerationInfo(
            crate = CrateInfo("mycrate_todo", "0.0.0", authors = listOf("todo")),
            runtime = makeRuntimeInfo(),
            reactors = reactors,
            mainReactor = reactors.first { it.isMain }
        )
    }

    private fun makeReactorInfos() = reactors.map { reactor ->
        val components = mutableMapOf<String, ReactorComponent>()
        for (component in reactor.allOutputs + reactor.allInputs + reactor.allActions) {
            val irObj = ReactorComponent.from(component) ?: continue
            components[irObj.name] = irObj
        }

        val reactions = reactor.reactions.map { n: Reaction ->
            val dependencies = (n.effects + n.sources).mapTo(LinkedHashSet()) { components[it.name]!! }
            ReactionInfo(idx = n.indexInContainer, depends = dependencies, body = n.code.body)
        }

        ReactorInfo(
            lfName = reactor.name,
            reactions = reactions,
            otherComponents = components.values.toList(),
            isMain = reactor.isMain
        )
    }

    private fun makeRuntimeInfo(): RuntimeInfo {
        // fixme
        return RuntimeInfo(local_crate_path = "/home/clem/Documents/Cours/rust-reactors")
    }


    private fun invokeRustCompiler() {
        val cargoBuilder = createCommand(
            "cargo", listOf("build"),
            fileConfig.srcGenPath,
            "The Rust target requires Cargo in the path. " +
                    "Auto-compiling can be disabled using the \"no-compile: true\" target property.",
            true
        ) ?: return


        val cargoReturnCode = executeCommand(cargoBuilder)

        if (cargoReturnCode == 0) {
            println("SUCCESS (compiling generated Rust code)")
            println("Generated source code is in ${fileConfig.srcGenPath}")
            println("Compiled binary is in ${fileConfig.binPath}")
        } else {
            errorReporter.reportError("cargo failed with error code $cargoReturnCode")
        }
    }



    override fun supportsGenerics(): Boolean = true

    override fun getTargetTimeType(): String = "LogicalTime"

    override fun getTargetTagType(): String = "Tag"

    override fun getTargetTagIntervalType(): String = "Duration"

    override fun getTargetUndefinedType(): String = TODO("what's that")

    override fun getTargetFixedSizeListType(baseType: String, size: Int): String =
        "[ $baseType ; $size ]"

    override fun getTargetVariableSizeListType(baseType: String): String =
        "Vec<$baseType>"

    override fun getTarget(): Target = Target.Rust


    override fun generateDelayBody(action: Action, port: VarRef): String {
        TODO("Not yet implemented")
    }

    override fun generateForwardBody(action: Action, port: VarRef): String {
        TODO("Not yet implemented")
    }

    override fun generateDelayGeneric(): String {
        TODO("Not yet implemented")
    }

}