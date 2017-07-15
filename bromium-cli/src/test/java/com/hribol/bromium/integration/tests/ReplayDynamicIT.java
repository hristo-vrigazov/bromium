package com.hribol.bromium.integration.tests;

/**
 * Created by hvrigazov on 15.07.17.
 */
public class ReplayDynamicIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayDynamicIT() {
        super("integration-tests/demo.json", "integration-tests/dynamic.json");
    }
}
