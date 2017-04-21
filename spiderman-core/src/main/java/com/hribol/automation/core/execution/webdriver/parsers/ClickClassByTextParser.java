package com.hribol.automation.core.execution.webdriver.parsers;

import com.hribol.automation.core.actions.ClickClassByText;
import com.hribol.automation.core.execution.webdriver.WebDriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 30.03.17.
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, Object> parameters) {
        String initialCollectorClass = (String) parameters.get("initialCollectorClass");
        String text = (String) parameters.get("text");
        String eventName = (String) parameters.get("event");
        boolean expectsHttpRequest = (boolean) parameters.get("expectsHttp");
        return new ClickClassByText(initialCollectorClass, text, eventName, expectsHttpRequest);
    }
}
