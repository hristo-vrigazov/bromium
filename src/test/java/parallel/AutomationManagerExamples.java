package parallel;

import browser.ReplayBrowserConfiguration;
import execution.executor.AutomationResult;
import execution.executor.WebDriverActionExecutor;
import execution.executor.WebDriverActionExecutorBase;
import execution.executor.WebdriverActionExecutorBuilder;
import execution.webdriver.PredefinedWebdriverActionFactory;
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

        WebdriverActionExecutorBuilder executorWebdriverActionExecutorBuilder = WebDriverActionExecutorBase
                .builder()
                .pathToDriverExecutable(pathToChromedriver)
                .timeoutInSeconds(30)
                .measurementsPrecisionInMilliseconds(50);

        ReplayBrowserConfiguration.Builder testScenarioRunnerBuilder = ReplayBrowserConfiguration
                .builder()
                .pathToApplicationConfiguration(pathToApplicationConfiguration)
                .url("http://www.tenniskafe.com/")
                .webdriverActionFactory(new PredefinedWebdriverActionFactory());

        AutomationManager automationManager = new AutomationManager();

        getScenario(pathToTestScenario, executorWebdriverActionExecutorBuilder, testScenarioRunnerBuilder);
        automationManager.addTestScenario(getScenario(pathToTestScenario, executorWebdriverActionExecutorBuilder, testScenarioRunnerBuilder),
                "0.csv", "0.har");
        automationManager.addTestScenario(getScenario(pathToTestScenario, executorWebdriverActionExecutorBuilder, testScenarioRunnerBuilder),
                "1.csv", "1.har");
        automationManager.addTestScenario(getScenario(pathToTestScenario, executorWebdriverActionExecutorBuilder, testScenarioRunnerBuilder),
                "2.csv", "2.har");

        List<AutomationResult> automationResultList = automationManager.runInParallel();

        System.out.println(automationResultList);
    }

    private WebDriverActionExecutor getScenario(String pathToTestScenario, WebdriverActionExecutorBuilder executor, ReplayBrowserConfiguration.Builder testScenarioRunner) throws IOException {
        return testScenarioRunner.executor(executor.buildChromedriver()).build().getReplayBrowser().getTestScenario(pathToTestScenario);
    }
}
