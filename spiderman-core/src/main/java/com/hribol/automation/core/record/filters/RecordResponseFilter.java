package com.hribol.automation.core.record.filters;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URI;
import java.util.function.Supplier;

import static com.hribol.automation.core.record.RecordUtils.isUrlChangingRequest;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordResponseFilter implements ResponseFilter {

    private URI baseURI;
    private Supplier<String> injectionCodeSupplier;

    public RecordResponseFilter(URI baseURI, Supplier<String> injectionCodeSupplier) {
        this.baseURI = baseURI;
        this.injectionCodeSupplier = injectionCodeSupplier;
    }


    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (isUrlChangingRequest(baseURI, httpMessageInfo.getOriginalRequest())) {
            String baseContent = injectionCodeSupplier.get();
            baseContent += httpMessageContents.getTextContents();
            httpMessageContents.setTextContents(baseContent);
        }
    }
}
