package com.hribol.bromium.common.replay.functions;

import com.hribol.bromium.common.replay.generation.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.replay.invocations.EmptyReplayFunctionInvocation;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class EmptyReplayFunction implements ReplayFunction {
    @Override
    public String getJavascriptCode() {
        return "";
    }

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        return new EmptyReplayFunctionInvocation();
    }
}
