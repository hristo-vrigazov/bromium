package com.hribol.bromium.common.generation.replay;

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

    public ReplayingJavascriptGenerator(String baseTemplate, JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration) {
        this.baseTemplate = baseTemplate;
        this.generatorByStepAndActionConfiguration = generatorByStepAndActionConfiguration;
    }

    @Override
    public String generate(StepsAndConfiguration generationInformation) {
        ApplicationConfiguration applicationConfiguration = generationInformation.getApplicationConfiguration();
        List<Map<String, String>> testCaseSteps = generationInformation.getTestCaseSteps();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseTemplate);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            String eventName = testCaseStep.get(EVENT);

            Optional<ApplicationActionConfiguration> optional = applicationConfiguration
                    .getApplicationActionConfigurationList()
                    .stream()
                    .filter(applicationActionConfiguration -> applicationActionConfiguration.getName().equals(eventName))
                    .findAny();

            if (optional.isPresent()) {
                ApplicationActionConfiguration applicationActionConfiguration = optional.get();
                StepAndActionConfiguration stepAndActionConfiguration = new StepAndActionConfiguration(testCaseStep, applicationActionConfiguration);
                stringBuilder.append(generatorByStepAndActionConfiguration.generate(stepAndActionConfiguration));
            }
        }

        return stringBuilder.toString();
    }
}
