package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.replay.execution.application.ApplicationAction;
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
