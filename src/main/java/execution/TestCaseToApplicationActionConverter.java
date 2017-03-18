package execution;

import actions.ClickClassByText;
import config.ApplicationActionConfiguration;
import config.ParameterConfiguration;
import config.WebdriverActionConfiguration;

import java.util.Map;
import java.util.Optional;

import static config.WebdriverActionType.NOTHING;

/**
 * Created by hvrigazov on 18.03.17.
 */
public class TestCaseToApplicationActionConverter {
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

        if (webdriverActionType.equals("CLICK_CLASS_BY_TEXT")) {
            ParameterConfiguration parameterConfiguration = webdriverActionConfiguration
                    .getParametersConfiguration().get("initialCollectorClass");
            String initialCollectorClass = parameterConfiguration.getValue();
            String text = testCaseStep.get("text");
            String eventName = testCaseStep.get("event");

            WebdriverAction webdriverAction =
                    new ClickClassByText(initialCollectorClass, text, eventName, expectHttpRequest);

            return Optional.of(webdriverAction);
        }

        return Optional.empty();
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
