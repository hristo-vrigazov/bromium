package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

/**
 * Created by hvrigazov on 04.08.17.
 */
public interface EventDetector {
    Predicate<HttpRequest> canDetectPredicate();
    HttpRequestToTestCaseStepConverter getConverter();
}
