package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.TYPE_TEXT_TEST_CASE;

/**
 * Created by hvrigazov on 16.07.17.
 */
public class ReplayTypeTextIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayTypeTextIT() {
        super(DEMO_CONFIGURATION, TYPE_TEXT_TEST_CASE);
    }
}
