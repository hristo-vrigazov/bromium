package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ProxyFacade implements ReplayFiltersFacade {
    private Set<HttpRequest> httpRequestQueue;

    private ReplayRequestFilter requestFilter;
    private ReplayResponseFilter responseFilter;

    public ProxyFacade(String baseURI) throws URISyntaxException {
        this(baseURI, new ReplayFiltersFactory());
    }

    public ProxyFacade(String baseURI, ReplayFiltersFactory replayFiltersFactory) throws URISyntaxException {
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.requestFilter = replayFiltersFactory.createReplayRequestFilter(baseURI, httpRequestQueue);
        this.responseFilter = replayFiltersFactory.createReplayResponseFilter(baseURI, httpRequestQueue);
    }

    @Override
    public int getNumberOfRequestsInQueue() {
        return httpRequestQueue.size();
    }

    @Override
    public boolean httpQueueIsEmpty() {
        return httpRequestQueue.isEmpty();
    }

    @Override
    public ReplayRequestFilter getRequestFilter() {
        return requestFilter;
    }

    @Override
    public ReplayResponseFilter getResponseFilter() {
        return responseFilter;
    }

    @Override
    public boolean canAct() {
        return httpQueueIsEmpty() && !requestFilter.isHttpLocked();
    }

}
