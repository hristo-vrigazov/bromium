package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.utils.LoadingTimes;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private ApplicationActionFactory applicationActionFactory;
    private TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(ApplicationActionFactory applicationActionFactory) {
        this(applicationActionFactory, new TestScenarioFactory(applicationActionFactory));
    }

    public ReplayBrowser(ApplicationActionFactory applicationActionFactory, TestScenarioFactory testScenarioFactory) {
        this.applicationActionFactory = applicationActionFactory;
        this.testScenarioFactory = testScenarioFactory;
    }

    public AutomationResult replay(TestScenario testScenario, WebDriverActionExecution webDriverActionExecution, String fileName) throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.execute(testScenario);
        LoadingTimes loadingTimes = webDriverActionExecution.getLoadingTimes();
        loadingTimes.dump(fileName);
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replayOnScreen(TestScenario testScenario,
                                           WebDriverActionExecution webDriverActionExecution,
                                           String screen)
            throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.executeOnScreen(testScenario, screen);
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replay(String pathToSerializedTest,
                                   WebDriverActionExecution webDriverActionExecution,
                                   String fileName)
            throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return replay(testScenario, webDriverActionExecution, fileName);
    }

    public AutomationResult replay(InputStream inputStream,
                                   WebDriverActionExecution webDriverActionExecution,
                                   String fileName) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return replay(testScenario, webDriverActionExecution, fileName);
    }

    public AutomationResult replayOnScreen(String pathToSerializedTest,
                                           WebDriverActionExecution webDriverActionExecution,
                                           String screen)
            throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return replayOnScreen(testScenario, webDriverActionExecution, screen);
    }

    public AutomationResult replayOnScreen(InputStream inputStream,
                                           WebDriverActionExecution webDriverActionExecution,
                                           String fileName) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return replayOnScreen(testScenario, webDriverActionExecution, fileName);
    }
}
