package com.hribol.automation.core.execution.webdriver;

import com.hribol.automation.core.parsers.ClickClassByTextParser;
import com.hribol.automation.core.parsers.WebDriverActionParameterParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public abstract class WebDriverActionFactoryBase implements WebdriverActionFactory {

    protected Map<String, WebDriverActionParameterParser> parsersRegistry;

    public WebDriverActionFactoryBase() {
        parsersRegistry = new HashMap<>();
        addPredefined();
        addCustom();
    }

    private void addPredefined() {
        parsersRegistry.put("CLICK_CLASS_BY_TEXT", new ClickClassByTextParser());
    }

    protected abstract void addCustom();

    @Override
    public WebDriverAction create(String webdriverActionType, Map<String, Object> parameters) {
        return parsersRegistry.get(webdriverActionType).create(parameters);
    }
}
