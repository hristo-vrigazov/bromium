package com.hribol.bromium.common.generation.replay;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.Map;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class ReplayGeneratorByStepAndActionConfiguration implements JavascriptGenerator<StepAndActionConfiguration> {

    private JavascriptGenerator<StepAndWebDriverActionConfiguration> generator;

    @Inject
    public ReplayGeneratorByStepAndActionConfiguration(JavascriptGenerator<StepAndWebDriverActionConfiguration> generator) {
        this.generator = generator;
    }

    @Override
    public String generate(StepAndActionConfiguration generationInformation) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> testCaseStep = generationInformation.getTestCaseStep();
        ApplicationActionConfiguration applicationActionConfiguration = generationInformation.getApplicationActionConfiguration();

        StepAndWebDriverActionConfiguration precondition = new StepAndWebDriverActionConfiguration(testCaseStep,
                applicationActionConfiguration.getConditionBeforeExecution());
        stringBuilder.append(generator.generate(precondition));

        StepAndWebDriverActionConfiguration action = new StepAndWebDriverActionConfiguration(testCaseStep,
                applicationActionConfiguration.getWebDriverAction());
        stringBuilder.append(generator.generate(action));

        StepAndWebDriverActionConfiguration postcondition = new StepAndWebDriverActionConfiguration(testCaseStep,
                applicationActionConfiguration.getConditionAfterExecution());
        stringBuilder.append(generator.generate(postcondition));

        return stringBuilder.toString();
    }
}
