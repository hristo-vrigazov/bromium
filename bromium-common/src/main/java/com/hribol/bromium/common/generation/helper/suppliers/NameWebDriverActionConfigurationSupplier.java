package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class NameWebDriverActionConfigurationSupplier {

    public NameWebDriverActionConfiguration get(String name, WebDriverActionConfiguration webDriverActionConfiguration) {
        return new NameWebDriverActionConfiguration(name, webDriverActionConfiguration);
    }
}
