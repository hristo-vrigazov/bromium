package com.hribol.bromium.record.javascript.generation.application;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorder;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingWebDriverActionsOnly implements ApplicationActionRecorder {
    private WebDriverActionRecorder webDriverActionRecorder;

    public RecordingWebDriverActionsOnly(WebDriverActionRecorder webDriverActionRecorder) {
        this.webDriverActionRecorder = webDriverActionRecorder;
    }

    @Override
    public String generate(ApplicationActionConfiguration applicationActionConfiguration) {
        return webDriverActionRecorder.generate(applicationActionConfiguration.getWebDriverAction());
    }
}
