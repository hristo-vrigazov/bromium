package com.hribol.spiderman.core.execution.factory;

import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebDriverActionFactory {
    WebDriverAction create(String webdriverActionType, Map<String, Object> parameters);
}
