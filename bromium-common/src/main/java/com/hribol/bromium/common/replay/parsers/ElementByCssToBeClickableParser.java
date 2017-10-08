package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ElementByCssToBeClickable;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TIMEOUT;

/**
 * A parser for {@link ElementByCssToBeClickable}
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
