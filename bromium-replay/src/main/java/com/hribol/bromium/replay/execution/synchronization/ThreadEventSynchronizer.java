package com.hribol.bromium.replay.execution.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class ThreadEventSynchronizer implements EventDispatcher {

    private Object lock;

    @Override
    public void awaitUntil(SynchronizationEvent synchronizationEvent, int timeoutInSeconds) throws InterruptedException {
        this.lock = new Object();

        synchronized (lock) {
            if (!synchronizationEvent.isAlreadySatisfied()) {
                synchronizationEvent.setLock(lock);
                System.out.println("Await event");
                System.out.println(Thread.currentThread().getName());
                lock.wait(timeoutInSeconds);
            }
        }
    }

    @Override
    public void signalizeEvent(SynchronizationEvent synchronizationEvent) {
        synchronized (lock) {
            System.out.println("Signalize event");
            lock.notify();
        }
    }

}
