package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_DATA_ID;

public class ClickDataIdReplayInvocationFunction extends NormalInvocation implements ReplayFunctionInvocation {
    public ClickDataIdReplayInvocationFunction(String dataId, String hashCode) {
        super(CLICK_DATA_ID, dataId, hashCode);
    }
}
