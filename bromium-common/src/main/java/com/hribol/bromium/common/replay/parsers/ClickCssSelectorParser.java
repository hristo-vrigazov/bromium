package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * Parser for {@link ClickCssSelector}
 */
public class ClickCssSelectorParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        return new ClickCssSelector(cssSelector, expectHttpRequest);
    }
}
