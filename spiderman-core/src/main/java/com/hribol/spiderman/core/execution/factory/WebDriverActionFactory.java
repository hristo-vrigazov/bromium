package com.hribol.spiderman.core.execution.factory;

import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

/**
 * A factory for creating {@link WebDriverAction}
 */
public interface WebDriverActionFactory {
    WebDriverAction create(String webdriverActionType, Map<String, String> parameters, boolean expectsHttpRequest);
}
