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
    protected String baseURL;
    protected URI baseURI;
    protected Set<HttpRequest> httpRequestQueue;

    public ReplayBaseFilter(String baseURL, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        this.baseURL = baseURL;
        this.baseURI = new URI(baseURL);
        this.httpRequestQueue = httpRequestQueue;
        this.whiteListHttp = buildWhitelist();
    }

    protected boolean inWhiteList(String url) {
        return whiteListHttp.stream().anyMatch(url::contains);
    }

    private List<String> buildWhitelist() throws URISyntaxException {
        List<String> whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        whiteListHttp.add(baseURI.getHost());
        return whiteListHttp;
    }
}
