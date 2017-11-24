package com.hribol.bromium.replay.filters;

import com.google.inject.Inject;
import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter implements RequestFilter {

    private final static Logger logger = LoggerFactory.getLogger(ReplayRequestFilter.class);

    private final ReplayingState replayingState;
    private List<ConditionsUpdater> conditionsUpdaters;

    @Inject
    public ReplayRequestFilter(ReplayingState replayingState, List<ConditionsUpdater> conditionsUpdaters) {
        this.replayingState = replayingState;
        this.conditionsUpdaters = conditionsUpdaters;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        replayingState.addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        replayingState.setHttpLock(false);

        for (ConditionsUpdater conditionsUpdater: conditionsUpdaters) {
            if (conditionsUpdater.shouldUpdate().test(httpRequest)) {
                try {
                    URL url = new URL(httpRequest.getUri());
                    String event = url.getQuery();
                    conditionsUpdater.updater().update(replayingState, event);
                    return new DefaultHttpResponse(httpRequest.getProtocolVersion(), HttpResponseStatus.OK);
                } catch (MalformedURLException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }

        return null;
    }
}
