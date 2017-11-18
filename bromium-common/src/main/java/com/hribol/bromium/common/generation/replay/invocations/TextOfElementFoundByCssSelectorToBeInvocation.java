package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;
import com.hribol.bromium.common.replay.actions.TextOfElementFoundByCssSelectorToBe;

import static com.hribol.bromium.common.builder.JsFunctionNames.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;

/**
 * Invocation for {@link TextOfElementFoundByCssSelectorToBe}
 */
public class TextOfElementFoundByCssSelectorToBeInvocation extends NormalInvocation implements ReplayFunctionInvocation {
    public TextOfElementFoundByCssSelectorToBeInvocation(String cssSelector, String text, String hashCode) {
        super(TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE, cssSelector, text, hashCode);
    }
}
