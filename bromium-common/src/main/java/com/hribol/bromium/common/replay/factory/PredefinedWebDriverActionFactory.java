package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

/**
 * A {@link WebDriverActionFactory} which uses only the predefined actions
 */
public class PredefinedWebDriverActionFactory extends WebDriverActionFactoryBase {
    private final Map<String, WebDriverActionParameterParser> additionalRegistry;

    public PredefinedWebDriverActionFactory(String baseURL, Map<String, WebDriverActionParameterParser> additionalRegistry) {
        super(baseURL);
        this.additionalRegistry = additionalRegistry;
        addActions();
    }

    @Override
    protected void addCustom() {
        for (Map.Entry<String, WebDriverActionParameterParser> entry: additionalRegistry.entrySet()) {
            add(entry.getKey(), entry.getValue());
        }
    }
}
