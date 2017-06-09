package com.hribol.bromium.common.record.application;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.record.javascript.generation.ApplicationActionGenerator;
import com.hribol.bromium.record.javascript.generation.WebDriverActionGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingWebDriverActionsOnly implements ApplicationActionGenerator {
    private WebDriverActionGenerator webDriverActionGenerator;

    @Inject
    public RecordingWebDriverActionsOnly(WebDriverActionGenerator webDriverActionGenerator) {
        this.webDriverActionGenerator = webDriverActionGenerator;
    }

    @Override
    public String generate(ApplicationActionConfiguration applicationActionConfiguration) {
        return webDriverActionGenerator.generate(
                applicationActionConfiguration.getName(),
                applicationActionConfiguration.getWebDriverAction());
    }
}
