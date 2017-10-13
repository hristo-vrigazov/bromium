package com.hribol.bromium.common.generation.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.NameWebDriverActionConfigurationSupplier;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

/**
 * Represents a javascript generator by an {@link ApplicationActionConfiguration}, which takes into account
 * the {@link com.hribol.bromium.core.config.WebDriverActionConfiguration} only for generation.
 */
public class RecordingWebDriverActionsOnly implements JavascriptGenerator<ApplicationActionConfiguration> {
    private JavascriptGenerator<NameWebDriverActionConfiguration>  webDriverActionGenerator;
    private NameWebDriverActionConfigurationSupplier nameWebDriverActionConfigurationSupplier;

    @Inject
    public RecordingWebDriverActionsOnly(JavascriptGenerator<NameWebDriverActionConfiguration> webDriverActionGenerator,
                                         NameWebDriverActionConfigurationSupplier nameWebDriverActionConfigurationSupplier) {
        this.webDriverActionGenerator = webDriverActionGenerator;
        this.nameWebDriverActionConfigurationSupplier = nameWebDriverActionConfigurationSupplier;
    }

    @Override
    public String generate(ApplicationActionConfiguration applicationActionConfiguration) {
        NameWebDriverActionConfiguration nameWebDriverActionConfiguration = nameWebDriverActionConfigurationSupplier.get(
                applicationActionConfiguration.getName(),
                applicationActionConfiguration.getWebDriverAction()
        );
        return webDriverActionGenerator.generate(nameWebDriverActionConfiguration);
    }
}
