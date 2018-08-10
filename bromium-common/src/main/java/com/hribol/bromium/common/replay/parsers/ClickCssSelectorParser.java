package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * Parser for {@link ClickCssSelector}
 */
public class ClickCssSelectorParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        Function<WebDriver, SearchContext> contextProvider = actionCreationContext.getContextProvider();
        Map<String, String> parameters = actionCreationContext.getParameters();
        boolean expectHttpRequest = actionCreationContext.expectsHttpRequest();
        String cssSelector = parameters.get(CSS_SELECTOR);
        return new ClickCssSelector(cssSelector, expectHttpRequest, contextProvider);
    }
}
