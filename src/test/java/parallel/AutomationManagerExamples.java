package parallel;

import browser.TestScenarioRunner;
import execution.AutomationResult;
import execution.ChromeDriverActionExecutor;
import execution.PredefinedWebdriverActionFactory;
import execution.WebdriverActionExecutor;
import org.junit.Test;
import suite.AutomationManager;

import java.io.IOException;
import java.util.List;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class AutomationManagerExamples {

    @Test
    public void sequentialExample() throws IOException {
        String pathToApplicationConfiguration = "/home/hvrigazov/github/selenium-record-replay/tennisKafe.json";
        String pathToChromedriver = "/home/hvrigazov/github/selenium-record-replay/chromedriver";
        String pathToTestScenario = "/home/hvrigazov/github/selenium-record-replay/output.json";

        ChromeDriverActionExecutor.Builder executorBuilder = ChromeDriverActionExecutor
                .builder()
                .pathToChromedriver(pathToChromedriver)
                .timeoutInSeconds(30)
                .measurementsPrecisionInMilliseconds(50);

        TestScenarioRunner.Builder testScenarioRunnerBuilder = TestScenarioRunner
                .builder()
                .pathToApplicationConfiguration(pathToApplicationConfiguration)
                .url("http://www.tenniskafe.com/")
                .webdriverActionFactory(new PredefinedWebdriverActionFactory());

        AutomationManager automationManager = new AutomationManager();

        getScenario(pathToTestScenario, executorBuilder, testScenarioRunnerBuilder);
        automationManager.addFasAutomation(getScenario(pathToTestScenario, executorBuilder, testScenarioRunnerBuilder),
                "0.csv", "0.har");
        automationManager.addFasAutomation(getScenario(pathToTestScenario, executorBuilder, testScenarioRunnerBuilder),
                "1.csv", "1.har");
        automationManager.addFasAutomation(getScenario(pathToTestScenario, executorBuilder, testScenarioRunnerBuilder),
                "2.csv", "2.har");

        List<AutomationResult> automationResultList = automationManager.runSequentially();

        System.out.println(automationResultList);
    }

    private WebdriverActionExecutor getScenario(String pathToTestScenario, ChromeDriverActionExecutor.Builder executor, TestScenarioRunner.Builder testScenarioRunner) throws IOException {
        return testScenarioRunner.executor(executor.build()).build().getReplayBrowser().getTestScenario(pathToTestScenario);
    }
}
