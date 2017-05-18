package core.execution.application;

import com.hribol.spiderman.replay.config.ApplicationActionConfiguration;
import com.hribol.spiderman.replay.config.ParameterConfiguration;
import com.hribol.spiderman.replay.config.WebDriverActionConfiguration;
import core.actions.WebDriverAction;
import core.execution.factory.WebDriverActionFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;
import static com.hribol.spiderman.replay.config.utils.Constants.NOTHING;

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
     * @return the created application action
     */
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

        WebDriverAction webDriverAction = webDriverActionFactory.create(webdriverActionType, parameters, expectHttpRequest);
        return Optional.of(webDriverAction);
    }

}
