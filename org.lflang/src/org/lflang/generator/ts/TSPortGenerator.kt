/*************
 * Copyright (c) 2019-2021, TU Dresden.

 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:

 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.

 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ***************/

package org.lflang.generator.ts

import org.lflang.isMultiport
import org.lflang.lf.Input
import org.lflang.lf.Output
import org.lflang.lf.Port
import org.lflang.lf.Reactor

class TSPortGenerator(private val reactor: Reactor) {

    private fun generateDeclaration(port: Port): String = with(port) {
        return if (isMultiport) {
            //val initializerLists = (0 until getValidWidth()).joinToString(", ") { """{"${name}_$it", this}""" }
            """$cppType $name;"""
        } else {
            """$cppType $name{"$name", this};"""
        }
    }

    /** Get the C++ type for the receiving port. */
    val Port.tsType: String
        get() {
            val portType = when (this) {
                is Input  -> "__InPort"
                is Output -> "__OutPort"
                else      -> throw AssertionError()
            }

            return "$portType<$targetType>"
//            return if (isMultiport) {
//                "std::vector<$portType<$targetType>>"
//            } else {
//                "$portType<$targetType>"
//            }
        }

    private fun generateConstructorInitializer(port: Port) = with(port) {
        "this.${name} = new ${tsType}(this)"
//        val width = port.widthSpec.toCode()
//        """
//            // initialize port $name
//            ${name}.reserve($width);
//            for (size_t __lf_idx = 0; __lf_idx < $width; __lf_idx++) {
//              std::string __lf_port_name = "${name}_" + std::to_string(__lf_idx);
//              ${name}.emplace_back(__lf_port_name, this);
//            }
//        """.trimIndent()
    }

    // FIXME: Put these in a super class?
    fun generateConstructorInitializers() =
        reactor.inputs.filter { it.isMultiport }.joinToString("\n") { generateConstructorInitializer(it) } +
                reactor.outputs.filter { it.isMultiport }.joinToString("\n") { generateConstructorInitializer(it) }

    fun generateDeclarations() =
        reactor.inputs.joinToString("\n", "// input ports\n", postfix = "\n") { generateDeclaration(it) } +
                reactor.outputs.joinToString("\n", "// output ports\n", postfix = "\n") { generateDeclaration(it) }
}