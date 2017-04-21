package com.hribol.automation.core.replay;

import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.executor.*;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private WebDriverActionExecutor executor;
    private ApplicationActionFactory applicationActionFactory;

    public ReplayBrowser(WebDriverActionExecutor executor,
                         ApplicationActionFactory applicationActionFactory) {
        this.executor = executor;
        this.applicationActionFactory = applicationActionFactory;
    }

    public AutomationResult replay(String pathToSerializedTest) throws IOException, InterruptedException, URISyntaxException {
        TestScenario testScenario = TestScenario.createFromFile(applicationActionFactory, pathToSerializedTest);
        ChromeDriverActionExecution chromeDriverActionExecution = new ChromeDriverActionExecution(executor);
        chromeDriverActionExecution.execute(testScenario);
        return chromeDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replayOnScreen(String pathToSerializedTest, String screen) throws IOException, InterruptedException, URISyntaxException {
        TestScenario testScenario = TestScenario.createFromFile(applicationActionFactory, pathToSerializedTest);
        ChromeDriverActionExecution chromeDriverActionExecution = new ChromeDriverActionExecution(executor);
        chromeDriverActionExecution.executeOnScreen(testScenario, screen);
        return chromeDriverActionExecution.getAutomationResult();
    }

}
