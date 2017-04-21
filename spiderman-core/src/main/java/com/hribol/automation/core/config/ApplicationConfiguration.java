package com.hribol.automation.core.config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ApplicationConfiguration {
    private String applicationName;
    private String version;
    private List<ApplicationActionConfiguration> applicationActionConfigurationList;

    public ApplicationConfiguration() {
        this.applicationActionConfigurationList = new ArrayList<>();
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ApplicationActionConfiguration> getApplicationActionConfigurationList() {
        return applicationActionConfigurationList;
    }

    public void addApplicationActionConfiguration(ApplicationActionConfiguration applicationActionConfiguration) {
        this.applicationActionConfigurationList.add(applicationActionConfiguration);
    }
}
