package com.hribol.spiderman.core.utils;

import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;

import static com.hribol.spiderman.core.utils.Constants.HTML;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;

/**
 * Common utilities
 */
public class Utils {
    public static boolean isFromCurrentHostAndAcceptsHTML(URI baseURI, HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get(ACCEPT).contains(HTML);
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl;
    }

    public static double toSeconds(long nanoseconds) {
        return nanoseconds / 1000000000.0;
    }
}
