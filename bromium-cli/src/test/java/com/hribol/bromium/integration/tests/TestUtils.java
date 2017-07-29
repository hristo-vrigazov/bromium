package com.hribol.bromium.integration.tests;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;

/**
 * Created by hvrigazov on 29.07.17.
 */
public class TestUtils {

    public static TestScenarioSteps exampleTestScenarioSteps() {
        TestScenarioSteps steps = new TestScenarioSteps();
        steps.add(ImmutableMap.of(
                "event", "mockEvent1",
                "text", "mockText"));

        steps.add(ImmutableMap.of(
                "event", "mockEvent2",
                "text", "mockText"));

        steps.add(ImmutableMap.of(
                "event", "mockEvent1",
                "text", "mockText1"));

        return steps;
    }
}
