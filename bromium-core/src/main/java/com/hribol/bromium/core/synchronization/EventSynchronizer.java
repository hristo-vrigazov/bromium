package com.hribol.bromium.core.synchronization;

/**
 * Classes which implement this can await and signalize events.
 */
public interface EventSynchronizer extends EventAwaiter, EventSignalizer {
}
