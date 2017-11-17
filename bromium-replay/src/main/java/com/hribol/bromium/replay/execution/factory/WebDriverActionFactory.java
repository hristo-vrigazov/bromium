package com.hribol.bromium.replay.execution.factory;

import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Map;

/**
 * A factory for creating {@link WebDriverAction}
 */
public interface WebDriverActionFactory {

    /**
     * Creates a web driver action
     * @param webdriverActionType the type of the action, for example "ClickClassByText"
     * @param parameters the parameters for the action in raw format
     * @param expectsHttpRequest whether the action should expect http request after it is executed
     * @return the web driver action
     */
    WebDriverAction create(String webdriverActionType, Map<String, String> parameters, boolean expectsHttpRequest);
}
