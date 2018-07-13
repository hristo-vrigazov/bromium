package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.CLICK_ID_TEST_CASE;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;

public class ClickIdIT extends IntegrationTestAssertingThatStatusIsSuccess {

    public ClickIdIT() {
        super(DEMO_CONFIGURATION, CLICK_ID_TEST_CASE);
    }

}
