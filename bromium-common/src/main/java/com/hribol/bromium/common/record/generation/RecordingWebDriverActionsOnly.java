package com.hribol.bromium.common.record.generation;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingWebDriverActionsOnly implements JavascriptGenerator<ApplicationActionConfiguration> {
    private JavascriptGenerator<NameWebDriverActionConfiguration>  webDriverActionGenerator;

    @Inject
    public RecordingWebDriverActionsOnly(JavascriptGenerator<NameWebDriverActionConfiguration>  webDriverActionGenerator) {
        this.webDriverActionGenerator = webDriverActionGenerator;
    }

    @Override
    public String generate(ApplicationActionConfiguration applicationActionConfiguration) {
        NameWebDriverActionConfiguration nameWebDriverActionConfiguration = new NameWebDriverActionConfiguration(
                applicationActionConfiguration.getName(),
                applicationActionConfiguration.getWebDriverAction()
        );
        return webDriverActionGenerator.generate(nameWebDriverActionConfiguration);
    }
}
