package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 04.06.17.
 */
public class NoHttpRequestsInQueueTest {

    private ReplayingState replayingState = mock(ReplayingState.class);
    private EventSignalizer eventSignalizer = mock(EventSignalizer.class);
    private String NO_HTTP_REQUESTS_IN_QUEUE = "NO_HTTP_REQUESTS_IN_QUEUE";

    @Test
    public void nameIsCorrect() {
        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayingState, eventSignalizer);

        assertEquals(NO_HTTP_REQUESTS_IN_QUEUE, noHttpRequestsInQueue.getName());
    }

    @Test
    public void delegatesToFilterWhenAskedIfCanAct() {
        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayingState, eventSignalizer);
        when(replayingState.httpRequestQueueIsEmpty()).thenReturn(true);
        assertTrue(noHttpRequestsInQueue.isSatisfied());
    }

    @Test
    public void delegatesToSignalizerEventWhenSignalizingEventIsDone() {
        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayingState, eventSignalizer);

        noHttpRequestsInQueue.signalizeIsDone();

        verify(eventSignalizer).signalizeEvent(noHttpRequestsInQueue);
    }
}
