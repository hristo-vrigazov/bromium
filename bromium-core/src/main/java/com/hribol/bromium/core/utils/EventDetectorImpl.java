package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

/**
 * Created by hvrigazov on 04.08.17.
 */
public class EventDetectorImpl implements EventDetector {

    private Predicate<HttpRequest> predicate;
    private HttpRequestToTestCaseStepConverter converter;

    public EventDetectorImpl(Predicate<HttpRequest> predicate, HttpRequestToTestCaseStepConverter converter) {
        this.predicate = predicate;
        this.converter = converter;
    }

    @Override
    public Predicate<HttpRequest> canDetectPredicate() {
        return predicate;
    }

    @Override
    public HttpRequestToTestCaseStepConverter getConverter() {
        return converter;
    }
}
