package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 23.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayResponseFilter.class,
        Object.class
})
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

    @Test
    public void ifAllowedToActItDoes() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        BooleanSupplier booleanSupplier = mock(BooleanSupplier.class);
        when(booleanSupplier.getAsBoolean()).thenReturn(true);
        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestSet);

        assertTrue(replayResponseFilter.setExecutionThreadLock(new Object()));
    }

    @Test
    public void ifThereIsOneRequestInQueueAndExecutionLocksWhenTheRequestIsAnsweredNotifyIsCalled() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(baseURI);
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        httpRequestSet.add(httpRequest);
        BooleanSupplier booleanSupplier = mock(BooleanSupplier.class);
        when(booleanSupplier.getAsBoolean()).thenReturn(false, true);
        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestSet);

        Object object = PowerMockito.mock(Object.class);
        doNothing().when(object).notify();

        assertFalse(replayResponseFilter.setExecutionThreadLock(object));

        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(object).notify();
    }

    @Test
    public void ifThereIsOneRequestInQueueWhenTheRequestIsAnsweredNotifyIsNotCalled() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(baseURI);
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        httpRequestSet.add(httpRequest);
        BooleanSupplier booleanSupplier = mock(BooleanSupplier.class);
        when(booleanSupplier.getAsBoolean()).thenReturn(true);
        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestSet);

        Object object = PowerMockito.mock(Object.class);
        doNothing().when(object).notify();

        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(object, never()).notify();
    }

}
