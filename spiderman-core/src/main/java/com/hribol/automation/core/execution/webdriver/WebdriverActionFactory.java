package com.hribol.automation.core.execution.webdriver;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebdriverActionFactory {
    WebDriverAction create(String webdriverActionType, Map<String, Object> parameters);
}
