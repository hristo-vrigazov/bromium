package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class NoHttpRequestsInQueue implements SynchronizationEvent {

    private ReplayResponseFilter replayResponseFilter;
    private EventSignalizer eventSignalizer;

    public NoHttpRequestsInQueue(ReplayResponseFilter replayResponseFilter, EventSignalizer eventSignalizer) {
        this.replayResponseFilter = replayResponseFilter;
        this.eventSignalizer = eventSignalizer;
    }

    @Override
    public String getName() {
        return "NO_HTTP_REQUESTS_IN_QUEUE";
    }

    @Override
    public boolean isSatisfied() {
        return replayResponseFilter.httpRequestQueueIsEmpty();
    }

    @Override
    public void signalizeIsDone() {
        this.eventSignalizer.signalizeEvent(this);
    }
}
