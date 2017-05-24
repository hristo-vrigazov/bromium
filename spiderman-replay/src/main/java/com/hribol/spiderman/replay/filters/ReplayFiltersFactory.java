package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;

import java.net.URISyntaxException;
import java.util.Set;
import java.util.function.BooleanSupplier;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class ReplayFiltersFactory {

    public ReplayRequestFilter createReplayRequestFilter(String baseURI,
                                                         Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        return new ReplayRequestFilter(baseURI, httpRequestQueue);
    }

    public ReplayResponseFilter createReplayResponseFilter(BooleanSupplier booleanSupplier, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        return new ReplayResponseFilter(booleanSupplier, baseURI, httpRequestQueue);
    }
}
