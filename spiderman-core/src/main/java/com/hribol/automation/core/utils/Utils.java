package com.hribol.automation.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class Utils {
    public static boolean isUrlChangingRequest(URI baseURI, HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get("Accept").contains("html");
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && !isFromCurrentBaseUrl;
    }
}
