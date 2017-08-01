package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.DYNAMIC_TEST_CASE;

/**
 * Created by hvrigazov on 15.07.17.
 */
public class ReplayDynamicIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayDynamicIT() {
        super(DEMO_CONFIGURATION, DYNAMIC_TEST_CASE);
    }
}
