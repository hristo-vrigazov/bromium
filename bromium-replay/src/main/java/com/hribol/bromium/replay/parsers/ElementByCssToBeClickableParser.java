package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.conditions.selenium.ElementByCssToBeClickable;
import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TIMEOUT;

/**
 * Created by hvrigazov on 18.05.17.
 */
public class ElementByCssToBeClickableParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String eventName = parameters.get(EVENT);
        Integer timeout = Integer.parseInt(parameters.get(TIMEOUT));
        return new ElementByCssToBeClickable(cssSelector, eventName, timeout);
    }
}
