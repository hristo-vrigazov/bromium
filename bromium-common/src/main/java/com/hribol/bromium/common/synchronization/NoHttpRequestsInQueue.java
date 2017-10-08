package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;

import static com.hribol.bromium.core.utils.Constants.NO_HTTP_REQUESTS_IN_QUEUE;

/**
 * Represent the event when there are no http requests we are currently
 * waiting for to be completed
 */
public class NoHttpRequestsInQueue extends SynchronizationEventNotifyingState {

    private ReplayingState replayingState;
    private EventSignalizer eventSignalizer;

    public NoHttpRequestsInQueue(ReplayingState replayingState, EventSignalizer eventSignalizer) {
        super(replayingState);
        this.replayingState = replayingState;
        this.eventSignalizer = eventSignalizer;
        this.replayingState.setSynchronizationEvent(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return NO_HTTP_REQUESTS_IN_QUEUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied() {
        return replayingState.httpRequestQueueIsEmpty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void signalizeIsDone() {
        this.eventSignalizer.signalizeEvent(this);
    }
}
