package com.hribol.bromium.core.synchronization;

/**
 * Represents a synchronization event which can be used by
 * {@link EventAwaiter} and {@link EventSignalizer}
 */
public interface SynchronizationEvent {

    /**
     * The name of the synchronization event
     * @return The name of the synchronization event
     */
    String getName();

    /**
     * Indicates whether the synchronization event has already been satisfied
     * @return whether the synchronization event has already been satisfied
     */
    boolean isSatisfied();

    /**
     * Signalizes that the synchronization event has happened.
     */
    void signalizeIsDone();
}
