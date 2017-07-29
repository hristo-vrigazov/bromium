package com.hribol.bromium.core.utils;

import com.hribol.bromium.core.TestScenarioSteps;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class ConfigurationUtilsTest {

    @Test
    public void canReadSteps() throws IOException {
        String filename = getClass().getResource("/testCase.json").getFile();

        TestScenarioSteps testCaseSteps = ConfigurationUtils.readSteps(filename);

        Map<String, String> firstStep = testCaseSteps.get(0);
        String firstEvent = firstStep.get("event");

        assertEquals("Load initial page", firstEvent);
    }

    @Test
    public void canSplitQueryUrl() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.tenniskafe.com/query?key1=value1&key2=value2");
        ConfigurationUtils configurationUtils = new ConfigurationUtils();
        Map<String, String> parameters = ConfigurationUtils.splitQuery(url);

        assertTrue(parameters.containsKey("key1"));
        assertEquals("value1", parameters.get("key1"));
        assertTrue(parameters.containsKey("key2"));
        assertEquals("value2", parameters.get("key2"));
    }
}
