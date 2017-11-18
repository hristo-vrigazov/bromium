package com.hribol.bromium.common.generation.replay.invocations;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ClickCssSelectorReplayInvocationTest extends ElementArrivedReplayInvocationTest {

    public ClickCssSelectorReplayInvocationTest() {
        super(CLICK_CSS_SELECTOR, ClickCssSelectorReplayInvocation::new);
    }
}
