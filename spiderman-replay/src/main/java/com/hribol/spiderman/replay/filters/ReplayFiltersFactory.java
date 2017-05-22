package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URISyntaxException;
import java.util.Set;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class ReplayFiltersFactory {

    public ReplayRequestFilter createReplayRequestFilter(LockCallback lockCallback, String baseURI,
                                                         Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        return new ReplayRequestFilter(lockCallback, baseURI, httpRequestQueue);
    }

    public ReplayResponseFilter createReplayResponseFilter(String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        return new ReplayResponseFilter(baseURI, httpRequestQueue);
    }
}
