package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.ClickClassByText;
import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.core.utils.Constants.EVENT;

/**
 * A parser for {@link ClickClassByText}
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {

    private final String TEXT = "text";
    private final String initialCollectorClass = "initialCollectorClass";

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String initialCollectorClass = parameters.get(this.initialCollectorClass);
        String text = parameters.get(TEXT);
        String eventName = parameters.get(EVENT);
        return new ClickClassByText(initialCollectorClass, text, eventName, expectHttpRequest);
    }
}
