package com.hribol.bromium.replay;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import io.netty.handler.codec.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;
import static com.hribol.bromium.core.utils.Constants.NO_HTTP_REQUESTS_IN_QUEUE;

/**
 * Represents the state that will be persistent during one replay
 */
public class ReplayingState {

    private static final Logger logger = LoggerFactory.getLogger(ReplayingState.class);

    private Set<String> conditionsSatisfied;
    private Optional<SynchronizationEvent> synchronizationEventOptional;
    private boolean httpLock;
    private Set<HttpRequest> httpRequestQueue;
    private List<String> whiteListHttp;

    /**
     * Creates new replaying state
     * @param baseUri the base uri for building the whitelisted http urls
     */
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

    /**
     * Returns whether the given event is currently satisfied
     * @param event the event
     * @return whether the given event is currently satisfied
     */
    public boolean isSatisfied(String event) {
        return conditionsSatisfied.contains(event);
    }

    /**
     * Sets the event on which we are trying to synchronize
     * @param synchronizationEventOptional the event on which we are trying to synchronize
     */
    public void setSynchronizationEvent(SynchronizationEvent synchronizationEventOptional) {
        this.synchronizationEventOptional = Optional.of(synchronizationEventOptional);
    }

    /**
     * Sets the http lock
     * @param lock the http lock new value
     */
    public void setHttpLock(boolean lock) {
        this.httpLock = lock;
    }

    /**
     * Returns whether the state is currently http locked
     * @return whether the state is currently http locked
     */
    public boolean isHttpLocked() {
        return this.httpLock;
    }

    /**
     * Sets condition as satisfied
     * @param condition the condition
     */
    public void setConditionSatisfied(String condition) {
        this.conditionsSatisfied.add(condition);
        logger.info("Condition {} has been satisfied", condition);
    }

    /**
     * Check if event is satisfied and if it is, signalize it
     */
    public void signalizeIfSynchronizationEventIsSatisfied() {
        if (synchronizationEventOptional.isPresent() && isSatisfied(synchronizationEventOptional.get().getName())) {
            synchronizationEventOptional.get().signalizeIsDone();
            synchronizationEventOptional = Optional.empty();
        }
    }

    /**
     * Sets condition as not satisfied
     * @param condition the condition
     */
    public void setConditionNotSatisfied(String condition) {
        conditionsSatisfied.remove(condition);
        logger.info("Condition {} is no longer satisfied", condition);
    }

    /**
     * Adds http request to the queue
     * @param httpRequest
     */
    public void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        this.httpRequestQueue.add(httpRequest);
        logger.debug("Request with URL: {} has been added to the queue", httpRequest.getUri());
        logger.debug("Number of requests in queue {}", httpRequestQueue.size());
    }

    private boolean inWhiteList(String url) {
        return whiteListHttp.stream().anyMatch(url::contains);
    }

    /**
     * whether there are any http requests in the queue
     * @return whether there are any http requests in the queue
     */
    public boolean httpRequestQueueIsEmpty() {
        return httpRequestQueue.isEmpty();
    }

    /**
     * Signalizes if here are no http requests in queue
     */
    public void signalizeIfNoHttpQueriesInQueue() {
        if (httpRequestQueueIsEmpty() && synchronizationEventOptional.isPresent()) {
            SynchronizationEvent synchronizationEvent = synchronizationEventOptional.get();
            if (synchronizationEvent.getName().equals(NO_HTTP_REQUESTS_IN_QUEUE)) {
                synchronizationEvent.signalizeIsDone();
                synchronizationEventOptional = Optional.empty();
            }
        }
    }

    /**
     * Removes an http request from the queue
     * @param httpRequest the request to be removed
     */
    public void removeHttpRequestFromQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        logger.debug("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);
        logger.debug("Number of requests in queue " + this.httpRequestQueue.size());
    }
}
