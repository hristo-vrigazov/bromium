package com.hribol.bromium.replay.execution.synchronization;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface SignalizerEvent {
    void signalizeEvent(SynchronizationEvent synchronizationEvent);
}
