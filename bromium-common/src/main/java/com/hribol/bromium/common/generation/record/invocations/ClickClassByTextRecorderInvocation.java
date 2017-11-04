package com.hribol.bromium.common.generation.record.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CLASS_BY_TEXT;


/**
 * {@link RecorderFunctionInvocation} for {@link com.hribol.bromium.common.replay.actions.ClickClassByText}
 */
public class ClickClassByTextRecorderInvocation extends NormalInvocation implements RecorderFunctionInvocation {
    public ClickClassByTextRecorderInvocation(String initialCollectorClass, String text, String eventName) {
        super(CLICK_CLASS_BY_TEXT, initialCollectorClass, text, eventName);
    }
}
