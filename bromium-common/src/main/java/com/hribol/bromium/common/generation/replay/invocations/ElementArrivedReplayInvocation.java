package com.hribol.bromium.common.generation.replay.invocations;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class ElementArrivedReplayInvocation extends NormalReplayInvocation {

    public ElementArrivedReplayInvocation(String cssSelector, String hashCode, String functionName) {
        super(functionName, cssSelector, hashCode);
    }

}
