package com.hribol.spiderman.replay.filters;

import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;

/**
 * Created by hvrigazov on 26.04.17.
 */
public interface ReplayFiltersFacade {
    int getNumberOfRequestsInQueue();

    void setLock(Boolean value);

    Boolean isLocked();

    boolean httpQueueIsEmpty();

    RequestFilter getRequestFilter();

    ResponseFilter getResponseFilter();

    boolean waitsForPrecondition();

    boolean setWaitingEvent(String event, Object lock);

    boolean canAct();

    void signalizeEventIsDone();

    void signalizeExecutionThreadWantsToAct();
}
