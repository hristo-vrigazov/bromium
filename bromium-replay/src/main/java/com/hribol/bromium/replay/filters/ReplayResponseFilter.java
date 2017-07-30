package com.hribol.bromium.replay.filters;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.utils.Utils;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter implements ResponseFilter {

    private URI baseURI;
    private String injectionCode;
    private ReplayingState replayingState;
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate;

    public ReplayResponseFilter(URI baseURI,
                                String injectionCode,
                                ReplayingState replayingState,
                                Predicate<HttpRequest> shouldInjectJavascriptPredicate) {
        this.baseURI = baseURI;
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
