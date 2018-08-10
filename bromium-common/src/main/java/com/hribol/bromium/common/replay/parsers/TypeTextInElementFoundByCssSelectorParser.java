package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
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
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        Map<String, String> parameters = actionCreationContext.getParameters();
        boolean expectHttpRequest = actionCreationContext.expectsHttpRequest();
        Function<WebDriver, SearchContext> contextProvider = actionCreationContext.getContextProvider();
        String cssSelector = parameters.get(CSS_SELECTOR);
        String text = parameters.get(TEXT);
        return new TypeTextInElementFoundByCssSelector(cssSelector, text, expectHttpRequest, contextProvider);
    }
}
