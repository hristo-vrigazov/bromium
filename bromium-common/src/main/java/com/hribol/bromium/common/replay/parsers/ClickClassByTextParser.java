package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickClassByText;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;

/**
 * A parser for {@link ClickClassByText}
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {

    public final static String INITIAL_COLLECTOR_CLASS_JS_ALIAS = "initialCollectorClass";
    public static final String INITIAL_COLLECTOR_CLASS = "class";

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String initialCollectorClass = parameters.get(INITIAL_COLLECTOR_CLASS);
        String text = parameters.get(TEXT);
        return new ClickClassByText(initialCollectorClass, text, expectHttpRequest);
    }
}
