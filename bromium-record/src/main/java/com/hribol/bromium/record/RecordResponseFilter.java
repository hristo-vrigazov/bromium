package com.hribol.bromium.record;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URI;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;
import static com.hribol.bromium.core.DependencyInjectionConstants.RECORDING_JAVASCRIPT_CODE;
import static com.hribol.bromium.core.utils.Utils.isGETFromCurrentHostAndAcceptsHTML;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordResponseFilter implements ResponseFilter {

    private URI baseURI;
    private String injectionCode;

    public RecordResponseFilter(URI baseURI,
                                String injectionCode) {
        this.baseURI = baseURI;
        this.injectionCode = injectionCode;
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (isGETFromCurrentHostAndAcceptsHTML(baseURI, httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
    }
}
