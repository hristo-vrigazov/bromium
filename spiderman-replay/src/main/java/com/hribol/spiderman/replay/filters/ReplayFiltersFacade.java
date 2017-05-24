package com.hribol.spiderman.replay.filters;

/**
 * Created by hvrigazov on 26.04.17.
 */
public interface ReplayFiltersFacade {

    ReplayRequestFilter getRequestFilter();

    ReplayResponseFilter getResponseFilter();

    boolean canAct();
}
