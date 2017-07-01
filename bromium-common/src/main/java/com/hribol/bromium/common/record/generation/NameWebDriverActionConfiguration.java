package com.hribol.bromium.common.record.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class NameWebDriverActionConfiguration implements GenerationInformation {
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
}
