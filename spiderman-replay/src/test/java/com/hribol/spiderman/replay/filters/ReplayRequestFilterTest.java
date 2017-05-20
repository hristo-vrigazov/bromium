package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ReplayRequestFilterTest {

    @Test
    public void replayRequestFilterAddsToQueueIfWhiteListedAndUnlocks() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com/static/some.css");

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertTrue(httpRequestSet.contains(httpRequest));
        verify(lockCallback).setLock(false);
    }

    @Test
    public void replayRequestFilterDoesNotAddToQueueIfNotWhiteListedAndUnlocks() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com/static/some.css");

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertFalse(httpRequestSet.contains(httpRequest));
        verify(lockCallback).setLock(false);
    }
}
