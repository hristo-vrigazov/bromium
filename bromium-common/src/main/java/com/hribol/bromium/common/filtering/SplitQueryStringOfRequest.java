package com.hribol.bromium.common.filtering;

import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 02.08.17.
 */
public class SplitQueryStringOfRequest implements HttpRequestToTestCaseStepConverter {
    @Override
    public Optional<Map<String, String>> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException {
        return Optional.of(ConfigurationUtils.splitQuery(new URL(httpRequest.getUri())));
    }
}
