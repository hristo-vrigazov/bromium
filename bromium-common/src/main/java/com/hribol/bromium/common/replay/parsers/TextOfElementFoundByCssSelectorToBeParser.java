package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.TextOfElementFoundByCssSelectorToBe;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static com.hribol.bromium.core.utils.Constants.TIMEOUT;

/**
 * A parser for {@link TextOfElementFoundByCssSelectorToBe}
 */
public class TextOfElementFoundByCssSelectorToBeParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String text = parameters.get(TEXT);
        String event = parameters.get(EVENT);
        Integer timeout = Integer.parseInt(parameters.get(TIMEOUT));
        return new TextOfElementFoundByCssSelectorToBe(cssSelector, text, event, timeout);
    }
}
