package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.utils.Constants.EVENT;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class ReplayingJavascriptGenerator implements JavascriptGenerator<StepsAndConfiguration> {

    private String baseTemplate;
    private JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration;
    private StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier;

    public ReplayingJavascriptGenerator(String baseTemplate,
                                        JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration,
                                        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier) {
        this.baseTemplate = baseTemplate;
        this.generatorByStepAndActionConfiguration = generatorByStepAndActionConfiguration;
        this.stepAndActionConfigurationSupplier = stepAndActionConfigurationSupplier;
    }

    @Override
    public String generate(StepsAndConfiguration generationInformation) {
        ApplicationConfiguration applicationConfiguration = generationInformation.getApplicationConfiguration();
        List<Map<String, String>> testCaseSteps = generationInformation.getTestCaseSteps();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseTemplate);
        stringBuilder.append(System.lineSeparator()).append(System.lineSeparator());

        for (Map<String, String> testCaseStep: testCaseSteps) {
            String eventName = testCaseStep.get(EVENT);

            Optional<ApplicationActionConfiguration> optional = applicationConfiguration
                    .getApplicationActionConfigurationList()
                    .stream()
                    .filter(applicationActionConfiguration -> applicationActionConfiguration.getName().equals(eventName))
                    .findAny();

            if (!optional.isPresent()) {
                throw new IllegalStateException("The application action" + eventName + "in the test case step is not present in the configuration");
            }
            ApplicationActionConfiguration applicationActionConfiguration = optional.get();
            StepAndActionConfiguration stepAndActionConfiguration = stepAndActionConfigurationSupplier.get(testCaseStep, applicationActionConfiguration);
            stringBuilder.append(generatorByStepAndActionConfiguration.generate(stepAndActionConfiguration));

        }

        return stringBuilder.toString();
    }
}
