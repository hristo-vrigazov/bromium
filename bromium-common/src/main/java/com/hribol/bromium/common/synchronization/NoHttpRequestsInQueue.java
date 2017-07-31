package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;

import static com.hribol.bromium.core.utils.Constants.NO_HTTP_REQUESTS_IN_QUEUE;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class NoHttpRequestsInQueue implements SynchronizationEvent {

    private ReplayingState replayingState;
    private EventSignalizer eventSignalizer;

    public NoHttpRequestsInQueue(ReplayingState replayingState, EventSignalizer eventSignalizer) {
        this.replayingState = replayingState;
        this.eventSignalizer = eventSignalizer;
    }

    @Override
    public String getName() {
        return NO_HTTP_REQUESTS_IN_QUEUE;
    }

    @Override
    public boolean isSatisfied() {
        return replayingState.httpRequestQueueIsEmpty();
    }

    @Override
    public void signalizeIsDone() {
        this.eventSignalizer.signalizeEvent(this);
    }
}
