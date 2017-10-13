package com.hribol.bromium.core.utils;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Responsible for supplying a list of {@link ApplicationActionConfiguration} that are
 * of given type - one of the constants in {@link WebDriverActions} or a custom action.
 */
public class ActionsFilter {

    private List<ApplicationActionConfiguration> applicationActionConfigurations;

    public ActionsFilter(List<ApplicationActionConfiguration> applicationActionConfigurations) {
        this.applicationActionConfigurations = applicationActionConfigurations;
    }

    /**
     * Filters the actions supplied in the constructor that are of a given type
     * @param webDriverActionType the type on which we want to filter
     * @return a list of the configurations that are of this file
     */
    public List<ApplicationActionConfiguration> filter(String webDriverActionType) {
        return applicationActionConfigurations.stream()
                .filter(configuration -> actionIsFromType(configuration, webDriverActionType))
                .collect(Collectors.toList());
    }

    /**
     * Checks whether the application action configuration is of the given web driver action type -
     * one of the constants in {@link WebDriverActions} or custom action.
     * @param applicationActionConfiguration The action configuration that will be tested
     * @param webDriverActionType The candidate type, one of the constants in {@link WebDriverActions} or custom action
     * @return whether the action is from the given type
     */
    public boolean actionIsFromType(ApplicationActionConfiguration applicationActionConfiguration,
                                    String webDriverActionType) {
        return applicationActionConfiguration.getWebDriverAction().getWebDriverActionType().equals(webDriverActionType);
    }
}
