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
public class ProxyFacade implements ReplayFiltersFacade {
    private Boolean lock;
    private Set<HttpRequest> httpRequestQueue;

    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    public ProxyFacade(String baseURI) throws URISyntaxException {
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.requestFilter = new ReplayRequestFilter(this::setLock, baseURI, httpRequestQueue);
        this.responseFilter = new ReplayResponseFilter(baseURI, httpRequestQueue);
    }

    @Override
    public int getNumberOfRequestsInQueue() {
        return httpRequestQueue.size();
    }

    @Override
    public void setLock(Boolean value) {
        this.lock = value;
    }

    @Override
    public Boolean isLocked() {
        return lock;
    }

    @Override
    public boolean httpQueueIsEmpty() {
        return httpRequestQueue.isEmpty();
    }

    @Override
    public RequestFilter getRequestFilter() {
        return requestFilter;
    }

    @Override
    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    @Override
    public boolean waitsForPrecondition() {
        return false;
    }
}
