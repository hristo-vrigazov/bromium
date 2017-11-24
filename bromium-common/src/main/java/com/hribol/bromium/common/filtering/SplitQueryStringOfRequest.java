package com.hribol.bromium.common.filtering;

import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import com.hribol.bromium.core.utils.URLUtils;
import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Optional;

/**
 * Converts a {@link HttpRequest} by splitting the query part
 */
public class SplitQueryStringOfRequest implements HttpRequestToTestCaseStepConverter {
    @Override
    public Optional<Map<String, String>> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException {
        return Optional.of(URLUtils.splitQuery(new URL(httpRequest.getUri())));
    }
}
