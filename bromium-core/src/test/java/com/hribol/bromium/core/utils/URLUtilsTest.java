package com.hribol.bromium.core.utils;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class URLUtilsTest {

    @Test
    public void canSplitQueryUrl() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.tenniskafe.com/query?key1=value1&key2=value2");
        URLUtils URLUtils = new URLUtils();
        Map<String, String> parameters = URLUtils.splitQuery(url);

        assertTrue(parameters.containsKey("key1"));
        assertEquals("value1", parameters.get("key1"));
        assertTrue(parameters.containsKey("key2"));
        assertEquals("value2", parameters.get("key2"));
    }

    @Test
    public void canConstructQueryString() {
        Map<String, String> map = ImmutableMap.of("k1", "v1", "k2", "v2");
        String expected = "?k1=v1&k2=v2";
        String actual = URLUtils.toQueryString(map);
        assertEquals(expected, actual);
    }
}
