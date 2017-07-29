package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;

import java.io.IOException;

/**
 * Created by hvrigazov on 09.03.17.
 */
public class RecordBrowser {

    private final String baseUrl;
    private final RecordOperations recordOperations;

    public RecordBrowser(String baseUrl,
                         RecordOperations recordOperations) throws IOException {
        this.baseUrl = baseUrl;
        this.recordOperations = recordOperations;
    }

    public void record() throws IOException {
        recordOperations.prepareRecord();
        recordOperations.open(baseUrl);
    }

    public TestScenarioSteps getTestCaseSteps() {
        return recordOperations.getTestCaseSteps();
    }

    public void cleanUp() {
        recordOperations.cleanUpRecord();
    }
}
