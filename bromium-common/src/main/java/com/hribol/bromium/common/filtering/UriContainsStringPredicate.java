package com.hribol.bromium.common.filtering;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;

/**
 * A predicate which checks whether the URL of a given {@link HttpRequest} contains given string
 */
public class UriContainsStringPredicate implements Predicate<HttpRequest> {

    private String stringToBeContained;

    public UriContainsStringPredicate(String stringToBeContained) {
        this.stringToBeContained = stringToBeContained;
    }

    @Override
    public boolean test(HttpRequest httpRequest) {
        return httpRequest.getUri().contains(stringToBeContained);
    }
}
