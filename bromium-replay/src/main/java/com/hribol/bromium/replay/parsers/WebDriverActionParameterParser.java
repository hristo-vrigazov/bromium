package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Map;

/**
 * By given test case step and whether the action expects http request,
 * parses the step and creates a {@link WebDriverAction}.
 */
public interface WebDriverActionParameterParser {

    /**
     * Parses the raw parameters and creates a {@link WebDriverAction}
     * @param parameters the raw parameters
     * @param expectHttpRequest whether HTTP request should be expected after the action
     * @return
     */
    WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest);
}
