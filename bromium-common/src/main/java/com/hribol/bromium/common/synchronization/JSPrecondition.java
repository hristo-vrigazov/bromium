package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.replay.execution.synchronization.SignalizerEvent;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;

/**
 * Created by hvrigazov on 05.06.17.
 */
public class JSPrecondition implements SynchronizationEvent {

    private String eventName;
    private ReplayRequestFilter replayRequestFilter;
    private SignalizerEvent signalizerEvent;

    public JSPrecondition(String eventName, ReplayRequestFilter replayRequestFilter, SignalizerEvent signalizerEvent) {
        this.eventName = eventName;
        this.replayRequestFilter = replayRequestFilter;
        this.signalizerEvent = signalizerEvent;
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
        signalizerEvent.signalizeEvent(this);
    }
}
