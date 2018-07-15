package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.SelectValue;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.VALUE;

public class SelectValueParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        String selector = parameters.get(CSS_SELECTOR);
        String value = parameters.get(VALUE);
        return new SelectValue(selector, value);
    }

}
