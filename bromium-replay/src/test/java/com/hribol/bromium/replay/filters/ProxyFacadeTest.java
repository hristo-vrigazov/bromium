package com.hribol.bromium.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anySet;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ProxyFacadeTest {

    @Test
    public void canGetFilters() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI, "");

        assertNotNull(proxyFacade.getRequestFilter());
        assertNotNull(proxyFacade.getResponseFilter());
    }

    @Test
    public void requestQueueIsEmptyInBeginning() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI, "");
        assertTrue(proxyFacade.canAct());
    }

    @Test
    public void ifHttpQueueIsEmptyAndIsHttpLockedThenCannotAct() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        HttpRequest httpRequest = mock(HttpRequest.class);
        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        when(replayRequestFilter.isHttpLocked()).thenReturn(true);
        ReplayFiltersFactory replayFiltersFactory = mock(ReplayFiltersFactory.class);
        when(replayFiltersFactory.createReplayRequestFilter(eq(baseURI), anySet())).thenReturn(replayRequestFilter);
        ProxyFacade proxyFacade = new ProxyFacade(baseURI, "", replayFiltersFactory);
        assertFalse(proxyFacade.canAct());
    }

    @Test
    public void ifHttpQueueIsNotEmptyAndIsNotHttpLockedThenCannotAct() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        ReplayFiltersFactory replayFiltersFactory = mock(ReplayFiltersFactory.class);
        ProxyWhenCreatingRequestFilter proxyWhenCreatingRequestFilter = new ProxyWhenCreatingRequestFilter(replayRequestFilter);
        doAnswer(proxyWhenCreatingRequestFilter).when(replayFiltersFactory).createReplayRequestFilter(eq(baseURI), anySet());
        ProxyFacade proxyFacade = new ProxyFacade(baseURI, "", replayFiltersFactory);
        proxyWhenCreatingRequestFilter.addMockedRequest();
        assertFalse(proxyFacade.canAct());
    }

    private static class ProxyWhenCreatingRequestFilter implements Answer {

        private ReplayRequestFilter replayRequestFilter;
        private Set<HttpRequest> httpRequests;

        public ProxyWhenCreatingRequestFilter(ReplayRequestFilter replayRequestFilter) {
            this.replayRequestFilter = replayRequestFilter;
        }

        @Override
        public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
            httpRequests = (Set<HttpRequest>) invocationOnMock.getArguments()[1];
            return replayRequestFilter;
        }

        public void addMockedRequest() {
            httpRequests.add(mock(HttpRequest.class));
        }
    }
}
