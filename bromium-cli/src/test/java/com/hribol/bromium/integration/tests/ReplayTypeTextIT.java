package com.hribol.bromium.integration.tests;

/**
 * Created by hvrigazov on 16.07.17.
 */
public class ReplayTypeTextIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayTypeTextIT() {
        super("integration-tests/demo.json", "integration-tests/text-field.json");
    }
}
