package com.hribol.bromium.core.synchronization;

import java.util.concurrent.TimeoutException;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface EventAwaiter {
    void awaitUntil(SynchronizationEvent synchronizationEvent) throws InterruptedException, TimeoutException;
}
