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

    ReplayRequestFilter getRequestFilter();

    ReplayResponseFilter getResponseFilter();

    boolean waitsForPrecondition();

    boolean canAct();

    void signalizeExecutionThreadWantsToAct();
}
