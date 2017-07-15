package com.hribol.bromium.integration.tests;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayAjaxIT extends IntegrationTestAssertingThatStatusIsSuccess {

    public ReplayAjaxIT() {
        super("integration-tests/demo.json", "integration-tests/ajax.json");
    }

}
