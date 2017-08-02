package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;

/**
 * Created by hvrigazov on 02.08.17.
 */
public abstract class SynchronizationEventNotifyingState implements SynchronizationEvent {

    public SynchronizationEventNotifyingState(ReplayingState replayingState) {
        replayingState.setSynchronizationEvent(this);
    }


}
