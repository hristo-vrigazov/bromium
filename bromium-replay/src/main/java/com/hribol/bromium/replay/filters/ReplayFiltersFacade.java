package com.hribol.bromium.replay.filters;

import com.hribol.bromium.core.synchronization.EventSynchronizer;

/**
 * Created by hvrigazov on 26.04.17.
 */
public interface ReplayFiltersFacade {

    ReplayRequestFilter getRequestFilter();

    ReplayResponseFilter getResponseFilter();

    EventSynchronizer getEventSynchronizer();

    boolean canAct();
}
