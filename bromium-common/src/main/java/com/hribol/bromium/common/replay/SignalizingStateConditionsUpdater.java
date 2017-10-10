package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.StateConditionsUpdater;

/**
 * Created by hvrigazov on 10.10.17.
 */
public class SignalizingStateConditionsUpdater implements StateConditionsUpdater {
    @Override
    public void update(ReplayingState replayingState, String event) {
        replayingState.setConditionSatisfied(event);
        replayingState.signalizeIfSynchronizationEventIsSatisfied();
    }
}
