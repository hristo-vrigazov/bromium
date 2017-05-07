package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.ClickCssSelector;
import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.core.utils.Constants.EVENT;

/**
 * Parser for {@link com.hribol.spiderman.core.actions.ClickCssSelector}
 */
public class ClickCssSelectorParser implements WebDriverActionParameterParser {

    private final String cssSelector = "cssSelector";

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(this.cssSelector);
        String eventName = parameters.get(EVENT);
        return new ClickCssSelector(cssSelector, eventName, expectHttpRequest);
    }
}
