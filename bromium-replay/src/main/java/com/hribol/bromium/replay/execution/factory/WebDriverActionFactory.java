package com.hribol.bromium.replay.execution.factory;

import com.hribol.bromium.replay.actions.WebDriverAction;

/**
 * A factory for creating {@link WebDriverAction}
 */
public interface WebDriverActionFactory {

    /**
     * Creates a web driver action
     * @param webdriverActionType the type of the action, for example "ClickClassByText"
     * @param actionCreationContext
     * @return the web driver action
     */
    WebDriverAction create(String webdriverActionType, ActionCreationContext actionCreationContext);
}
