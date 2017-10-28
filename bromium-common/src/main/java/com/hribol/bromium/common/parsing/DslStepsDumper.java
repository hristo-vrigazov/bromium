package com.hribol.bromium.common.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.StepsDumper;

import java.io.*;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;

/**
 * Dumps recorded steps in a human readable format by given syntax definitions present in
 * {@link ApplicationActionConfiguration}s
 */
public class DslStepsDumper implements StepsDumper {

    private Map<String, ApplicationActionConfiguration> actionConfigurations;

    public DslStepsDumper(Map<String, ApplicationActionConfiguration> actionConfigurations) {
        this.actionConfigurations = actionConfigurations;
    }

    @Override
    public void dump(TestScenarioSteps testScenarioSteps, String outputFile) throws IOException {
        File file = new File(outputFile);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            for (Map<String, String> step : testScenarioSteps) {
                List<SyntaxDefinitionConfiguration> syntaxDefinitions = actionConfigurations.get(step.get(EVENT)).getSyntaxDefinitionConfigurationList();
                StringBuilder lineBuilder = new StringBuilder();

                for (SyntaxDefinitionConfiguration syntaxDefinition: syntaxDefinitions) {
                    if (syntaxDefinition.getContent() != null) {
                        lineBuilder
                                .append(syntaxDefinition.getContent())
                                .append(' ');
                    }

                    if (syntaxDefinition.getExposedParameter() != null) {
                        lineBuilder
                                .append(step.get(syntaxDefinition.getExposedParameter()))
                                .append(' ');
                    }
                }

                bufferedWriter.write(lineBuilder.toString());
                bufferedWriter.newLine();
            }
        }

    }
}
