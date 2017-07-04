package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class ReplayBrowserSupplier {
    public ReplayBrowser get(TestScenarioFactory testScenarioFactory, WebDriverActionExecution execution) {
        return new ReplayBrowser(testScenarioFactory, execution);
    }
}