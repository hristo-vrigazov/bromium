package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.config.utils.Utils;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.URISyntaxException;
import java.util.Optional;
import java.util.Set;
import java.util.function.BooleanSupplier;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter extends ReplayBaseFilter implements ResponseFilter {

    private BooleanSupplier canAct;
    private Optional<Object> optionalExecutionThreadLock;
    private String injectionCode;

    public ReplayResponseFilter(BooleanSupplier canAct, String injectionCode, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.canAct = canAct;
        this.optionalExecutionThreadLock = Optional.empty();
        this.injectionCode = injectionCode;

    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (Utils.isGETFromCurrentHostAndAcceptsHTML(baseURI, httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
        removeHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
    }

    public boolean setExecutionThreadLock(Object executionThreadLock) {
        if (canAct.getAsBoolean()) {
            return true;
        }

        optionalExecutionThreadLock = Optional.of(executionThreadLock);
        return false;
    }

    private void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

//        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);

        if (canAct.getAsBoolean()) {
            if (optionalExecutionThreadLock.isPresent()) {
                Object executionThreadLock = optionalExecutionThreadLock.get();
                synchronized (executionThreadLock) {
                    executionThreadLock.notify();
                }
            }
        }

    }
}
