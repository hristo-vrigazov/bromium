package com.hribol.automation.core.execution.application;

import com.hribol.automation.core.config.ApplicationActionConfiguration;
import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.execution.webdriver.WebdriverActionFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class DefaultApplicationActionFactory implements ApplicationActionFactory {

    private String url;
    private String initialPageLoadingEventName;
    private Map<String, ApplicationActionConfiguration> nameToConfiguration;
    private TestCaseToApplicationActionConverter testCaseToApplicationActionConverter;

    public DefaultApplicationActionFactory(String url,
                                           ApplicationConfiguration applicationConfiguration,
                                           WebdriverActionFactory webdriverActionFactory) {
        this.nameToConfiguration = new HashMap<>();
        this.url = url;

        for (ApplicationActionConfiguration applicationActionConfiguration: applicationConfiguration.getApplicationActionConfigurationList()) {
            nameToConfiguration.put(applicationActionConfiguration.getName(), applicationActionConfiguration);
        }

        this.initialPageLoadingEventName = "INITIAL_PAGE_LOAD_" + applicationConfiguration.getApplicationName() +
                        "_" + applicationConfiguration.getVersion();
        this.testCaseToApplicationActionConverter = new TestCaseToApplicationActionConverter(webdriverActionFactory);
    }

    @Override
    public ApplicationAction getInitialPageLoading() {
        return new ApplicationPageLoading(url, initialPageLoadingEventName);
    }

    @Override
    public ApplicationAction create(Map<String, String> testCaseStep) {
        String name = testCaseStep.get("event");
        ApplicationActionConfiguration applicationActionConfiguration = nameToConfiguration.get(name);
        return testCaseToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep);
    }
}
