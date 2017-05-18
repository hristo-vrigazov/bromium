package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter extends ReplayBaseFilter implements RequestFilter {
    private LockCallback lockCallback;
    private Set<String> conditionsSatisfied;

    public ReplayRequestFilter(LockCallback lockCallback, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.lockCallback = lockCallback;
        this.conditionsSatisfied = Collections.synchronizedSet(new HashSet<>());
    }


    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        lockCallback.setLock(false);

        if (httpRequest.getUri().contains("http://spiderman-condition-satisfied.com/")) {
            try {
                URL url = new URL(httpRequest.getUri());
                conditionsSatisfied.add(url.getQuery());
                System.out.println("Satisfied " + conditionsSatisfied.size());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        if (httpRequest.getUri().contains("http://spiderman-condition-not-satisfied.com/")) {
            try {
                URL url = new URL(httpRequest.getUri());
                conditionsSatisfied.remove(url.getQuery());
                System.out.println("Not Satisfied " + conditionsSatisfied.size());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public boolean isSatisfied(String event) {
        return conditionsSatisfied.contains(event);
    }

}
