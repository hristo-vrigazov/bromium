package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.TEXT;

/**
 * A parser for {@link TypeTextInElementFoundByCssSelector}
 */
public class TypeTextInElementFoundByCssSelectorParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest, Function<WebDriver, SearchContext> contextProvider) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String text = parameters.get(TEXT);
        return new TypeTextInElementFoundByCssSelector(cssSelector, text, expectHttpRequest);
    }
}
