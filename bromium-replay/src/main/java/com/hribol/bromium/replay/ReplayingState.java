package com.hribol.bromium.replay;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;
import java.util.*;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;
import static com.hribol.bromium.core.utils.Constants.NO_HTTP_REQUESTS_IN_QUEUE;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class ReplayingState {
    private Set<String> conditionsSatisfied;
    private Optional<SynchronizationEvent> synchronizationEventOptional;
    private boolean httpLock;
    private Set<HttpRequest> httpRequestQueue;
    private List<String> whiteListHttp;

    @Inject
    public ReplayingState(@Named(BASE_URI) URI baseUri) {
        this.synchronizationEventOptional = Optional.empty();
        this.httpLock = false;
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.conditionsSatisfied = Collections.synchronizedSet(new HashSet<>());
        this.whiteListHttp = buildWhiteList(baseUri);
    }

    private List<String> buildWhiteList(URI baseUri) {
        List<String> whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        whiteListHttp.add(baseUri.getHost());
        return whiteListHttp;
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

    public void setConditionSatisfied(String condition) {
        this.conditionsSatisfied.add(condition);
        System.out.println("Satisfied " + condition);
    }

    public void signalizeIfSynchronizationEventIsSatisfied() {
        if (synchronizationEventOptional.isPresent() && isSatisfied(synchronizationEventOptional.get().getName())) {
            synchronizationEventOptional.get().signalizeIsDone();
            synchronizationEventOptional = Optional.empty();
        }
    }

    public void setConditionNotSatisfied(String condition) {
        conditionsSatisfied.remove(condition);
        System.out.println("Not Satisfied " + condition);
    }

    public void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        this.httpRequestQueue.add(httpRequest);
        System.out.println("Add request " + httpRequest.getUri());
        System.out.println("Number of requests in queue " + this.httpRequestQueue.size());
    }

    private boolean inWhiteList(String url) {
        return whiteListHttp.stream().anyMatch(url::contains);
    }

    public boolean httpRequestQueueIsEmpty() {
        return httpRequestQueue.isEmpty();
    }

    public void signalizeIfNoHttpQueriesInQueue() {
        if (httpRequestQueueIsEmpty() && synchronizationEventOptional.isPresent()) {
            SynchronizationEvent synchronizationEvent = synchronizationEventOptional.get();
            if (synchronizationEvent.getName().equals(NO_HTTP_REQUESTS_IN_QUEUE)) {
                synchronizationEvent.signalizeIsDone();
                synchronizationEventOptional = Optional.empty();
            }
        }
    }

    public void removeHttpRequestFromQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);
        System.out.println("Number of requests in queue " + this.httpRequestQueue.size());
    }
}
