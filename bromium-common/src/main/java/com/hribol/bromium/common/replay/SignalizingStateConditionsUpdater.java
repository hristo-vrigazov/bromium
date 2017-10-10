package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.StateConditionsUpdater;

/**
 * Updates a condition by setting it to satisfied and signalizes if the current
 * synchronization event that we are waiting for is satisfied
 */
public class SignalizingStateConditionsUpdater implements StateConditionsUpdater {
    @Override
    public void update(ReplayingState replayingState, String event) {
        replayingState.setConditionSatisfied(event);
        replayingState.signalizeIfSynchronizationEventIsSatisfied();
    }
}
