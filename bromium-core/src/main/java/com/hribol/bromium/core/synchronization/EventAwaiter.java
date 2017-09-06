package com.hribol.bromium.core.synchronization;

import java.util.concurrent.TimeoutException;

/**
 * Classes which implement this interface can await for {@link SynchronizationEvent}
 */
public interface EventAwaiter {

    /**
     * Awaits until the synchronization event happens
     * @param synchronizationEvent - the synchronization event which should be awaited
     * @throws InterruptedException - thrown if interrupted while waiting
     * @throws TimeoutException - thrown if the await exceeds a timeout
     */
    void awaitUntil(SynchronizationEvent synchronizationEvent) throws InterruptedException, TimeoutException;
}
