package com.hribol.bromium.replay.execution.synchronization;

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
                lock.wait(timeoutInSeconds);
            }
        }
    }

    @Override
    public void signalizeEvent(SynchronizationEvent synchronizationEvent) {
        synchronized (lock) {
            lock.notify();
        }
    }

}
