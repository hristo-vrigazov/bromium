package com.hribol.automation.core.execution.executor;

import com.hribol.automation.core.execution.application.ApplicationActionFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 22.04.17.
 */
public interface TestScenarioFactory {
    TestScenario createFromFile(ApplicationActionFactory applicationActionFactory,
                                String pathToSerializedTest) throws IOException;

    TestScenario createFromTestCaseSteps(ApplicationActionFactory applicationActionFactory,
                                                        List<Map<String, String>> testCaseSteps);
}
