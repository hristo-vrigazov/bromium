package execution.application;

import config.ApplicationActionConfiguration;
import config.ParameterConfiguration;
import config.WebdriverActionConfiguration;
import execution.webdriver.WebdriverAction;
import execution.webdriver.WebdriverActionFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static config.WebdriverActionType.NOTHING;

/**
 * Created by hvrigazov on 18.03.17.
 */
public class TestCaseToApplicationActionConverter {

    private WebdriverActionFactory webdriverActionFactory;

    public TestCaseToApplicationActionConverter(WebdriverActionFactory webdriverActionFactory) {
        this.webdriverActionFactory = webdriverActionFactory;
    }

    public ApplicationAction convert(ApplicationActionConfiguration applicationActionConfiguration,
                                     Map<String, String> testCaseStep) {
        Optional<WebdriverAction> precondition =
                convertAction(applicationActionConfiguration.getConditionBeforeExecution(), testCaseStep);
        Optional<WebdriverAction> webdriverAction =
                convertAction(applicationActionConfiguration.getWebdriverAction(),
                        testCaseStep,
                        applicationActionConfiguration.isExpectsHttpRequest());
        Optional<WebdriverAction> postCondition =
                convertAction(applicationActionConfiguration.getConditionAfterExecution(), testCaseStep);
        return new ConvertedApplicationAction(precondition, webdriverAction, postCondition);
    }

    private Optional<WebdriverAction> convertAction(WebdriverActionConfiguration webdriverActionConfiguration,
                                                    Map<String, String> testCaseStep) {
        return convertAction(webdriverActionConfiguration, testCaseStep, false);
    }

    private Optional<WebdriverAction> convertAction(WebdriverActionConfiguration webdriverActionConfiguration,
                                                    Map<String, String> testCaseStep,
                                                    boolean expectHttpRequest) {
        String webdriverActionType = webdriverActionConfiguration.getWebdriverActionType();
        if (webdriverActionType.equals(NOTHING.toString())) {
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

        WebdriverAction webdriverAction = webdriverActionFactory.create(webdriverActionType, parameters);
        return Optional.of(webdriverAction);
    }

    private class ConvertedApplicationAction implements ApplicationAction {
        private Optional<WebdriverAction> precondition;
        private Optional<WebdriverAction> webdriverAction;
        private Optional<WebdriverAction> postcondition;

        private ConvertedApplicationAction(Optional<WebdriverAction> precondition,
                                           Optional<WebdriverAction> webdriverAction,
                                           Optional<WebdriverAction> postcondition) {
            this.precondition = precondition;
            this.webdriverAction = webdriverAction;
            this.postcondition = postcondition;
        }

        @Override
        public Optional<WebdriverAction> getPrecondition() {
            return precondition;
        }

        @Override
        public Optional<WebdriverAction> getWebdriverAction() {
            return webdriverAction;
        }

        @Override
        public Optional<WebdriverAction> getPostcondition() {
            return postcondition;
        }
    }
}
