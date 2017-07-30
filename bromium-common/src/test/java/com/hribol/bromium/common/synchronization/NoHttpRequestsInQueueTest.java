//package com.hribol.bromium.common.synchronization;
//
//import com.hribol.bromium.core.synchronization.EventSignalizer;
//import com.hribol.bromium.replay.filters.ReplayResponseFilter;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
///**
// * Created by hvrigazov on 04.06.17.
// */
//public class NoHttpRequestsInQueueTest {
//
//    private ReplayResponseFilter replayResponseFilter = Mockito.mock(ReplayResponseFilter.class);
//    private EventSignalizer eventSignalizer = Mockito.mock(EventSignalizer.class);
//    private String NO_HTTP_REQUESTS_IN_QUEUE = "NO_HTTP_REQUESTS_IN_QUEUE";
//
//    @Test
//    public void nameIsCorrect() {
//        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayResponseFilter, eventSignalizer);
//
//        assertEquals(NO_HTTP_REQUESTS_IN_QUEUE, noHttpRequestsInQueue.getName());
//    }
//
//    @Test
//    public void delegatesToFilterWhenAskedIfCanAct() {
//        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayResponseFilter, eventSignalizer);
//        when(replayResponseFilter.httpRequestQueueIsEmpty()).thenReturn(true);
//        assertTrue(noHttpRequestsInQueue.isSatisfied());
//    }
//
//    @Test
//    public void delegatesToSignalizerEventWhenSignalizingEventIsDone() {
//        NoHttpRequestsInQueue noHttpRequestsInQueue = new NoHttpRequestsInQueue(replayResponseFilter, eventSignalizer);
//
//        noHttpRequestsInQueue.signalizeIsDone();
//
//        verify(eventSignalizer).signalizeEvent(noHttpRequestsInQueue);
//    }
//}
