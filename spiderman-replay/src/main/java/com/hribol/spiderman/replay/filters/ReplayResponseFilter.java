package com.hribol.spiderman.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URISyntaxException;
import java.util.Set;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter extends ReplayBaseFilter implements ResponseFilter {

    public ReplayResponseFilter(String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        HttpRequest httpRequest = httpMessageInfo.getOriginalRequest();

        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpMessageInfo.getOriginalRequest());
    }
}
