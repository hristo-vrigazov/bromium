package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.TestScenarioSteps;

import java.io.IOException;

/**
 * Dumps recorded {@link TestScenarioSteps}
 */
public interface StepsDumper {

    /**
     * Dumps recorded {@link TestScenarioSteps}
     * @param testScenarioSteps The steps that will be dumped
     * @param outputFile The file that we should output the steps to
     * @throws IOException
     */
    void dump(TestScenarioSteps testScenarioSteps, String outputFile) throws IOException;

}
