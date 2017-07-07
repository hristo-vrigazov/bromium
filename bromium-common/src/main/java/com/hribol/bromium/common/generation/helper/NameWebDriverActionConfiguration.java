package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GenerationFunctionInformation;
import com.hribol.bromium.core.generation.GenerationInformation;
import com.hribol.bromium.core.generation.RegistryInformation;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class NameWebDriverActionConfiguration implements RegistryInformation<WebDriverActionConfiguration> {
    private String eventName;
    private WebDriverActionConfiguration webDriverActionConfiguration;

    public NameWebDriverActionConfiguration(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        this.eventName = eventName;
        this.webDriverActionConfiguration = webDriverActionConfiguration;
    }

    public WebDriverActionConfiguration getWebDriverActionConfiguration() {
        return webDriverActionConfiguration;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public WebDriverActionConfiguration getGenerationFunctionInformation() {
        return webDriverActionConfiguration;
    }
}
