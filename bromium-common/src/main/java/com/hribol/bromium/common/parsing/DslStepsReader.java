package com.hribol.bromium.common.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.parsing.StepsReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

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
        return null;
    }


}
