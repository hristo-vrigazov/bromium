package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * A {@link ReplayFunction} for {@link com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector}
 */
public class TypeTextInElementFoundByCssSelectorReplayFunction extends ElementArrivedReplayFunction {

    public TypeTextInElementFoundByCssSelectorReplayFunction(JsCollector jsCollector, ElementArrivedInvocationProvider invocationProvider) {
        super(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR, jsCollector, invocationProvider);
    }
}
