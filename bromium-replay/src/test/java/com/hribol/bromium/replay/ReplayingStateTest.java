package com.hribol.bromium.replay;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.net.URI;

import static com.hribol.bromium.core.utils.Constants.NO_HTTP_REQUESTS_IN_QUEUE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 31.07.17.
 */
public class ReplayingStateTest {

    private URI baseURI = URI.create("http://something.com");
    private String exampleURIFromTheSameHost = "http://something.com/ico.js";
    private String exampleURIFromAnotherHost = "http://google.com";
    private EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
    private String exampleCondition = "exampleCondition";


    @Test
    public void addingEventToTheSatisfiedListMarksItAsSatisfied() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        replayingState.setConditionSatisfied(exampleCondition);
        assertTrue(replayingState.isSatisfied(exampleCondition));
    }

    @Test
    public void ifConditionIsSetToNotSatisfiedThenItIsNotMarked() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        replayingState.setConditionSatisfied(exampleCondition);
        replayingState.setConditionNotSatisfied(exampleCondition);
        assertFalse(replayingState.isSatisfied(exampleCondition));
    }

    @Test
    public void signalizesIfEventIsSatisfiedAndCheckWasTriggered() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(exampleCondition);
        replayingState.setSynchronizationEvent(synchronizationEvent);
        replayingState.setConditionSatisfied(exampleCondition);
        replayingState.signalizeIfSynchronizationEventIsSatisfied();
        verify(synchronizationEvent).signalizeIsDone();
    }

    @Test
    public void doesNotSignalizeIfEventIsSatisfiedAndCheckWasTriggered() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(exampleCondition);
        replayingState.setSynchronizationEvent(synchronizationEvent);
        replayingState.signalizeIfSynchronizationEventIsSatisfied();
        verify(synchronizationEvent, never()).signalizeIsDone();
    }

    @Test
    public void doesNotSignalizeIfEventIsNotSet() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(exampleCondition);
        replayingState.signalizeIfSynchronizationEventIsSatisfied();
        verify(synchronizationEvent, never()).signalizeIsDone();
    }

    @Test
    public void lockLocks() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        replayingState.setHttpLock(true);
        assertTrue(replayingState.isHttpLocked());
    }

    @Test
    public void eventSynchronizerIsExposed() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        assertEquals(eventSynchronizer, replayingState.getEventSynchronizer());
    }

    @Test
    public void httpQueueIsEmptyInTheBeginningButNotWhenWeAddRequestInWhiteList() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        assertTrue(replayingState.httpRequestQueueIsEmpty());
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(exampleURIFromTheSameHost);
        replayingState.addHttpRequestToQueue(httpRequest);
        assertFalse(replayingState.httpRequestQueueIsEmpty());
    }

    @Test
    public void httpQueueIsEmptyInTheBeginningAndRemainsEmptyIfURIIsNotInWhiteList() {
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        assertTrue(replayingState.httpRequestQueueIsEmpty());
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(exampleURIFromAnotherHost);
        replayingState.addHttpRequestToQueue(httpRequest);
        assertTrue(replayingState.httpRequestQueueIsEmpty());
    }

    @Test
    public void ifHttpQueueIsNotEmptyItDoesNotTrigger() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(exampleURIFromTheSameHost);
        replayingState.addHttpRequestToQueue(httpRequest);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(NO_HTTP_REQUESTS_IN_QUEUE);
        replayingState.setSynchronizationEvent(synchronizationEvent);

        // Act
        replayingState.signalizeIfNoHttpQueriesInQueue();

        // Assert
        verify(synchronizationEvent, never()).signalizeIsDone();
    }

    @Test
    public void ifHttpQueueIsEmptyAndSynchronizationEventIsSetItDoesTrigger() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(NO_HTTP_REQUESTS_IN_QUEUE);
        replayingState.setSynchronizationEvent(synchronizationEvent);

        // Act
        replayingState.signalizeIfNoHttpQueriesInQueue();

        // Assert
        verify(synchronizationEvent).signalizeIsDone();
    }

    @Test
    public void ifHttpQueueIsEmptyAndSynchronizationEventIsNotEmptyRequestsItDoesNotTrigger() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn("something");
        replayingState.setSynchronizationEvent(synchronizationEvent);

        // Act
        replayingState.signalizeIfNoHttpQueriesInQueue();

        // Assert
        verify(synchronizationEvent, never()).signalizeIsDone();
    }

    @Test
    public void ifEventIsNotSetThenItDoesNotGetInvokedEventIfQueueIsEmpty() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.getName()).thenReturn(NO_HTTP_REQUESTS_IN_QUEUE);

        // Act
        replayingState.signalizeIfNoHttpQueriesInQueue();

        // Assert
        verify(synchronizationEvent, never()).signalizeIsDone();
    }

    @Test
    public void removingARequestLeadsToEmptyQueue() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(exampleURIFromTheSameHost);

        // Act
        replayingState.addHttpRequestToQueue(httpRequest);
        replayingState.removeHttpRequestFromQueue(httpRequest);

        // Assert
        assertTrue(replayingState.httpRequestQueueIsEmpty());
    }

    @Test
    public void whenRemoveFromDifferentHostQueueIsNotEmpty() {
        // Arrange
        ReplayingState replayingState = new ReplayingState(baseURI, eventSynchronizer);
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(exampleURIFromTheSameHost);

        HttpRequest httpRequestFromDifferentHost = mock(HttpRequest.class);
        when(httpRequestFromDifferentHost.getUri()).thenReturn(exampleURIFromAnotherHost);
        // Act
        replayingState.addHttpRequestToQueue(httpRequest);
        replayingState.removeHttpRequestFromQueue(httpRequestFromDifferentHost);

        // Assert
        assertFalse(replayingState.httpRequestQueueIsEmpty());
    }
}
