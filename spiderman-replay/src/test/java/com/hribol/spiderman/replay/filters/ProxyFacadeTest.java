package com.hribol.spiderman.replay.filters;

import org.junit.Test;

import java.net.URISyntaxException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anySet;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ProxyFacadeTest {

    @Test
    public void canGetFilters() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);

        assertNotNull(proxyFacade.getRequestFilter());
        assertNotNull(proxyFacade.getResponseFilter());
    }

    @Test
    public void doesNotWaitForPreconditionInitially() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);
        assertFalse(proxyFacade.waitsForPrecondition());
    }

    @Test
    public void waitsForConditionIfSet() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);
        proxyFacade.setWaitingEvent("blabla", new Object());
        assertTrue(proxyFacade.waitsForPrecondition());
    }

    @Test
    public void requestQueueIsEmptyInBeginning() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);
        assertTrue(proxyFacade.httpQueueIsEmpty());
        assertEquals(0, proxyFacade.getNumberOfRequestsInQueue());
    }

    @Test
    public void releasesCondition() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);
        proxyFacade.setWaitingEvent("blabla", new Object());
        assertTrue(proxyFacade.waitsForPrecondition());
        proxyFacade.signalizeEventIsDone();
        assertFalse(proxyFacade.waitsForPrecondition());
    }

    @Test
    public void waitsIfConditionIsNotSatisfied() throws URISyntaxException {
        String waitingEvent = "blabla";
        String baseURI = "http://tenniskafe.com";

        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        when(replayRequestFilter.waitsForPrecondition()).thenReturn(true);
        ReplayFiltersFactory replayFiltersFactory = mock(ReplayFiltersFactory.class);
        when(replayFiltersFactory.createReplayRequestFilter(any(), anyString(), anySet())).thenReturn(replayRequestFilter);

        ProxyFacade proxyFacade = new ProxyFacade(baseURI, replayFiltersFactory);
        proxyFacade.setWaitingEvent(waitingEvent, new Object());

        assertTrue(proxyFacade.waitsForPrecondition());
    }

    @Test
    public void doesNotWaitIfConditionIsSatisfied() throws URISyntaxException {
        String waitingEvent = "blabla";
        String baseURI = "http://tenniskafe.com";

        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        when(replayRequestFilter.isSatisfied(waitingEvent)).thenReturn(true);
        ReplayFiltersFactory replayFiltersFactory = mock(ReplayFiltersFactory.class);
        when(replayFiltersFactory.createReplayRequestFilter(any(), anyString(), anySet())).thenReturn(replayRequestFilter);

        ProxyFacade proxyFacade = new ProxyFacade(baseURI, replayFiltersFactory);
        proxyFacade.setWaitingEvent(waitingEvent, new Object());

        assertFalse(proxyFacade.waitsForPrecondition());
    }

}
