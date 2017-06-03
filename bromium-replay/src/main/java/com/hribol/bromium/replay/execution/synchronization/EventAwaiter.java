package com.hribol.bromium.replay.execution.synchronization;

import java.util.concurrent.TimeoutException;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface EventAwaiter {
    void awaitUntil(SynchronizationEvent synchronizationEvent, int timeout) throws InterruptedException, TimeoutException;
}
