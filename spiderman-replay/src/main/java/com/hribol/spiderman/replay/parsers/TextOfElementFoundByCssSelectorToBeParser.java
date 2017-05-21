package com.hribol.spiderman.replay.parsers;

import com.hribol.spiderman.replay.actions.TextOfElementFoundByCssSelectorToBe;
import com.hribol.spiderman.replay.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.*;

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
