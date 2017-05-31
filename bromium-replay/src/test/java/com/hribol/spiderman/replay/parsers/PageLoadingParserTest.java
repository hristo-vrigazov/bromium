package com.hribol.spiderman.replay.parsers;

import com.hribol.spiderman.replay.actions.WebDriverAction;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;
import static com.hribol.spiderman.replay.config.utils.Constants.URL;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by hvrigazov on 15.05.17.
 */
public class PageLoadingParserTest {

    @Test
    public void canCreateImageIfMapIsCorrect() {
        String baseURL = "http://tenniskafe.com";
        boolean expectsHttp = false;

        String eventName = "EVENT";
        String url = "/index.html";
        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put(EVENT, eventName);
        testCaseStep.put(URL, url);

        PageLoadingParser pageLoadingParser = new PageLoadingParser(baseURL);

        WebDriverAction action = pageLoadingParser.create(testCaseStep, expectsHttp);

        assertEquals(eventName, action.getName());
        assertEquals(true, action.expectsHttpRequest());
    }
}
