package com.hribol.bromium.common.parsing;

import com.google.common.base.Charsets;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.StepsReader;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.util.test.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.hribol.bromium.core.utils.Constants.EVENT;

/**
 * Parses steps written in Bromium DSL format
 */
public class DslStepsReader implements StepsReader {

    private Map<String, ApplicationActionConfiguration> actionConfigurations;

    public DslStepsReader(Map<String, ApplicationActionConfiguration> actionConfigurations) {
        this.actionConfigurations = actionConfigurations;
    }


    @Override
    public TestScenarioSteps readSteps(InputStream inputStream) throws IOException {
        List<String> lines = IOUtils.readLines(inputStream, Charsets.UTF_8);
        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();

        for (String line: lines) {
            Map<String, String> step = new HashMap<>();
            String[] split = line.split(":", 2);
            assert split.length == 2;
            String actionName = split[0];
            step.put(EVENT, actionName);
            ApplicationActionConfiguration actionConfiguration = actionConfigurations.get(actionName);
            if (actionConfiguration == null) {
                throw new IllegalStateException("The action " + actionName + " is not present in the configuration!");
            }
            List<SyntaxDefinitionConfiguration> syntaxDefinitionConfigurationList = actionConfiguration.getSyntaxDefinitionConfigurationList();

            String actionInvocation = split[1];

            List<Integer> checkpoints = syntaxDefinitionConfigurationList
                    .stream()
                    .map(syntaxDefinitionConfiguration -> actionInvocation.indexOf(syntaxDefinitionConfiguration.getContent()))
                    .collect(Collectors.toList());

            for (int i = 0; i < checkpoints.size() - 1; i++) {
                int exposedParameterStartIndex = checkpoints.get(i) + syntaxDefinitionConfigurationList.get(i).getContent().length();
                int exposedParameterEndIndex = checkpoints.get(i + 1);
                String exposedParameterKey = syntaxDefinitionConfigurationList.get(i).getExposedParameter();
                String exposedParameterValue = actionInvocation
                        .substring(exposedParameterStartIndex, exposedParameterEndIndex)
                        .trim();
                step.put(exposedParameterKey, exposedParameterValue);
            }

            int last = checkpoints.size() - 1;
            int exposedParameterStartIndex = checkpoints.get(last) + syntaxDefinitionConfigurationList.get(last).getContent().length();
            if (exposedParameterStartIndex < actionInvocation.length() - 1) {
                int exposedParameterEndIndex = actionInvocation.length();
                String exposedParameterKey = syntaxDefinitionConfigurationList.get(last).getExposedParameter();
                String exposedParameterValue = actionInvocation
                        .substring(exposedParameterStartIndex, exposedParameterEndIndex)
                        .trim();
                step.put(exposedParameterKey, exposedParameterValue);
            }

            testScenarioSteps.add(step);
        }

        return testScenarioSteps;
    }


}
