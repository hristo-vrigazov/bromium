package core.execution.factory;

import core.actions.WebDriverAction;

import java.util.Map;

/**
 * A factory for creating {@link WebDriverAction}
 */
public interface WebDriverActionFactory {
    WebDriverAction create(String webdriverActionType, Map<String, String> parameters, boolean expectsHttpRequest);
}
