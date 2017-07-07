package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;

import static io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;

/**
 * Common utilities
 */
public class Utils {
    public static boolean isGETFromCurrentHostAndAcceptsHTML(URI baseURI, HttpRequest httpRequest) {
        boolean methodIsGet = httpRequest.getMethod().equals(HttpMethod.GET);
        boolean expectsHtmlContent = httpRequest.headers().get(ACCEPT).contains(Constants.HTML);
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl && methodIsGet;
    }

    public static double toSeconds(long nanoseconds) {
        return nanoseconds / 1000000000.0;
    }
}
