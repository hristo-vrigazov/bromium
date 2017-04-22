package com.hribol.automation.replay;

import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.executor.*;
import com.hribol.automation.core.utils.LoadingTimes;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private ApplicationActionFactory applicationActionFactory;
    private TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(ApplicationActionFactory applicationActionFactory) {
        this(applicationActionFactory, new TestScenarioFactoryImpl());
    }

    public ReplayBrowser(ApplicationActionFactory applicationActionFactory, TestScenarioFactory testScenarioFactory) {
        this.applicationActionFactory = applicationActionFactory;
        this.testScenarioFactory = testScenarioFactory;
    }

    public AutomationResult replay(TestScenario testScenario, WebDriverActionExecution webDriverActionExecution) throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.execute(testScenario);
        LoadingTimes loadingTimes = webDriverActionExecution.getLoadingTimes();
        loadingTimes.dump("example.csv");
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replayOnScreen(TestScenario testScenario, WebDriverActionExecution webDriverActionExecution, String screen) throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.executeOnScreen(testScenario, screen);
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replay(String pathToSerializedTest, WebDriverActionExecution webDriverActionExecution) throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest);
        return replay(testScenario, webDriverActionExecution);
    }

    public AutomationResult replayOnScreen(String pathToSerializedTest, WebDriverActionExecution webDriverActionExecution, String screen) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest);
        return replayOnScreen(testScenario, webDriverActionExecution, screen);
    }
}
