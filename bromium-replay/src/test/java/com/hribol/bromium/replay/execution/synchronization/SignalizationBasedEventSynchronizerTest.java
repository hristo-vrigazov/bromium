package com.hribol.bromium.replay.execution.synchronization;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 04.06.17.
 */
public class SignalizationBasedEventSynchronizerTest {

    private int timeout = 2;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void awaitForEventDoesNotLockTheThreadIfEventIsAlreadySatisfied() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(true);
        Lock lock = mock(Lock.class);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(lock);
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent, timeout);

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

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer(lock);

        expectedException.expect(TimeoutException.class);
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent, timeout);
    }

    @Test
    public void ifEventIsSignalizedThenLockIsUnlocked() throws TimeoutException, InterruptedException {
        SynchronizationEvent synchronizationEvent = mock(SynchronizationEvent.class);
        when(synchronizationEvent.isSatisfied()).thenReturn(false);

        SignalizationBasedEventSynchronizer signalizationBasedEventSynchronizer = new SignalizationBasedEventSynchronizer();

        Thread signalizingThread = new Thread(() -> {
            try {
                // simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            signalizationBasedEventSynchronizer.signalizeEvent(synchronizationEvent);
        });
        signalizingThread.start();
        signalizationBasedEventSynchronizer.awaitUntil(synchronizationEvent, timeout);
        signalizingThread.join();
    }

}
