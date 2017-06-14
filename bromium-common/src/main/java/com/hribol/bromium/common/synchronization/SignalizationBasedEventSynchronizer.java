package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class SignalizationBasedEventSynchronizer implements EventSynchronizer {

    private Lock lock;
    private Map<SynchronizationEvent, Condition> eventConditionMap = new HashMap<>();
    private int timeoutInSeconds;

    public SignalizationBasedEventSynchronizer(int timeoutInSeconds) {
        this(timeoutInSeconds, new ReentrantLock());
    }

    public SignalizationBasedEventSynchronizer(int timeoutInSeconds, Lock lock) {
        this.timeoutInSeconds = timeoutInSeconds;
        this.lock = lock;
    }

    @Override
    public void awaitUntil(SynchronizationEvent synchronizationEvent) throws InterruptedException, TimeoutException {
        System.out.println("Before await " + synchronizationEvent.isSatisfied());
        if (synchronizationEvent.isSatisfied()) {
            return;
        }

        lock.lock();

        Condition condition = lock.newCondition();
        eventConditionMap.put(synchronizationEvent, condition);

        System.out.println("When calling await " + synchronizationEvent.isSatisfied());
        boolean timedOut = !condition.await(timeoutInSeconds, TimeUnit.SECONDS);

        lock.unlock();

        if (timedOut) {
            System.out.println("After timeout " + synchronizationEvent.isSatisfied());
            throw new TimeoutException("The synchronization event " + synchronizationEvent.getName() + " was not satisfied in the specified time");
        }

    }

    @Override
    public void signalizeEvent(SynchronizationEvent synchronizationEvent) {
        try {
            if (eventConditionMap.containsKey(synchronizationEvent)) {
                lock.lock();
                eventConditionMap.get(synchronizationEvent).signal();
                eventConditionMap.remove(synchronizationEvent);
                lock.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
