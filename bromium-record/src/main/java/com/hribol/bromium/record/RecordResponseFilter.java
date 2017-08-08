package com.hribol.bromium.record;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.util.function.Predicate;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordResponseFilter implements ResponseFilter {

    private String injectionCode;
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate;

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
