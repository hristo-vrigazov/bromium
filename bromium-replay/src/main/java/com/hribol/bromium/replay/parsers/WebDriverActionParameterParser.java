package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

/**
 * By given test case step and whether the action expects http request,
 * parses the step and creates a {@link WebDriverAction}.
 */
public interface WebDriverActionParameterParser {

    /**
     * Parses the raw parameters and creates a {@link WebDriverAction}
     * @param parameters the raw parameters
     * @param step
     * @param expectHttpRequest whether HTTP request should be expected after the action
     * @param contextProvider provides the {@link SearchContext} in which the action should be executed
     * @return
     */
    WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest, Function<WebDriver, SearchContext> contextProvider);
}
