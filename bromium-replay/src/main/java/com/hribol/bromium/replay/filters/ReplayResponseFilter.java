package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.util.function.Predicate;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter implements ResponseFilter {

    private String injectionCode;
    private ReplayingState replayingState;
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate;

    public ReplayResponseFilter(String injectionCode,
                                ReplayingState replayingState,
                                Predicate<HttpRequest> shouldInjectJavascriptPredicate) {
        this.injectionCode = injectionCode;
        this.replayingState = replayingState;
        this.shouldInjectJavascriptPredicate = shouldInjectJavascriptPredicate;
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (shouldInjectJavascriptPredicate.test(httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }

        replayingState.removeHttpRequestFromQueue(httpMessageInfo.getOriginalRequest());
        replayingState.signalizeIfNoHttpQueriesInQueue();
    }

}
