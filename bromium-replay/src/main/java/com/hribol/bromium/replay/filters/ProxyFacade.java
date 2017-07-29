package com.hribol.bromium.replay.filters;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ProxyFacade implements ReplayFiltersFacade {
    private Set<HttpRequest> httpRequestQueue;

    private ReplayRequestFilter requestFilter;
    private ReplayResponseFilter responseFilter;
    private EventSynchronizer eventSynchronizer;

    public ProxyFacade(String baseURI, String injectionCode, EventSynchronizer eventSynchronizer) throws URISyntaxException {
        this(baseURI, injectionCode, eventSynchronizer, new ReplayFiltersFactory());
    }

    public ProxyFacade(String baseURI,
                       String injectionCode,
                       EventSynchronizer eventSynchronizer,
                       ReplayFiltersFactory replayFiltersFactory) throws URISyntaxException {
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.eventSynchronizer = eventSynchronizer;
        this.requestFilter = replayFiltersFactory.createReplayRequestFilter(baseURI, httpRequestQueue);
        this.responseFilter = replayFiltersFactory.createReplayResponseFilter(injectionCode, baseURI, httpRequestQueue);
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
    public EventSynchronizer getEventSynchronizer() {
        return eventSynchronizer;
    }

    @Override
    public boolean canAct() {
        return httpRequestQueue.isEmpty() && !requestFilter.isHttpLocked();
    }

}
