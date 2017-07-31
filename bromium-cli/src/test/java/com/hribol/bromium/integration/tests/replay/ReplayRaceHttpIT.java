package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.RACE_HTTP_TEST_CASE;

/**
 * Created by hvrigazov on 15.07.17.
 */
public class ReplayRaceHttpIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayRaceHttpIT() {
        super(DEMO_CONFIGURATION, RACE_HTTP_TEST_CASE);
    }
}
