package com.hribol.spiderman.replay.parsers;

import com.hribol.spiderman.replay.actions.WebDriverAction;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.CSS_SELECTOR;
import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;
import static com.hribol.spiderman.replay.config.utils.Constants.TIMEOUT;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ElementByCssToBeClickableParserTest {

    @Test
    public void canCreateActionCorrectly() {
        String eventName = "eventName";
        boolean expectsHttp = false;
        String cssSelector = ".test";
        int timeout = 10;

        Map<String, String> parameters = new HashMap<>();
        parameters.put(EVENT, eventName);
        parameters.put(CSS_SELECTOR, cssSelector);
        parameters.put(TIMEOUT, String.valueOf(timeout));

        WebDriverActionParameterParser parser = new ElementByCssToBeClickableParser();

        WebDriverAction webDriverAction = parser.create(parameters, expectsHttp);

        assertEquals(eventName, webDriverAction.getName());
        assertEquals(expectsHttp, webDriverAction.expectsHttpRequest());
    }
}
