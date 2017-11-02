package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.ELEMENT_PRESENSE_TEST_CASE;

/**
 * Created by hvrigazov on 02.11.17.
 */
public class ElementIsPresentIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public ElementIsPresentIT() {
        super(DEMO_CONFIGURATION, ELEMENT_PRESENSE_TEST_CASE);
    }
}
