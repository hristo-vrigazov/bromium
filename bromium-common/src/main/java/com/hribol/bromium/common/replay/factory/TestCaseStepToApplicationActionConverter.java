package com.hribol.bromium.common.replay.factory;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.ParameterValues;
import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

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
    @Inject
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
        //TODO: precondition has hardcoded context
        Optional<WebDriverAction> precondition = convertAction(conditionBeforeExecution, testCaseStep, i,
                parameters -> webDriver -> webDriver);
        WebDriverActionConfiguration action = applicationActionConfiguration.getWebDriverAction();
        Boolean expectHttpRequest = applicationActionConfiguration.expectsHttpRequest();
        Function<ParameterValues, SearchContextFunction> contextProvider = applicationActionConfiguration.getContextProvider().getFunction();
        Optional<WebDriverAction> webdriverAction = convertAction(action, testCaseStep, i, expectHttpRequest, contextProvider);
        WebDriverActionConfiguration conditionAfterExecution = applicationActionConfiguration.getConditionAfterExecution();
        //TODO: postcondition has hardcoded context
        Optional<WebDriverAction> postCondition = convertAction(conditionAfterExecution, testCaseStep, i,
                parameters -> webDriver -> webDriver);
        return new ConvertedApplicationAction(precondition, webdriverAction, postCondition);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    int step,
                                                    Function<ParameterValues, SearchContextFunction> contextProvider) {
        return convertAction(webDriverActionConfiguration, testCaseStep, step, false, contextProvider);
    }

    private Optional<WebDriverAction> convertAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    int step,
                                                    boolean expectHttpRequest,
                                                    Function<ParameterValues, SearchContextFunction> webDriverSearchContextFunction) {
        String webdriverActionType = webDriverActionConfiguration.getWebDriverActionType();
        if (webdriverActionType.equals(NOTHING)) {
            return Optional.empty();
        }

        Map<String, ParameterConfiguration> parametersConfigurations = webDriverActionConfiguration
                .getParametersConfiguration();

        ParameterValues parameters = new ParameterValues();
        parameters.putAll(testCaseStep);

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

        ActionCreationContext context = new ActionCreationContext(parameters, step, expectHttpRequest, webDriverSearchContextFunction);
        WebDriverAction webDriverAction = webDriverActionFactory.create(webdriverActionType, context);
        return Optional.of(webDriverAction);
    }

}
