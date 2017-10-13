package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;

public interface StateConditionsUpdater {
    void update(ReplayingState replayingState, String event);
}
