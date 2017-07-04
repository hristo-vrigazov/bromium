package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.replay.factory.PredefinedWebDriverActionFactory;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class PredefinedWebDriverActionFactorySupplier {
    public PredefinedWebDriverActionFactory get(String baseURL) {
        return new PredefinedWebDriverActionFactory(baseURL);
    }
}
