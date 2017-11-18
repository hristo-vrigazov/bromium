package com.hribol.bromium.common.generation.record.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Represents an invocation of a recorder function for {@link com.hribol.bromium.common.replay.actions.ClickCssSelector}
 */
public class ClickCssSelectorRecorderFunctionInvocation extends NormalInvocation implements RecorderFunctionInvocation {

    public ClickCssSelectorRecorderFunctionInvocation(String cssSelector, String hashCode) {
        super(CLICK_CSS_SELECTOR, cssSelector, hashCode);
    }
}
