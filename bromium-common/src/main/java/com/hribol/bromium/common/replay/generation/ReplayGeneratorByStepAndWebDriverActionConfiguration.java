package com.hribol.bromium.common.replay.generation;

import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.Map;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayGeneratorByStepAndWebDriverActionConfiguration implements JavascriptGenerator<StepAndWebDriverActionConfiguration> {
    @Override
    public String generate(StepAndWebDriverActionConfiguration generationInformation) {
        Map<String, String> testCaseStep = generationInformation.getTestCaseStep();

        return null;
    }
}
