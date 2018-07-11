package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.NOTHING;

/**
 * Converts a test case step to an application action
 */
public class TestCaseStepToApplicationActionConverter {

    private WebDriverActionFactory webDriverActionFactory;

    /**
     * Creates a {@link TestCaseStepToApplicationActionConverter} instance, by a given
     * factory for webDriver actions.
     * @param webDriverActionFactory the factory to be used for creating application actions
     */
    public TestCaseStepToApplicationActionConverter(WebDriverActionFactory webDriverActionFactory) {
        this.webDriverActionFactory = webDriverActionFactory;
    }

    /**
     * Creates an {@link ApplicationAction} by a given {@link ApplicationActionConfiguration}
     * and a test case step.
     * @param applicationActionConfiguration the application action configuration
     * @param testCaseStep the test case step
     * @param i
     * @return the created application action
     */
    public ApplicationAction convert(ApplicationActionConfiguration applicationActionConfiguration,
                                     Map<String, String> testCaseStep,
                                     int i) {
        WebDriverActionConfiguration conditionBeforeExecution = applicationActionConfiguration.getConditionBeforeExecution();
        Optional<WebDriverAction> precondition = convertAction(conditionBeforeExecution, testCaseStep, i);
        WebDriverActionConfiguration action = applicationActionConfiguration.getWebDriverAction();
        Boolean expectHttpRequest = applicationActionConfiguration.expectsHttpRequest();
        Optional<WebDriverAction> webdriverAction = convertAction(action, testCaseStep, i, expectHttpRequest);
        WebDriverActionConfiguration conditionAfterExecution = applicationActionConfiguration.getConditionAfterExecution();
        Optional<WebDriverAction> postCondition = convertAction(conditionAfterExecution, testCaseStep, i);
        return new ConvertedApplicationAction(precondition, webdriverAction, postCondition);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    int step) {
        return convertAction(webDriverActionConfiguration, testCaseStep, step, false);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    int step,
                                                    boolean expectHttpRequest) {
        String webdriverActionType = webDriverActionConfiguration.getWebDriverActionType();
        if (webdriverActionType.equals(NOTHING)) {
            return Optional.empty();
        }

        Map<String, ParameterConfiguration> parametersConfigurations = webDriverActionConfiguration
                .getParametersConfiguration();
        Map<String, String> parameters = new HashMap<>();

        parameters.put(EVENT, testCaseStep.get(EVENT));

        for (String parameterName: parametersConfigurations.keySet()) {
            ParameterConfiguration parameterConfiguration = parametersConfigurations.get(parameterName);

            if (parameterConfiguration.isExposed()) {
                String alias = parameterConfiguration.getAlias();
                String name = parameterConfiguration.getParameterName();
                String value = testCaseStep.get(alias);
                parameters.put(name, value);
            } else {
                String name = parameterConfiguration.getParameterName();
                String value = parameterConfiguration.getValue();
                parameters.put(name, value);
            }
        }

        WebDriverAction webDriverAction = webDriverActionFactory.create(webdriverActionType, parameters,
                step, expectHttpRequest);
        return Optional.of(webDriverAction);
    }

}
