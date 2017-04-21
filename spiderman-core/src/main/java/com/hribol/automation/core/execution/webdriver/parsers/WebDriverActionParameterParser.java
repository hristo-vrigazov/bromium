package com.hribol.automation.core.execution.webdriver.parsers;

import com.hribol.automation.core.execution.webdriver.WebDriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebDriverActionParameterParser {
    WebDriverAction create(Map<String, Object> parameters);
}
