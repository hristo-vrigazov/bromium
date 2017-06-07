package com.hribol.bromium.record.javascript.generation.application;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorderGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingWebDriverActionsOnly implements ApplicationActionRecorder {
    private WebDriverActionRecorderGenerator webDriverActionRecorderGenerator;

    public RecordingWebDriverActionsOnly(WebDriverActionRecorderGenerator webDriverActionRecorderGenerator) {
        this.webDriverActionRecorderGenerator = webDriverActionRecorderGenerator;
    }

    @Override
    public String generate(ApplicationActionConfiguration applicationActionConfiguration) {
        return webDriverActionRecorderGenerator.generate(applicationActionConfiguration.getWebDriverAction());
    }
}
