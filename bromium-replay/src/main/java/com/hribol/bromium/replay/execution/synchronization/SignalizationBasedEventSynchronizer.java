package com.hribol.bromium.replay.execution.synchronization;

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

    public SignalizationBasedEventSynchronizer() {
        this(new ReentrantLock());
    }

    public SignalizationBasedEventSynchronizer(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void awaitUntil(SynchronizationEvent synchronizationEvent, int timeoutInSeconds) throws InterruptedException, TimeoutException {
        if (synchronizationEvent.isAlreadySatisfied()) {
            return;
        }

        lock.lock();

        Condition condition = lock.newCondition();
        eventConditionMap.put(synchronizationEvent, condition);

        boolean timedOut = !condition.await(timeoutInSeconds, TimeUnit.SECONDS);

        lock.unlock();

        if (timedOut) {
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
