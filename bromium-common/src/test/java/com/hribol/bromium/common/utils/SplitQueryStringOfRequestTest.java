package com.hribol.bromium.common.utils;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.08.17.
 */
public class SplitQueryStringOfRequestTest {

    @Test
    public void canSplitQuery() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.tenniskafe.com/query?key1=value1&key2=value2");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(url.toString());

        SplitQueryStringOfRequest splitQueryStringOfRequest = new SplitQueryStringOfRequest();
        Map<String, String> parameters = splitQueryStringOfRequest.convert(httpRequest);
        assertTrue(parameters.containsKey("key1"));
        assertEquals("value1", parameters.get("key1"));
        assertTrue(parameters.containsKey("key2"));
        assertEquals("value2", parameters.get("key2"));
    }

}
