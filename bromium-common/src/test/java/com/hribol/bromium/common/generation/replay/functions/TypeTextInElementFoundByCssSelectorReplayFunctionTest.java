package com.hribol.bromium.common.generation.replay.functions;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class TypeTextInElementFoundByCssSelectorReplayFunctionTest extends ElementArrivedReplayFunctionTest {
    public TypeTextInElementFoundByCssSelectorReplayFunctionTest() {
        super(TypeTextInElementFoundByCssSelectorReplayFunction::new, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR);
    }
}
