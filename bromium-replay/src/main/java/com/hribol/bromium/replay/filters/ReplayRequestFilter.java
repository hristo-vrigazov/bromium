package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
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
import java.util.Optional;
import java.util.Set;

import static com.hribol.bromium.replay.config.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.bromium.replay.config.utils.Constants.CONDITION_SATISFIED_URL;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter extends ReplayBaseFilter implements RequestFilter {
    private Set<String> conditionsSatisfied;
    private Optional<SynchronizationEvent> synchronizationEventOptional;
    private boolean httpLock;

    public ReplayRequestFilter(String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.conditionsSatisfied = Collections.synchronizedSet(new HashSet<>());
        this.synchronizationEventOptional = Optional.empty();
        this.httpLock = false;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {

        addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        this.httpLock = false;

        if (httpRequest.getUri().contains(CONDITION_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                String event = url.getQuery();
                conditionsSatisfied.add(event);
                System.out.println("Satisfied " + event);

                if (synchronizationEventOptional.isPresent() && isSatisfied(synchronizationEventOptional.get().getName())) {
                    synchronizationEventOptional.get().signalizeIsDone();
                    synchronizationEventOptional = Optional.empty();
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        if (httpRequest.getUri().contains(CONDITION_NOT_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                String event = url.getQuery();
                conditionsSatisfied.remove(url.getQuery());
                System.out.println("Not Satisfied " + event);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    private void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        System.out.println("Add request " + httpRequest.getUri());
        this.httpRequestQueue.add(httpRequest);
    }

    public boolean isSatisfied(String event) {
        return conditionsSatisfied.contains(event);
    }

    public void setSynchronizationEvent(SynchronizationEvent synchronizationEventOptional) {
        this.synchronizationEventOptional = Optional.of(synchronizationEventOptional);
    }

    public void setHttpLock(boolean lock) {
        this.httpLock = lock;
    }

    public boolean isHttpLocked() {
        return this.httpLock;
    }
}