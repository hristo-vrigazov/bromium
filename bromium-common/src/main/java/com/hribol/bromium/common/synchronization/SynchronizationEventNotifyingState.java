package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;

/**
 * Represents a {@link SynchronizationEvent} which notifies the current {@link ReplayingState}
 */
public abstract class SynchronizationEventNotifyingState implements SynchronizationEvent {

    public SynchronizationEventNotifyingState(ReplayingState replayingState) {
        replayingState.setSynchronizationEvent(this);
    }


}
