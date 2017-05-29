package com.hribol.spiderman.replay.config.utils;

import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;

import static com.hribol.spiderman.replay.config.utils.Constants.HTML;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;

/**
 * Common utilities
 */
public class Utils {
    public static boolean isGETFromCurrentHostAndAcceptsHTML(URI baseURI, HttpRequest httpRequest) {
        boolean methodIsGet = httpRequest.getMethod().equals(HttpMethod.GET);
        boolean expectsHtmlContent = httpRequest.headers().get(ACCEPT).contains(HTML);
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl && methodIsGet;
    }

    public static double toSeconds(long nanoseconds) {
        return nanoseconds / 1000000000.0;
    }
}
