package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Supplies an instance of {@link NameWebDriverActionConfiguration}
 */
public class NameWebDriverActionConfigurationSupplier {

    public NameWebDriverActionConfiguration get(String name,
                                                WebDriverActionConfiguration webDriverActionConfiguration,
                                                ContextProvider contextProvider) {
        return new NameWebDriverActionConfiguration(name, webDriverActionConfiguration, contextProvider);
    }
}
