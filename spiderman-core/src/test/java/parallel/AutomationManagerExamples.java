package parallel;

import com.hribol.automation.replay.ReplayBrowserConfiguration;
import com.hribol.automation.execution.executor.AutomationResult;
import com.hribol.automation.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.execution.executor.WebDriverActionExecutorBase;
import com.hribol.automation.execution.executor.WebdriverActionExecutorBuilder;
import com.hribol.automation.execution.webdriver.PredefinedWebdriverActionFactory;
import org.junit.Test;
import com.hribol.automation.suite.AutomationManager;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class AutomationManagerExamples {

    @Test
    public void sequentialExample() throws IOException, URISyntaxException {
        String pathToApplicationConfiguration = "/home/hvrigazov/github/selenium-edu.hvrigazov.automation.record-edu.hvrigazov.automation.replay/tenniskafe.json";
        String pathToChromedriver = "/home/hvrigazov/github/selenium-edu.hvrigazov.automation.record-edu.hvrigazov.automation.replay/chromedriver";
        String pathToTestScenario = "/home/hvrigazov/github/selenium-edu.hvrigazov.automation.record-edu.hvrigazov.automation.replay/testCase.json";

        WebdriverActionExecutorBuilder executorWebdriverActionExecutorBuilder = WebDriverActionExecutorBase
                .builder()
                .pathToDriverExecutable(pathToChromedriver)
                .timeoutInSeconds(30)
                .measurementsPrecisionInMilliseconds(50)
                .baseURI("http://www.tenniskafe.com/");

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

    private WebDriverActionExecutor getScenario(String pathToTestScenario, WebdriverActionExecutorBuilder executor, ReplayBrowserConfiguration.Builder testScenarioRunner) throws IOException, URISyntaxException {
        return testScenarioRunner
                .executor(executor.buildChromedriver())
                .build()
                .getReplayBrowser()
                .getTestScenario(pathToTestScenario);
    }
}
