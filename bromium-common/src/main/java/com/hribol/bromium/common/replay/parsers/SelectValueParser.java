package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.SelectValue;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.VALUE;

public class SelectValueParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest, Function<WebDriver, SearchContext> contextProvider) {
        String selector = parameters.get(CSS_SELECTOR);
        String value = parameters.get(VALUE);
        return new SelectValue(selector, value, contextProvider);
    }

}
