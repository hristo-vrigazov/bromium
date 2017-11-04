package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class ElementArrivedReplayInvocation extends NormalInvocation implements ReplayFunctionInvocation {

    public ElementArrivedReplayInvocation(String cssSelector, String hashCode, String functionName) {
        super(functionName, cssSelector, hashCode);
    }

}
