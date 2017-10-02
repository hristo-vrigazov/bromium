package com.hribol.bromium.common.filtering;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;

/**
 * Created by hvrigazov on 02.08.17.
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
