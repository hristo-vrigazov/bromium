package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ConfirmAlert;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

public class ConfirmAlertParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        Function<SearchContext, SearchContext> contextProvider = actionCreationContext.getContextProvider();
        Map<String, String> parameters = actionCreationContext.getParameters();
        boolean expectHttpRequest = actionCreationContext.expectsHttpRequest();
        return new ConfirmAlert(expectHttpRequest);
    }

}
