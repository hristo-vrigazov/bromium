package com.hribol.spiderman.core.execution.scenario;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * A factory for creating {@link TestScenario}s by a given {@link ApplicationActionFactory}
 * and either a path to serialized test or a list of test case steps.
 */
public interface TestScenarioFactory {
    /**
     * Creates a {@link TestScenario} by a given {@link ApplicationActionFactory} and
     * path to serialized test.
     * @param applicationActionFactory the factory for creating application actions
     * @param pathToSerializedTest the path to the serialized test
     * @return the created instance of {@link TestScenario}
     * @throws IOException when trying to read from the file.
     */
    TestScenario createFromFile(ApplicationActionFactory applicationActionFactory,
                                String pathToSerializedTest) throws IOException;

    /**
     * Creates a {@link TestScenario} by a given {@link ApplicationActionFactory} and
     * list of the test steps
     * @param applicationActionFactory the factory for creating application actions
     * @param testCaseSteps the list of test case steps
     * @return the created instance of {@link TestScenario}
     */
    TestScenario createFromTestCaseSteps(ApplicationActionFactory applicationActionFactory,
                                                        List<Map<String, String>> testCaseSteps);

    /**
     * Creates a {@link TestScenario} by a given {@link ApplicationActionFactory} and an input
     * stream from which to read the test case
     * @param applicationActionFactory the factory for creating application actions
     * @param inputStream the input stream from which to read
     */
    TestScenario createFromInputStream(ApplicationActionFactory applicationActionFactory,
                                       InputStream inputStream) throws IOException;
}
