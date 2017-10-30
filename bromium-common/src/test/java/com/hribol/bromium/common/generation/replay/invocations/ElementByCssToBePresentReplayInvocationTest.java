package com.hribol.bromium.common.generation.replay.invocations;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;

/**
 * Created by hvrigazov on 30.10.17.
 */
public class ElementByCssToBePresentReplayInvocationTest extends ElementArrivedReplayInvocationTest {
    public ElementByCssToBePresentReplayInvocationTest() {
        super(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT, ElementByCssToBePresentReplayInvocation::new);
    }
}
