package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.TYPE_TEXT_TEST_CASE;

/**
 * Created by hvrigazov on 16.07.17.
 */
public class ReplayTypeTextIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayTypeTextIT() {
        super(DEMO_CONFIGURATION, TYPE_TEXT_TEST_CASE);
    }
}
