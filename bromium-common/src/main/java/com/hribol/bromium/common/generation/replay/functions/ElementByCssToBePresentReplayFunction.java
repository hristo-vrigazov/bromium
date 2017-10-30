package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.replay.invocations.ElementByCssToBePresentReplayInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;

/**
 * Created by hvrigazov on 30.10.17.
 */
public class ElementByCssToBePresentReplayFunction extends ElementArrivedReplayFunction {
    public ElementByCssToBePresentReplayFunction(JsCollector jsCollector) {
        super(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT, jsCollector, ElementByCssToBePresentReplayInvocation::new);
    }
}
