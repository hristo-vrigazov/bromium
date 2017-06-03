package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.config.utils.Utils;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
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
    private Optional<SynchronizationEvent> synchronizationEventOptional;
    private String injectionCode;

    public ReplayResponseFilter(BooleanSupplier canAct, String injectionCode, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.canAct = canAct;
        this.injectionCode = injectionCode;
        this.synchronizationEventOptional = Optional.empty();
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (Utils.isGETFromCurrentHostAndAcceptsHTML(baseURI, httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + httpMessageContents.getTextContents());
        }
        removeHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
    }

    public boolean canAct() {
        return canAct.getAsBoolean();
    }

    private void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }

        this.httpRequestQueue.remove(httpRequest);

        if (canAct.getAsBoolean() && synchronizationEventOptional.isPresent()) {
            synchronizationEventOptional.get().signalizeIsDone();
        }
    }

    public void setSynchronizationEvent(SynchronizationEvent synchronizationEventOptional) {
        this.synchronizationEventOptional = Optional.of(synchronizationEventOptional);
    }
}
