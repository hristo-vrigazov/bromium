package com.hribol.bromium.replay.config.utils;

import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class UtilsTest {

    @Test
    public void isChangingRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getMethod()).thenReturn(HttpMethod.GET);

        assertFalse(Utils.isGETFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenRequestedTypeIsNotHTMLThenNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/json");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getMethod()).thenReturn(HttpMethod.GET);

        assertFalse(Utils.isGETFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenTheHostIsTheSameThenNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/json");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com/atp");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getMethod()).thenReturn(HttpMethod.GET);

        assertFalse(Utils.isGETFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenHostIsDifferentAndContentTypeIsNotHTPNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getMethod()).thenReturn(HttpMethod.GET);

        assertTrue(Utils.isGETFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void correctlyConvertsNanoSecondsToSeconds() {
        double expected = 0.123456789;
        long nanoseconds = 123456789;

        double actual = Utils.toSeconds(nanoseconds);
        assertEquals(expected, actual);
    }
}
