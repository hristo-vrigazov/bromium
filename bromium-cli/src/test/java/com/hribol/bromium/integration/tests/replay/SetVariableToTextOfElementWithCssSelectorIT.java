package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TEST_CASE;

public class SetVariableToTextOfElementWithCssSelectorIT extends IntegrationTestAssertingThatStatusIsSuccess {
    public SetVariableToTextOfElementWithCssSelectorIT() {
        super(DEMO_CONFIGURATION, SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TEST_CASE);
    }
}
