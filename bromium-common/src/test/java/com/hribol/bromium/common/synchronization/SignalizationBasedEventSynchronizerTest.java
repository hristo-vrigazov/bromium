package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 04.06.17.
 */
public class SignalizationBasedEventSynchronizerTest {

    private final static Logger logger = LoggerFactory.getLogger(SignalizationBasedEventSynchronizerTest.class);

    private int timeout = 2;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void awaitForEventDoesNotLockTheThreadIfEventIsAlreadySatisfied() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(true);
        Lock lock = mock(Lock.class);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(timeout, lock);
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent);

        verify(lock, never()).lock();
    }

    @Test
    public void exceptionIsThrownAndEventIsCleanedUpIfAwaitTimesOut() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(false);

        Condition condition = mock(Condition.class);
        // condition#await returns false if time was exceeded
        when(condition.await(timeout, TimeUnit.SECONDS)).thenReturn(false);
        Lock lock = mock(Lock.class);
        when(lock.newCondition()).thenReturn(condition);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(timeout, lock);

        expectedException.expect(TimeoutException.class);
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent);
    }

    @Test
    public void ifEventIsSignalizedThenLockIsUnlocked() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(false);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(timeout);

        Thread signalizingThread = new Thread(new SignalizingRunnable(signalizationBasedEventSynchronizer, synchronizationEvent));

        signalizingThread.start();
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent);
        signalizingThread.join();
    }

    @Test
    public void ifSignalizationEventIsNotFoundThenItIsNotLocked() {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(false);
        Lock lock = mock(Lock.class);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(timeout, lock);

        signalizationBasedEventSynchronizer.signalizeEvent(synchronizationEvent);

        verify(lock).unlock();
    }

    @Test
    public void ifIllegalStateExceptionIsThrownIsIsLocked() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(false);

        Condition condition = mock(Condition.class);
        doAnswer(invocationOnMock -> {
            Thread.sleep(2000);
            return false;
        }).when(condition).await(timeout, TimeUnit.SECONDS);
        Lock lock = mock(Lock.class);
        when(lock.newCondition()).thenReturn(condition);
        doNothing().doThrow(new IllegalMonitorStateException()).when(lock).lock();

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(timeout, lock);

        Thread signalizingThread = new Thread(new SignalizingRunnable(signalizationBasedEventSynchronizer, synchronizationEvent));

        expectedException.expect(TimeoutException.class);
        signalizingThread.start();
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent);
        signalizingThread.join();
    }

    private static class SignalizingRunnable implements Runnable {

        private EventSynchronizer eventSynchronizer;
        private SynchronizationEvent synchronizationEvent;

        public SignalizingRunnable(EventSynchronizer eventSynchronizer, SynchronizationEvent synchronizationEvent) {
            this.eventSynchronizer = eventSynchronizer;
            this.synchronizationEvent = synchronizationEvent;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
            eventSynchronizer.signalizeEvent(synchronizationEvent);
        }
    }
}
