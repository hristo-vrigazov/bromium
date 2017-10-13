package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;

/**
 * Represents a synchronization event within the browser, i.e in the javascript code.
 * Example would be a precondition until an element with id "example" in the DOM is present
 */
public class JSPrecondition extends SynchronizationEventNotifyingState {

    private String eventName;
    private EventSignalizer eventSignalizer;
    private ReplayingState replayingState;

    public JSPrecondition(String eventName,
                          EventSignalizer eventSignalizer,
                          ReplayingState replayingState) {
        super(replayingState);
        this.eventName = eventName;
        this.eventSignalizer = eventSignalizer;
        this.replayingState = replayingState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return eventName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied() {
        return replayingState.isSatisfied(eventName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void signalizeIsDone() {
        eventSignalizer.signalizeEvent(this);
    }
}
