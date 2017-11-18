package com.hribol.bromium.common.generation.replay.functions;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class ClickCssSelectorReplayFunctionTest extends ElementArrivedReplayFunctionTest {

    public ClickCssSelectorReplayFunctionTest() {
        super(ClickCssSelectorReplayFunction::new, CLICK_CSS_SELECTOR);
    }
}
