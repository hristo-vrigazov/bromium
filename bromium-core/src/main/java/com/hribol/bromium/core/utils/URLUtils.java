package com.hribol.bromium.core.utils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utilities for URLs
 */
public class URLUtils {

    /**
     * Splits the query string of a given URL
     * @param url
     * @return the map of key value pairs of the query string
     * @throws UnsupportedEncodingException if when decoding we specify an encoding that is not supported.
     */
    public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
        Map<String, String> queryPairs = new LinkedHashMap<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            queryPairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }
        return queryPairs;
    }

    /**
     * Converts a map to a query string
     * @param params the map to be converted
     * @return the query string, no encoding happens
     */
    public static String toQueryString(Map<String, String> params) {
        return params.entrySet().stream()
                .map(p -> p.getKey() + "=" + p.getValue())
                .reduce((p1, p2) -> p1 + "&" + p2)
                .map(s -> "?" + s)
                .orElse("");
    }
}
