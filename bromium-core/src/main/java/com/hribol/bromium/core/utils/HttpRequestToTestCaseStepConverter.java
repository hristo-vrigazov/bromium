package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Optional;

/**
 * An interface that converts a {@link HttpRequest} to a {@link Map}, or returns {@link Optional#empty()} if it cannot.
 */
public interface HttpRequestToTestCaseStepConverter {

    /**
     * Converts a {@link HttpRequest} to a {@link Map}, or returns {@link Optional#empty()} if it cannot.
     * @param httpRequest the HTTP request to be converted to test case step
     * @return {@link Optional#empty()} if conversion is not possible, {@link Optional<Map>} else.
     * @throws MalformedURLException if the http request URL cannot be parsed
     * @throws UnsupportedEncodingException if the encoding used for URL decoding is not supported
     */
    Optional<Map<String, String>> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException;
}
