package com.hribol.bromium.common.replay.invocations;

import com.hribol.bromium.common.replay.functions.ReplayFunctionInvocation;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class EmptyReplayFunctionInvocation implements ReplayFunctionInvocation {
    @Override
    public String getJavascriptCode() {
        return "";
    }
}
