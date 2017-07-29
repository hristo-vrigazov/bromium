package com.hribol.bromium.integration.tests.replay;

/**
 * Created by hvrigazov on 15.07.17.
 */
public class ReplayRaceHttpIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayRaceHttpIT() {
        super("integration-tests/demo.json", "integration-tests/race-http.json");
    }
}
