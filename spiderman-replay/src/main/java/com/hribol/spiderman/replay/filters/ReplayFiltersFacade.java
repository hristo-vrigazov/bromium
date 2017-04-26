package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ReplayFiltersFacade {
    private Boolean lock;
    private final String baseURI;
    private Set<HttpRequest> httpRequestQueue;

    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    public ReplayFiltersFacade(String baseURI) throws URISyntaxException {
        this.baseURI = baseURI;
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.requestFilter = new ReplayRequestFilter(this::setLock, baseURI, httpRequestQueue);
        this.responseFilter = new ReplayResponseFilter(baseURI, httpRequestQueue);
    }

    public int getNumberOfRequestsInQueue() {
        return httpRequestQueue.size();
    }

    public void setLock(Boolean value) {
        this.lock = value;
    }

    public Boolean isLocked() {
        return lock;
    }

    public boolean hasNoHttpQueriesInQueue() {
        return httpRequestQueue.isEmpty();
    }

    public RequestFilter getRequestFilter() {
        return requestFilter;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }
}
