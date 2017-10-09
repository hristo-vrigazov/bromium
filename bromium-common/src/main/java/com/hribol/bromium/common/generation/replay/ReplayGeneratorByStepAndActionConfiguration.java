package com.hribol.bromium.common.generation.replay;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
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

        StepAndWebDriverActionConfiguration precondition = supplier.get(testCaseStep,
                applicationActionConfiguration.getConditionBeforeExecution());
        stringBuilder.append(generator.generate(precondition));

        StepAndWebDriverActionConfiguration action = supplier.get(testCaseStep,
                applicationActionConfiguration.getWebDriverAction());
        stringBuilder.append(generator.generate(action));

        StepAndWebDriverActionConfiguration postcondition = supplier.get(testCaseStep,
                applicationActionConfiguration.getConditionAfterExecution());
        stringBuilder.append(generator.generate(postcondition));

        return stringBuilder.toString();
    }
}
