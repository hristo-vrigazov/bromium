package com.hribol.bromium.core.synchronization;

/**
 * Classes that implement this interface can signalize that a given {@link SynchronizationEvent}
 * has happened
 */
public interface EventSignalizer {

    /**
     * Signalizes that event has happened
     * @param synchronizationEvent - the event which is signalized
     */
    void signalizeEvent(SynchronizationEvent synchronizationEvent);
}
