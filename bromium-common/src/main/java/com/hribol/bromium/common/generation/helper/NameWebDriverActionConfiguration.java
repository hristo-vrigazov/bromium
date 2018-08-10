package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.RegistryInformation;

/**
 * Represents a packaged event name and a {@link WebDriverActionConfiguration}
 */
public class NameWebDriverActionConfiguration implements RegistryInformation<WebDriverActionConfiguration> {
    private String eventName;
    private WebDriverActionConfiguration webDriverActionConfiguration;
    private ContextProvider contextProvider;

    public NameWebDriverActionConfiguration(String eventName,
                                            WebDriverActionConfiguration webDriverActionConfiguration,
                                            ContextProvider contextProvider) {
        this.eventName = eventName;
        this.webDriverActionConfiguration = webDriverActionConfiguration;
        this.contextProvider = contextProvider;
    }

    public WebDriverActionConfiguration getWebDriverActionConfiguration() {
        return webDriverActionConfiguration;
    }

    public String getEventName() {
        return eventName;
    }

    public ContextProvider getContextProvider() {
        return contextProvider;
    }

    @Override
    public WebDriverActionConfiguration getGenerationFunctionInformation() {
        return webDriverActionConfiguration;
    }
}
