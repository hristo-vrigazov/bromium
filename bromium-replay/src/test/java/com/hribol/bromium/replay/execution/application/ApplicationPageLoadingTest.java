package com.hribol.bromium.replay.execution.application;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ApplicationPageLoadingTest {

    @Test
    public void applicationPageLoadingHasNoPreconditionAndPostConditionButHasAction() {
        String url = "http://tenniskafe.com";
        String name = "eventName";
        ApplicationAction applicationPageLoading = new ApplicationPageLoading(url, name);

        assertFalse(applicationPageLoading.getPrecondition().isPresent());
        assertTrue(applicationPageLoading.getWebdriverAction().isPresent());
        assertFalse(applicationPageLoading.getPostcondition().isPresent());
    }
}
