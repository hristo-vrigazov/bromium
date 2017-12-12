package com.hribol.bromium.common.filtering;

import io.netty.handler.codec.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.function.Predicate;

/**
 * A predicate which checks whether the URL of a given {@link HttpRequest} contains given string
 */
public class UriContainsStringPredicate implements Predicate<HttpRequest> {

    private static final Logger logger = LoggerFactory.getLogger(UriContainsStringPredicate.class);

    private String stringToBeContained;
    private String host;

    public UriContainsStringPredicate(String stringToBeContained) {
        this.stringToBeContained = stringToBeContained;
        this.host = URI.create(stringToBeContained).getHost();
    }

    @Override
    public boolean test(HttpRequest httpRequest) {
        return httpRequest.getUri().contains(host);
    }
}
