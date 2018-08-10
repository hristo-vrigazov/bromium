package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickDataId;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.DATA_ID;

public class ClickDataIdParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        Function<WebDriver, SearchContext> contextProvider = actionCreationContext.getContextProvider();
        Map<String, String> parameters = actionCreationContext.getParameters();
        boolean expectHttpRequest = actionCreationContext.expectsHttpRequest();
        String dataId = parameters.get(DATA_ID);
        return new ClickDataId(dataId, expectHttpRequest, contextProvider);
    }

}
