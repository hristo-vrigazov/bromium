package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.replay.execution.synchronization.SignalizerEvent;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class NoHttpRequestsInQueue implements SynchronizationEvent {

    private ReplayResponseFilter replayResponseFilter;
    private SignalizerEvent signalizerEvent;

    public NoHttpRequestsInQueue(ReplayResponseFilter replayResponseFilter, SignalizerEvent signalizerEvent) {
        this.replayResponseFilter = replayResponseFilter;
        this.signalizerEvent = signalizerEvent;
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
        this.signalizerEvent.signalizeEvent(this);
    }
}