package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBaseFilter {
    protected List<String> whiteListHttp;
    protected String baseURI;
    protected Set<HttpRequest> httpRequestQueue;

    public ReplayBaseFilter(String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        this.baseURI = baseURI;
        this.httpRequestQueue = httpRequestQueue;
        this.whiteListHttp = buildWhitelist();
    }

    protected void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        System.out.println("Add request " + httpRequest.getUri());
        this.httpRequestQueue.add(httpRequest);
    }

    protected void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);
    }

    private boolean inWhiteList(String url) {
        return whiteListHttp.stream().anyMatch(url::contains);
    }

    private List<String> buildWhitelist() throws URISyntaxException {
        List<String> whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        URI uri = new URI(baseURI);
        whiteListHttp.add(uri.getHost());
        return whiteListHttp;
    }
}
