package com.hribol.spiderman.core.config;

import java.util.ArrayList;
import java.util.List;

/**
 * The configuration of an application. It describes how application-specific actions
 * are related to selenium actions. It is usually been read/written to a JSON file
 */
public class ApplicationConfiguration {
    private String applicationName;
    private String version;
    private List<ApplicationActionConfiguration> applicationActionConfigurationList;

    public ApplicationConfiguration() {
        this.applicationActionConfigurationList = new ArrayList<>();
    }

    /**
     * Gets the name of the application
     * @return the name of the application
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the name of the application
     * @param applicationName the name of the application
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * Gets the version of the application, e.g 0.0.1
     * @return the version of the application
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version of the application
     * @param version the version of the application
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the list of configurations of the action
     * @return the list of configurations of the action
     */
    public List<ApplicationActionConfiguration> getApplicationActionConfigurationList() {
        return applicationActionConfigurationList;
    }

    /**
     * Adds an application action configuration
     * @param applicationActionConfiguration the configuration to be added
     */
    public void addApplicationActionConfiguration(ApplicationActionConfiguration applicationActionConfiguration) {
        this.applicationActionConfigurationList.add(applicationActionConfiguration);
    }
}
