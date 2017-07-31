package com.hribol.bromium.replay.filters;

import com.google.inject.Inject;
import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.MalformedURLException;
import java.net.URL;

import static com.hribol.bromium.core.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.bromium.core.utils.Constants.CONDITION_SATISFIED_URL;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter implements RequestFilter {
    private final ReplayingState replayingState;

    @Inject
    public ReplayRequestFilter(ReplayingState replayingState) {
        this.replayingState = replayingState;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        replayingState.addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        replayingState.setHttpLock(false);

        if (httpRequest.getUri().contains(CONDITION_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                String event = url.getQuery();
                replayingState.setConditionSatisfied(event);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        if (httpRequest.getUri().contains(CONDITION_NOT_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                String event = url.getQuery();
                replayingState.setConditionNotSatisfied(event);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
