package com.hribol.spiderman.core.execution.scenario;

import com.hribol.spiderman.core.execution.application.ApplicationAction;
import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.utils.ConfigurationUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestScenarioFactory {

    public TestScenario createFromFile(ApplicationActionFactory applicationActionFactory, String pathToSerializedTest) throws IOException {
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(pathToSerializedTest);
        return createFromTestCaseSteps(applicationActionFactory, testCaseSteps);
    }

    public TestScenario createFromTestCaseSteps(ApplicationActionFactory applicationActionFactory, List<Map<String, String>> testCaseSteps) {
        TestScenario testScenario = new TestScenario();

        Optional<WebDriverAction> initialPageLoading = applicationActionFactory.getInitialPageLoading().getWebdriverAction();
        testScenario.addWebDriverAction(initialPageLoading);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction =
                    applicationActionFactory.create(testCaseStep);

            testScenario.addWebDriverAction(domainSpecificAction.getPrecondition());
            testScenario.addWebDriverAction(domainSpecificAction.getWebdriverAction());
            testScenario.addWebDriverAction(domainSpecificAction.getPostcondition());
        }

        return testScenario;
    }

    public TestScenario createFromInputStream(ApplicationActionFactory applicationActionFactory, InputStream inputStream) throws IOException {
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(inputStream);
        return createFromTestCaseSteps(applicationActionFactory, testCaseSteps);
    }
}
