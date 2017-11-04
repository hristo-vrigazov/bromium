package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CLASS_BY_TEXT;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextReplayInvocation extends NormalInvocation implements ReplayFunctionInvocation {
    public ClickClassByTextReplayInvocation(String initialCollectorClass, String aliasText, String hashCode) {
        super(CLICK_CLASS_BY_TEXT, initialCollectorClass, aliasText, hashCode);
    }
}
