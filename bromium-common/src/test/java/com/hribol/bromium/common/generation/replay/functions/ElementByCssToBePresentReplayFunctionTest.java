package com.hribol.bromium.common.generation.replay.functions;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;

/**
 * Created by hvrigazov on 30.10.17.
 */
public class ElementByCssToBePresentReplayFunctionTest extends ElementArrivedReplayFunctionTest {
    public ElementByCssToBePresentReplayFunctionTest() {
        super(ElementByCssToBePresentReplayFunction::new, ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT);
    }
}
