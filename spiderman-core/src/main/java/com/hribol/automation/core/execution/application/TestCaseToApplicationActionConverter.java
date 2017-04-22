package com.hribol.automation.core.execution.application;

import com.hribol.automation.core.actions.ConvertedApplicationAction;
import com.hribol.automation.core.config.ApplicationActionConfiguration;
import com.hribol.automation.core.config.ParameterConfiguration;
import com.hribol.automation.core.config.WebDriverActionConfiguration;
import com.hribol.automation.core.execution.webdriver.WebDriverAction;
import com.hribol.automation.core.execution.webdriver.WebDriverActionFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 18.03.17.
 */
public class TestCaseToApplicationActionConverter {

    private WebDriverActionFactory webDriverActionFactory;

    public TestCaseToApplicationActionConverter(WebDriverActionFactory webDriverActionFactory) {
        this.webDriverActionFactory = webDriverActionFactory;
    }

    public ApplicationAction convert(ApplicationActionConfiguration applicationActionConfiguration,
                                     Map<String, String> testCaseStep) {
        Optional<WebDriverAction> precondition =
                convertAction(applicationActionConfiguration.getConditionBeforeExecution(), testCaseStep);
        Optional<WebDriverAction> webdriverAction =
                convertAction(applicationActionConfiguration.getWebDriverAction(),
                        testCaseStep,
                        applicationActionConfiguration.expectsHttpRequest());
        Optional<WebDriverAction> postCondition =
                convertAction(applicationActionConfiguration.getConditionAfterExecution(), testCaseStep);
        return new ConvertedApplicationAction(precondition, webdriverAction, postCondition);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep) {
        return convertAction(webDriverActionConfiguration, testCaseStep, false);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    boolean expectHttpRequest) {
        String webdriverActionType = webDriverActionConfiguration.getWebDriverActionType();
        if (webdriverActionType.equals("NOTHING")) {
            return Optional.empty();
        }

        Map<String, ParameterConfiguration> parametersConfigurations = webDriverActionConfiguration
                .getParametersConfiguration();
        Map<String, Object> parameters = new HashMap<>();

        parameters.put("event", testCaseStep.get("event"));
        parameters.put("expectsHttp", expectHttpRequest);

        for (String parameterName: parametersConfigurations.keySet()) {
            ParameterConfiguration parameterConfiguration = parametersConfigurations.get(parameterName);

            if (parameterConfiguration.isExposed()) {
                String alias = parameterConfiguration.getAlias();
                String value = testCaseStep.get(alias);
                parameters.put(alias, value);
            } else {
                String name = parameterConfiguration.getParameterName();
                String value = parameterConfiguration.getValue();
                parameters.put(name, value);
            }
        }

        WebDriverAction webDriverAction = webDriverActionFactory.create(webdriverActionType, parameters);
        return Optional.of(webDriverAction);
    }

}
