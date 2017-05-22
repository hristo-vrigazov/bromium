package com.hribol.spiderman.record;

import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URI;

import static com.hribol.spiderman.replay.config.utils.Utils.isFromCurrentHostAndAcceptsHTML;

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
        if (isFromCurrentHostAndAcceptsHTML(baseURI, httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
    }
}
