package com.hribol.automation.replay;

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


    protected boolean inWhiteList(String url) {
        for (String whiteListedString: whiteListHttp) {
            if (url.contains(whiteListedString)) {
                return true;
            }
        }

        return false;
    }

    private List<String> buildWhitelist() throws URISyntaxException {
        List<String> whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        URI uri = new URI(baseURI);
        whiteListHttp.add(uri.getHost());
        return whiteListHttp;
    }
}
