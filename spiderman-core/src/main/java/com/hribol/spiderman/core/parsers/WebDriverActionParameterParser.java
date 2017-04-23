package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebDriverActionParameterParser {
    WebDriverAction create(Map<String, Object> parameters);
}
