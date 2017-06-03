package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.execution.synchronization.EventDispatcher;
import com.hribol.bromium.replay.execution.synchronization.SignalizerEvent;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
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

    public ProxyFacade(String baseURI, String injectionCode) throws URISyntaxException {
        this(baseURI, injectionCode, new ReplayFiltersFactory());
    }

    public ProxyFacade(String baseURI, String injectionCode, ReplayFiltersFactory replayFiltersFactory) throws URISyntaxException {
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.requestFilter = replayFiltersFactory.createReplayRequestFilter(baseURI, httpRequestQueue);
        this.responseFilter = replayFiltersFactory.createReplayResponseFilter(this::canAct, injectionCode, baseURI, httpRequestQueue);
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
        return httpRequestQueue.isEmpty() && !requestFilter.isHttpLocked();
    }

}
