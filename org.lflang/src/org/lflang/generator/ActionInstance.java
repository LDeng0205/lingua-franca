/* Instance of an action. */

/*************
Copyright (c) 2019, The University of California at Berkeley.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice,
   this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
***************/

package org.lflang.generator;

import org.lflang.ASTUtils;
import org.lflang.TimeValue;
import org.lflang.lf.Action;
import org.lflang.lf.ActionOrigin;
import org.lflang.lf.Parameter;
import org.lflang.lf.TimeUnit;

/**
 * Instance of an action.
 * @author{Edward A. Lee <eal@berkeley.edu>}
 * @author{Marten Lohstroh <marten@berkeley.edu>}
 */
public class ActionInstance extends TriggerInstance<Action> {
    
    /**
     * Create a new action instance.
     * If the definition is null, then this is a shutdown action.
     * @param definition The AST definition, or null for startup.
     * @param parent The parent reactor.
     */
    public ActionInstance(Action definition, ReactorInstance parent) {
        super(definition, parent);
        if (parent == null) {
            throw new InvalidSourceException("Cannot create an ActionInstance with no parent.");
        }
        if (definition != null) {
            if (definition.getMinDelay() != null) {
                Parameter parm = definition.getMinDelay().getParameter();
                if (parm != null) {
                    this.minDelay = ASTUtils.getTimeValue(
                            parent.initialParameterValue(parm).get(0));
                } else {
                    this.minDelay = ASTUtils.getTimeValue(definition.getMinDelay());
                }
            }
            if (definition.getMinSpacing() != null) {
                Parameter parm = definition.getMinSpacing().getParameter();
                if (parm != null) {
                    this.minSpacing = ASTUtils.getTimeValue(
                            parent.initialParameterValue(parm).get(0));
                } else {
                    this.minSpacing = ASTUtils.getTimeValue(definition.getMinSpacing());
                }
            }
            if (definition.getOrigin() == ActionOrigin.PHYSICAL) {
                physical = true;
            }
            policy = definition.getPolicy();
        }
    }
    
    //////////////////////////////////////////////////////
    //// Public fields.

    /** The constant default for a minimum delay. */
    public static TimeValue DEFAULT_MIN_DELAY = new TimeValue(0, TimeUnit.NONE);
        
    //////////////////////////////////////////////////////
    //// Public methods.

    /** Return the minimum delay for this action. */
    public TimeValue getMinDelay() {
        return minDelay;
    }
    
    /** Return the minimum spacing between action events. */
    public TimeValue getMinSpacing() {
        return minSpacing;
    }
    
    /** Return the replacement policy for when minimum spacing is violated. */
    public String getPolicy() {
        return policy;
    }
    
    /** Return the indicator of whether the action is physical. */
    public boolean isPhysical() {
        return physical;
    }

    //////////////////////////////////////////////////////
    //// Protected fields.

    /** The minimum delay for this action. */
    TimeValue minDelay = DEFAULT_MIN_DELAY;
    
    /** The minimum spacing between action events. */
    TimeValue minSpacing = null;
    
    /** The replacement policy for when minimum spacing is violated. */
    String policy = null;
    
    /** Indicator of whether the action is physical. */
    boolean physical;
}
