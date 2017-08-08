package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 02.08.17.
 */
public interface HttpRequestToTestCaseStepConverter {
    Optional<Map<String, String>> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException;
}
