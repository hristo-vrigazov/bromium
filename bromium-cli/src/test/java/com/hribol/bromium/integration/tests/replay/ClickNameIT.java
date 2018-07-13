package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.CLICK_NAME_TEST_CASE;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;

public class ClickNameIT extends IntegrationTestAssertingThatStatusIsSuccess {

    public ClickNameIT() {
        super(DEMO_CONFIGURATION, CLICK_NAME_TEST_CASE);
    }
}
