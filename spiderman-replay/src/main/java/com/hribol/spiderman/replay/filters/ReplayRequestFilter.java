package com.hribol.spiderman.replay.filters;

import com.hribol.spiderman.replay.LockCallback;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.spiderman.replay.config.utils.Constants.CONDITION_SATISFIED_URL;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayRequestFilter extends ReplayBaseFilter implements RequestFilter {
    private LockCallback lockCallback;
    private Set<String> conditionsSatisfied;
    private Optional<String> optionalEvent;

    public ReplayRequestFilter(LockCallback lockCallback, String baseURI, Set<HttpRequest> httpRequestQueue) throws URISyntaxException {
        super(baseURI, httpRequestQueue);
        this.lockCallback = lockCallback;
        this.conditionsSatisfied = Collections.synchronizedSet(new HashSet<>());
        this.optionalEvent = Optional.empty();
    }


    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        lockCallback.setLock(false);

        if (httpRequest.getUri().contains(CONDITION_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                conditionsSatisfied.add(url.getQuery());
                System.out.println("Satisfied " + conditionsSatisfied.size());

                if (!waitsForPrecondition()) {
                    synchronized (this) {
                        notify();
                    }
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        if (httpRequest.getUri().contains(CONDITION_NOT_SATISFIED_URL)) {
            try {
                URL url = new URL(httpRequest.getUri());
                conditionsSatisfied.remove(url.getQuery());
                System.out.println("Not Satisfied " + conditionsSatisfied.size());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public boolean isSatisfied(String event) {
        return conditionsSatisfied.contains(event);
    }

    public boolean waitsForPrecondition() {
        return optionalEvent.isPresent() && !isSatisfied(optionalEvent.get());
    }

    public void setWaitingEvent(String event) {
        optionalEvent = Optional.of(event);
    }

    public void signalizeEventIsDone() {
        optionalEvent = Optional.empty();
    }

}
