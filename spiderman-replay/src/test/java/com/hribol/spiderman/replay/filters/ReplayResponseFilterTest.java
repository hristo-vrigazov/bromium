package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ReplayResponseFilterTest {

    @Test
    public void replayResponseFilterRemovesIfWhiteListedURL() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        BooleanSupplier booleanSupplier = mock(BooleanSupplier.class);
        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestSet);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com/static/some.css");
        httpRequestSet.add(httpRequest);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        HttpResponse httpResponse = mock(HttpResponse.class);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        assertFalse(httpRequestSet.contains(httpRequest));
    }

    @Test
    public void replayResponseFilterDoesNotRemoveIfURLIsNotWhiteListed() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        BooleanSupplier booleanSupplier = mock(BooleanSupplier.class);
        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestSet);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com/static/some.css");
        httpRequestSet.add(httpRequest);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        HttpResponse httpResponse = mock(HttpResponse.class);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        assertTrue(httpRequestSet.contains(httpRequest));
    }
}
