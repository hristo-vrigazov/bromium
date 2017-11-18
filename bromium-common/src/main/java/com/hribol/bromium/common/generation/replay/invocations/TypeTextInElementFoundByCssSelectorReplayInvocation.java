package com.hribol.bromium.common.generation.replay.invocations;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class TypeTextInElementFoundByCssSelectorReplayInvocation extends ElementArrivedReplayInvocation {
    public TypeTextInElementFoundByCssSelectorReplayInvocation(String cssSelector, String hashCode) {
        super(cssSelector, hashCode, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR);
    }
}
