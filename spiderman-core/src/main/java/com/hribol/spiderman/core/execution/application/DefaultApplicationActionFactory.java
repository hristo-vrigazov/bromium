package com.hribol.spiderman.core.execution.application;

import com.hribol.spiderman.core.config.ApplicationActionConfiguration;
import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.spiderman.core.utils.Constants.EVENT;

/**
 * The {@link ApplicationActionFactory} that will be used most frequently.
 * It converts an {@link ApplicationConfiguration} by a given {@link WebDriverActionFactory} and
 * an initial url {@link #url}. The url is separate from the other application actions, because
 * we may want to try to test the application running on a different host.
 */
public class DefaultApplicationActionFactory implements ApplicationActionFactory {

    private String url;
    private String initialPageLoadingEventName;
    private Map<String, ApplicationActionConfiguration> nameToConfiguration;
    private TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter;

    public DefaultApplicationActionFactory(String url,
                                           ApplicationConfiguration applicationConfiguration) {
        this(url, applicationConfiguration, new PredefinedWebDriverActionFactory(url));
    }

    public DefaultApplicationActionFactory(String url,
                                           ApplicationConfiguration applicationConfiguration,
                                           WebDriverActionFactory webDriverActionFactory) {
        this(url, applicationConfiguration, new TestCaseStepToApplicationActionConverter(webDriverActionFactory));
    }

    public DefaultApplicationActionFactory(String url,
                                           ApplicationConfiguration applicationConfiguration,
                                           TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter) {
        this.nameToConfiguration = new HashMap<>();
        this.url = url;

        for (ApplicationActionConfiguration applicationActionConfiguration: applicationConfiguration.getApplicationActionConfigurationList()) {
            nameToConfiguration.put(applicationActionConfiguration.getName(), applicationActionConfiguration);
        }

        this.initialPageLoadingEventName = "INITIAL_PAGE_LOAD_" + applicationConfiguration.getApplicationName();
        this.testCaseStepToApplicationActionConverter = testCaseStepToApplicationActionConverter;
    }

    @Override
    public ApplicationAction getInitialPageLoading() {
        return new ApplicationPageLoading(url, initialPageLoadingEventName);
    }

    @Override
    public ApplicationAction create(Map<String, String> testCaseStep) {
        String name = testCaseStep.get(EVENT);
        ApplicationActionConfiguration applicationActionConfiguration = nameToConfiguration.get(name);
        return testCaseStepToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep);
    }
}
