package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.CLICK_CLASS_BY_TEXT_TEST_CASE;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ReplayClickClassByTextIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ReplayClickClassByTextIT() {
        super(DEMO_CONFIGURATION, CLICK_CLASS_BY_TEXT_TEST_CASE);
    }
}
