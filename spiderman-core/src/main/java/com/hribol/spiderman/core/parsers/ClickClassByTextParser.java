package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.ClickClassByText;
import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 30.03.17.
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String initialCollectorClass = parameters.get("initialCollectorClass");
        String text = parameters.get("text");
        String eventName = parameters.get("event");
        return new ClickClassByText(initialCollectorClass, text, eventName, expectHttpRequest);
    }
}
