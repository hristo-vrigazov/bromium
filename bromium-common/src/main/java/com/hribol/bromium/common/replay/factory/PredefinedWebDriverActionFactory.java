package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;

/**
 * A {@link WebDriverActionFactory} which uses only the predefined actions
 */
public class PredefinedWebDriverActionFactory extends WebDriverActionFactoryBase {
    public PredefinedWebDriverActionFactory(String baseURL) {
        super(baseURL);
    }

    @Override
    protected void addCustom() {
    }
}
