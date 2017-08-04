package com.hribol.bromium.core.utils;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.WebDriverActions.PAGE_LOADING;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.08.17.
 */
public class ActionsFilterTest {

    @Test
    public void includesTheCorrectItems() {
        ApplicationActionConfiguration configThatShouldBeIncluded = mock(ApplicationActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(configThatShouldBeIncluded.getWebDriverAction().getWebDriverActionType()).thenReturn(PAGE_LOADING);

        ApplicationActionConfiguration configThatShouldNotBeIncluded = mock(ApplicationActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(configThatShouldNotBeIncluded.getWebDriverAction().getWebDriverActionType()).thenReturn(CLICK_CSS_SELECTOR);

        List<ApplicationActionConfiguration> configurationList = Arrays.asList(configThatShouldBeIncluded, configThatShouldBeIncluded);
        ActionsFilter actionsFilter = new ActionsFilter(configurationList);

        List<ApplicationActionConfiguration> filteredActions = actionsFilter.filter(PAGE_LOADING);

        assertTrue(filteredActions.contains(configThatShouldBeIncluded));
        assertFalse(filteredActions.contains(configThatShouldNotBeIncluded));
    }
}
