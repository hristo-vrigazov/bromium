package com.hribol.bromium.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;

/**
 * By given test case step and whether the action expects http request,
 * parses the step and creates a {@link WebDriverAction}.
 */
public interface WebDriverActionParameterParser {

    /**
     * Parses the raw parameters and creates a {@link WebDriverAction}
     * @param actionCreationContext
     * @return
     */
    WebDriverAction create(ActionCreationContext actionCreationContext);
}
