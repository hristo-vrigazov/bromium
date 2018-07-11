package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.utils.Constants.EVENT;

/**
 * Generates javascript code by given {@link StepsAndConfiguration}
 */
public class ReplayingJavascriptGenerator implements JavascriptGenerator<StepsAndConfiguration> {

    private String baseTemplate;
    private JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration;
    private StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier;

    private final static Logger logger = LoggerFactory.getLogger(ReplayingJavascriptGenerator.class);

    public ReplayingJavascriptGenerator(String baseTemplate,
                                        JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration,
                                        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier) {
        this.baseTemplate = baseTemplate;
        this.generatorByStepAndActionConfiguration = generatorByStepAndActionConfiguration;
        this.stepAndActionConfigurationSupplier = stepAndActionConfigurationSupplier;
    }

    @Override
    public String generate(StepsAndConfiguration generationInformation) {
        long started = System.currentTimeMillis();
        String generated = generateReplayingCode(generationInformation);
        long took = System.currentTimeMillis() - started;
        logger.info("Generation took {}ms", took);
        return generated;
    }

    private String generateReplayingCode(StepsAndConfiguration generationInformation) {
        ApplicationConfiguration applicationConfiguration = generationInformation.getApplicationConfiguration();
        TestScenarioSteps testCaseSteps = generationInformation.getTestCaseSteps();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseTemplate);
        stringBuilder.append(System.lineSeparator()).append(System.lineSeparator());

        for (int i = 0; i < testCaseSteps.size(); i++) {
            Map<String, String> testCaseStep = testCaseSteps.get(i);
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
            StepAndActionConfiguration stepAndActionConfiguration = stepAndActionConfigurationSupplier
                    .get(testCaseStep, i, applicationActionConfiguration);
            stringBuilder.append(generatorByStepAndActionConfiguration.generate(stepAndActionConfiguration));
            stringBuilder.append(System.lineSeparator());

        }

        return stringBuilder.toString();
    }
}
