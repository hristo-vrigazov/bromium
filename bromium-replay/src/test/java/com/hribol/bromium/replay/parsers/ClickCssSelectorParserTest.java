package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.replay.config.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 07.05.17.
 */
public class ClickCssSelectorParserTest {

    @Test
    public void correctlyParsesTheMap() {
        Map<String, String> map = new HashMap<>();
        String eventName = "SOME_IMPORTANT_EVENT";
        String cssSelector = ".test";
        boolean expectHttpRequest = true;
        map.put(EVENT, eventName);
        map.put("cssSelector", cssSelector);

        ClickCssSelectorParser clickCssSelectorParser = new ClickCssSelectorParser();
        WebDriverAction webDriverAction = clickCssSelectorParser.create(map, expectHttpRequest);
        assertNotNull(webDriverAction);
        assertEquals(webDriverAction.getName(), eventName);
        assertEquals(webDriverAction.expectsHttpRequest(), expectHttpRequest);
    }
}
