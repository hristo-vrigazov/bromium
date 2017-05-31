package com.hribol.spiderman.replay.parsers;

import com.hribol.spiderman.replay.actions.WebDriverAction;

import java.util.Map;

/**
 * By given test case step and whether the action expects http request,
 * parses the step and creates a {@link WebDriverAction}.
 */
public interface WebDriverActionParameterParser {
    WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest);
}
