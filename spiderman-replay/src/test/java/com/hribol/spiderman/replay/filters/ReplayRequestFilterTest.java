package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import com.hribol.spiderman.replay.actions.conditions.javascript.ActionWithJSPreconditionBase;
import io.netty.handler.codec.http.HttpRequest;
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

import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_SATISFIED_URL;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 23.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayRequestFilter.class,
        Object.class,
        ReplayFiltersFacade.class,
})
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

    @Test
    public void ifEventIsSubmittedAsSatisfiedItIsMarked() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        String event = "event";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        assertFalse(replayRequestFilter.isSatisfied(event));

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertTrue(replayRequestFilter.isSatisfied(event));
    }

    @Test
    public void ifEventIsSubmittedAsNotSatisfiedItIsMarked() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        String event = "event";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        assertFalse(replayRequestFilter.isSatisfied(event));

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertTrue(replayRequestFilter.isSatisfied(event));

        when(httpRequest.getUri()).thenReturn(CONDITION_NOT_SATISFIED_URL + "?" + event);
        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertFalse(replayRequestFilter.isSatisfied(event));
    }

    @Test
    public void malformedURLForConditionSatisfied() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        String event = "event";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("h" +CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        assertFalse(replayRequestFilter.isSatisfied(event));

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertFalse(replayRequestFilter.isSatisfied(event));
    }

    @Test
    public void malformedURLForConditionNotSatisfied() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);
        String event = "event";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("hs" + CONDITION_NOT_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        assertFalse(replayRequestFilter.isSatisfied(event));

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        assertFalse(replayRequestFilter.isSatisfied(event));
    }

    @Test
    public void ifWaitingForEventWhenConditionIsSatisfiedTheThreadIsNotified() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        String event = "jsEvent";
        Object lock = PowerMockito.mock(Object.class);

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        replayRequestFilter.setWaitingEvent(event, lock);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        verify(lock).notify();
    }

    @Test
    public void ifWaitingForEventWhenConditionIsSatisfiedTheThreadIsNotNotifiedIfDifferentEventIsSubmitted() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        String event = "jsEvent";
        String otherEvent = "otherEvent";
        Object lock = PowerMockito.mock(Object.class);

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        replayRequestFilter.setWaitingEvent(otherEvent, lock);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);

        verify(lock, never()).notify();
    }

    @Test
    public void ifWaitingForEventWhenConditionIsSatisfiedTheThreadIsNotifiedIfNotNullLockObjectIsSupplied() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        String event = "jsEvent";
        Object lock = null;

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);

        replayRequestFilter.setWaitingEvent(event, lock);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(CONDITION_SATISFIED_URL + "?" + event);

        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
    }

    @Test
    public void waitsForPreconditionIfTheConditionIsYetToBeSatisfied() throws URISyntaxException {
        LockCallback lockCallback = spy(LockCallback.class);
        String baseURI = "http://tenniskafe.com";
        Set<HttpRequest> httpRequestSet = new HashSet<>();
        String event = "jsEvent";
        Object lock = mock(Object.class);

        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(lockCallback, baseURI, httpRequestSet);
        assertFalse(replayRequestFilter.waitsForPrecondition());
        replayRequestFilter.setWaitingEvent(event, lock);
        assertTrue(replayRequestFilter.waitsForPrecondition());
    }

}
