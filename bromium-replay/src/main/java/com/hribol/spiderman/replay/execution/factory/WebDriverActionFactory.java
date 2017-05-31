package com.hribol.spiderman.replay.execution.factory;

import com.hribol.spiderman.replay.actions.WebDriverAction;

import java.util.Map;

/**
 * A factory for creating {@link WebDriverAction}
 */
public interface WebDriverActionFactory {
    WebDriverAction create(String webdriverActionType, Map<String, String> parameters, boolean expectsHttpRequest);
}
