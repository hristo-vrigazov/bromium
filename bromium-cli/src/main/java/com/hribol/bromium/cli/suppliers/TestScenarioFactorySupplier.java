package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class TestScenarioFactorySupplier {
    public TestScenarioFactory get(ApplicationActionFactory applicationActionFactory) {
        return new TestScenarioFactory(applicationActionFactory);
    }
}
