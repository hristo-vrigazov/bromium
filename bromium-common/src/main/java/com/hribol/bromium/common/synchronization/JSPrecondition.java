package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;

/**
 * Created by hvrigazov on 05.06.17.
 */
public class JSPrecondition implements SynchronizationEvent {

    private String eventName;
    private ReplayRequestFilter replayRequestFilter;
    private EventSignalizer eventSignalizer;

    public JSPrecondition(String eventName, ReplayRequestFilter replayRequestFilter, EventSignalizer eventSignalizer) {
        this.eventName = eventName;
        this.replayRequestFilter = replayRequestFilter;
        this.eventSignalizer = eventSignalizer;
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean isSatisfied() {
        return replayRequestFilter.isSatisfied(eventName);
    }

    @Override
    public void signalizeIsDone() {
        eventSignalizer.signalizeEvent(this);
    }
}
