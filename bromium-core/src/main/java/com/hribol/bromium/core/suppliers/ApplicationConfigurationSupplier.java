package com.hribol.bromium.core.suppliers;

import com.hribol.bromium.core.config.ApplicationConfiguration;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class ApplicationConfigurationSupplier {
    public ApplicationConfiguration get() {
        return new ApplicationConfiguration();
    }
}
