package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A class which synchronizes events by signalizing. This is the opposite of a polling-based approach.
 */
public class SignalizationBasedEventSynchronizer implements EventSynchronizer {

    private final static Logger logger = LoggerFactory.getLogger(SignalizationBasedEventSynchronizer.class);

    private Lock lock;
    private Map<SynchronizationEvent, Condition> eventConditionMap = new ConcurrentHashMap<>();
    private int timeoutInSeconds;

    public SignalizationBasedEventSynchronizer(int timeoutInSeconds) {
        this(timeoutInSeconds, new ReentrantLock());
    }

    public SignalizationBasedEventSynchronizer(int timeoutInSeconds, Lock lock) {
        this.timeoutInSeconds = timeoutInSeconds;
        this.lock = lock;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void awaitUntil(SynchronizationEvent synchronizationEvent) throws InterruptedException, TimeoutException {
        logger.debug("Before await " + synchronizationEvent.isSatisfied());
        if (synchronizationEvent.isSatisfied()) {
            return;
        }

        try {
            lock.lock();

            Condition condition = lock.newCondition();
            eventConditionMap.put(synchronizationEvent, condition);

            logger.debug("When calling await " + synchronizationEvent.isSatisfied());
            boolean timedOut = !condition.await(timeoutInSeconds, TimeUnit.SECONDS);

            if (timedOut) {
                logger.debug("After timeout " + synchronizationEvent.isSatisfied());
                logger.error("Condition {} timed out! ", synchronizationEvent.getName());
                throw new TimeoutException("The synchronization event " + synchronizationEvent.getName() + " was not satisfied in the specified time");
            }
        } finally {
            lock.unlock();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void signalizeEvent(SynchronizationEvent synchronizationEvent) {
        try {
            lock.lock();
            if (eventConditionMap.containsKey(synchronizationEvent)) {
                eventConditionMap.get(synchronizationEvent).signal();
                eventConditionMap.remove(synchronizationEvent);
            }
        } catch (Exception e) {
            logger.error("Exception while trying to signalize event " + synchronizationEvent.getName(), e);
        } finally {
            lock.unlock();
        }
    }

}
