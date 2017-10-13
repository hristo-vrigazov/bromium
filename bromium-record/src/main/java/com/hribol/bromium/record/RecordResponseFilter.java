package com.hribol.bromium.record;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.util.function.Predicate;

/**
 * A response filter which by given predicate which accepts a {@link HttpRequest} as a parameter, injects a given
 * javascript injection code to the {@link HttpResponse}.
 */
public class RecordResponseFilter implements ResponseFilter {

    private String injectionCode;
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate;

    /**
     * Constructs a new {@link RecordResponseFilter}
     * @param injectionCode the injection code to be included in the http request
     * @param shouldInjectJavascriptPredicate the predicate which indicates whether the code should be injected
     */
    public RecordResponseFilter(String injectionCode,
                                Predicate<HttpRequest> shouldInjectJavascriptPredicate) {
        this.injectionCode = injectionCode;
        this.shouldInjectJavascriptPredicate = shouldInjectJavascriptPredicate;
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (shouldInjectJavascriptPredicate.test(httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
    }
}
