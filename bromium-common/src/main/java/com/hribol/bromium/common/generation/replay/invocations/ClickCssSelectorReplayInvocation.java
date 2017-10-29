package com.hribol.bromium.common.generation.replay.invocations;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Represents an invocation of a {@link ClickCssSelectorReplayInvocation}
 */
public class ClickCssSelectorReplayInvocation extends ElementArrivedReplayInvocation {
    public ClickCssSelectorReplayInvocation(String cssSelector, String hashCode) {
        super(cssSelector, hashCode, CLICK_CSS_SELECTOR);
    }
}
