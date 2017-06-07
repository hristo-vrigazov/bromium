package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.conditions.selenium.TextOfElementFoundByCssSelectorToBe;
import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static com.hribol.bromium.core.utils.Constants.TIMEOUT;

/**
 * Created by hvrigazov on 18.05.17.
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
