package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;

/**
 * Created by hvrigazov on 05.06.17.
 */
public class JSPrecondition implements SynchronizationEvent {

    private String eventName;
    private EventSignalizer eventSignalizer;
    private ReplayingState replayingState;

    public JSPrecondition(String eventName,
                          EventSignalizer eventSignalizer,
                          ReplayingState replayingState) {
        this.eventName = eventName;
        this.eventSignalizer = eventSignalizer;
        this.replayingState = replayingState;
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean isSatisfied() {
        return replayingState.isSatisfied(eventName);
    }

    @Override
    public void signalizeIsDone() {
        eventSignalizer.signalizeEvent(this);
    }
}
