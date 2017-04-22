package com.hribol.automation.core.record;

import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordUtils {
    public static boolean isUrlChangingRequest(URI baseURI, HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get("Accept").contains("html");
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl;
    }
}
