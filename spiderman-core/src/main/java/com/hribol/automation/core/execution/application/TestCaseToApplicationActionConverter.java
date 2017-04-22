package com.hribol.automation.core.execution.application;

import com.hribol.automation.core.config.ParameterConfiguration;
import com.hribol.automation.core.config.ApplicationActionConfiguration;
import com.hribol.automation.core.config.WebdriverActionConfiguration;
import com.hribol.automation.core.config.WebdriverActionType;
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
                convertAction(applicationActionConfiguration.getWebdriverAction(),
                        testCaseStep,
                        applicationActionConfiguration.expectsHttpRequest());
        Optional<WebDriverAction> postCondition =
                convertAction(applicationActionConfiguration.getConditionAfterExecution(), testCaseStep);
        return new ConvertedApplicationAction(precondition, webdriverAction, postCondition);
    }

    private Optional<WebDriverAction> convertAction(WebdriverActionConfiguration webdriverActionConfiguration,
                                                    Map<String, String> testCaseStep) {
        return convertAction(webdriverActionConfiguration, testCaseStep, false);
    }

    private Optional<WebDriverAction> convertAction(WebdriverActionConfiguration webdriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    boolean expectHttpRequest) {
        String webdriverActionType = webdriverActionConfiguration.getWebdriverActionType();
        if (webdriverActionType.equals(WebdriverActionType.NOTHING.toString())) {
            return Optional.empty();
        }

        Map<String, ParameterConfiguration> parametersConfigurations = webdriverActionConfiguration
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

    private class ConvertedApplicationAction implements ApplicationAction {
        private Optional<WebDriverAction> precondition;
        private Optional<WebDriverAction> webdriverAction;
        private Optional<WebDriverAction> postcondition;

        private ConvertedApplicationAction(Optional<WebDriverAction> precondition,
                                           Optional<WebDriverAction> webdriverAction,
                                           Optional<WebDriverAction> postcondition) {
            this.precondition = precondition;
            this.webdriverAction = webdriverAction;
            this.postcondition = postcondition;
        }

        @Override
        public Optional<WebDriverAction> getPrecondition() {
            return precondition;
        }

        @Override
        public Optional<WebDriverAction> getWebdriverAction() {
            return webdriverAction;
        }

        @Override
        public Optional<WebDriverAction> getPostcondition() {
            return postcondition;
        }
    }
}
