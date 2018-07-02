package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.EmptyReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;

public class EmptyReplayFunction implements ReplayFunction {

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        return new EmptyReplayInvocation();
    }

    /**
     * @return the javascript code
     */
    @Override
    public String getJavascriptCode() {
        return "";
    }
}
