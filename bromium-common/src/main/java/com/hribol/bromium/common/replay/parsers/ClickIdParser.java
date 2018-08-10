package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickId;
import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.ID;

public class ClickIdParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        SearchContextFunction contextProvider = actionCreationContext.getContextProvider();
        Map<String, String> parameters = actionCreationContext.getParameters();
        boolean expectHttpRequest = actionCreationContext.expectsHttpRequest();
        return new ClickId(parameters.get(ID), contextProvider);
    }
}
