package com.hribol.bromium.replay.execution.synchronization;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface EventAwaiter {
    void awaitUntil(SynchronizationEvent synchronizationEvent, int timeout) throws InterruptedException;
}
