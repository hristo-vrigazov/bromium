package com.hribol.bromium.common.record;

import com.hribol.bromium.common.replay.DriverOperations;
import com.hribol.bromium.core.TestScenarioSteps;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * A class that can start recording, expose the {@link TestScenarioSteps} and clean up.
 */
public class RecordBrowser {

    private final String baseUrl;
    private final DriverOperations recordOperations;
    private Supplier<TestScenarioSteps> stepsSupplier;

    public RecordBrowser(String baseUrl,
                         DriverOperations recordOperations,
                         Supplier<TestScenarioSteps> stepsSupplier) throws IOException {
        this.baseUrl = baseUrl;
        this.recordOperations = recordOperations;
        this.stepsSupplier = stepsSupplier;
    }

    public void record() throws IOException {
        recordOperations.prepare();
        recordOperations.open(baseUrl);
    }

    public TestScenarioSteps getTestCaseSteps() {
        return stepsSupplier.get();
    }

    public void cleanUp() {
        recordOperations.cleanUp();
    }
}
