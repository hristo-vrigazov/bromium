package com.hribol.bromium.common.generation.replay;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.Map;

/**
 * Generates javascript by given {@link StepAndActionConfiguration}
 */
public class ReplayGeneratorByStepAndActionConfiguration implements JavascriptGenerator<StepAndActionConfiguration> {

    private JavascriptGenerator<StepAndWebDriverActionConfiguration> generator;
    private StepAndWebDriverActionConfigurationSupplier supplier;

    @Inject
    public ReplayGeneratorByStepAndActionConfiguration(JavascriptGenerator<StepAndWebDriverActionConfiguration> generator,
                                                       StepAndWebDriverActionConfigurationSupplier supplier) {
        this.generator = generator;
        this.supplier = supplier;
    }

    @Override
    public String generate(StepAndActionConfiguration generationInformation) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> testCaseStep = generationInformation.getTestCaseStep();
        ApplicationActionConfiguration applicationActionConfiguration = generationInformation.getApplicationActionConfiguration();
        int index = generationInformation.getIndex();

        StepAndWebDriverActionConfiguration precondition = supplier.get(testCaseStep,
                index,
                applicationActionConfiguration.getConditionBeforeExecution());
        stringBuilder.append(generator.generate(precondition));
        stringBuilder.append(System.lineSeparator());

        StepAndWebDriverActionConfiguration action = supplier.get(testCaseStep,
                index,
                applicationActionConfiguration.getWebDriverAction());
        stringBuilder.append(generator.generate(action));
        stringBuilder.append(System.lineSeparator());
        
        StepAndWebDriverActionConfiguration postcondition = supplier.get(testCaseStep,
                index,
                applicationActionConfiguration.getConditionAfterExecution());
        stringBuilder.append(generator.generate(postcondition));
        stringBuilder.append(System.lineSeparator());


        return stringBuilder.toString();
    }
}
