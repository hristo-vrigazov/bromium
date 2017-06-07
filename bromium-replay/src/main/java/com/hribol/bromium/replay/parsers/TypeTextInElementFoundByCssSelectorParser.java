package com.hribol.bromium.replay.parsers;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;

import java.util.Map;

import com.hribol.bromium.replay.actions.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;

/**
 * Created by hvrigazov on 12.05.17.
 */
public class TypeTextInElementFoundByCssSelectorParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String eventName = parameters.get(EVENT);
        String text = parameters.get(TEXT);
        return new TypeTextInElementFoundByCssSelector(cssSelector, text, eventName, expectHttpRequest);
    }
}
