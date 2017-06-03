package com.hribol.bromium.replay.execution.synchronization;

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
    public boolean isAlreadySatisfied() {
        return replayResponseFilter.canAct();
    }

    @Override
    public void setLock(Object lock) {
        replayResponseFilter.setExecutionThreadLock(lock);
    }

    @Override
    public void signalizeIsDone() {
        System.out.println("Event is done");
        this.signalizerEvent.signalizeEvent(this);
    }
}
