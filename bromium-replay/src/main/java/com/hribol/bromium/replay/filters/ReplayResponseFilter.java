package com.hribol.bromium.replay.filters;

import com.hribol.bromium.core.utils.Utils;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URISyntaxException;
import java.util.Optional;
import java.util.Set;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter extends ReplayBaseFilter implements ResponseFilter {

    private Optional<SynchronizationEvent> synchronizationEventOptional;
    private String injectionCode;

    public ReplayResponseFilter(String injectionCode, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.injectionCode = injectionCode;
        this.synchronizationEventOptional = Optional.empty();
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (Utils.isGETFromCurrentHostAndAcceptsHTML(baseURI, httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
        removeHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        signalizeIfNoHttpQueriesInQueue();
    }

    public boolean httpRequestQueueIsEmpty() {
        return httpRequestQueue.isEmpty();
    }

    private void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);
    }

    private void signalizeIfNoHttpQueriesInQueue() {
        if (httpRequestQueueIsEmpty() && synchronizationEventOptional.isPresent()) {
            synchronizationEventOptional.get().signalizeIsDone();
            synchronizationEventOptional = Optional.empty();
        }
    }

    public void setSynchronizationEvent(SynchronizationEvent synchronizationEventOptional) {
        this.synchronizationEventOptional = Optional.of(synchronizationEventOptional);
    }
}
