package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

/**
 * This class is an abstraction of an event which happens in certain types of http requests
 * and can convert the request to a test case step.
 */
public interface EventDetector {

    /**
     * @return the function knows for which {@link HttpRequest}s it should trigger
     */
    Predicate<HttpRequest> canDetectPredicate();

    /**
     * @return the function which knows how to convert the {@link HttpRequest} to a test case step
     */
    HttpRequestToTestCaseStepConverter getConverter();
}
