package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.SELECT_VALUE_TEST_CASE;

public class SelectValueIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public SelectValueIT() {
        super(DEMO_CONFIGURATION, SELECT_VALUE_TEST_CASE);
    }
}
