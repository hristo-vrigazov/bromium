package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.replay.factory.DefaultApplicationActionFactory;
import com.hribol.bromium.common.replay.factory.TestCaseStepToApplicationActionConverter;
import com.hribol.bromium.core.config.ApplicationConfiguration;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class DefaultApplicationActionFactorySupplier {
    public DefaultApplicationActionFactory get(ApplicationConfiguration applicationConfiguration,
                                               TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter) {
        return new DefaultApplicationActionFactory(applicationConfiguration, testCaseStepToApplicationActionConverter);
    }
}
