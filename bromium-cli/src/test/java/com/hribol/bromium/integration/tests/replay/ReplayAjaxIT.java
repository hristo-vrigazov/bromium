package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.AJAX_TEST_CASE;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayAjaxIT extends IntegrationTestAssertingThatStatusIsSuccess {

    public ReplayAjaxIT() {
        super(DEMO_CONFIGURATION, AJAX_TEST_CASE);
    }

}
