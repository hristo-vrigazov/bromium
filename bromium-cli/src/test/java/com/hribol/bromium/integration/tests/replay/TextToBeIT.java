package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.TEXT_TO_BE_TEST_CASE;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class TextToBeIT extends IntegrationTestAssertingThatStatusIsSuccess {

    public TextToBeIT() {
        super(DEMO_CONFIGURATION, TEXT_TO_BE_TEST_CASE);
    }
}
