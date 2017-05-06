package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

/**
 * By given test case step and whether the action expects http request,
 * parses the step and creates a {@link WebDriverAction}.
 */
public interface WebDriverActionParameterParser {
    WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest);
}
