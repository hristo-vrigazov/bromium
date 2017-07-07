package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class TextOfElementFoundByCssSelectorToBeParserTest {

    @Test
    public void canCreateActionCorrectly() {
        String eventName = "eventName";
        boolean expectsHttp = false;
        String cssSelector = ".test";
        String text = "text";
        int timeout = 10;

        Map<String, String> parameters = new HashMap<>();
        parameters.put(EVENT, eventName);
        parameters.put(CSS_SELECTOR, cssSelector);
        parameters.put(TIMEOUT, String.valueOf(timeout));
        parameters.put(TEXT, text);

        WebDriverActionParameterParser parser = new TextOfElementFoundByCssSelectorToBeParser();

        WebDriverAction webDriverAction = parser.create(parameters, expectsHttp);

        assertEquals(eventName, webDriverAction.getName());
        assertEquals(expectsHttp, webDriverAction.expectsHttpRequest());
    }
}
