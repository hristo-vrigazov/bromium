package com.hribol.automation.core.filters;

import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URI;

import static com.hribol.automation.core.utils.RecordUtils.isUrlChangingRequest;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordResponseFilter implements ResponseFilter {

    private URI baseURI;
    private String injectionCode;

    public RecordResponseFilter(URI baseURI, String injectionCode) {
        this.baseURI = baseURI;
        this.injectionCode = injectionCode;
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (isUrlChangingRequest(baseURI, httpMessageInfo.getOriginalRequest())) {
            injectionCode += httpMessageContents.getTextContents();
            httpMessageContents.setTextContents(injectionCode);
        }
    }
}
