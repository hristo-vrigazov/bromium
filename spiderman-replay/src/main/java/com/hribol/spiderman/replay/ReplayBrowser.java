package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.replay.report.LoadingTimes;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.report.AutomationResult;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private final WebDriverActionExecution webDriverActionExecution;
    private TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(String filename, WebDriverActionFactory webDriverActionFactory, WebDriverActionExecution execution) throws IOException {
        this(new FileInputStream(filename), webDriverActionFactory, execution);
    }

    public ReplayBrowser(InputStream configurationInputStream, WebDriverActionFactory webDriverActionFactory, WebDriverActionExecution execution) throws IOException {
        this(new DefaultApplicationActionFactory(ConfigurationUtils.parseApplicationConfiguration(configurationInputStream), webDriverActionFactory),
                execution);
    }

    public ReplayBrowser(ApplicationActionFactory applicationActionFactory, WebDriverActionExecution execution) {
        this(new TestScenarioFactory(applicationActionFactory), execution);
    }

    public ReplayBrowser(TestScenarioFactory testScenarioFactory, WebDriverActionExecution execution) {
        this.testScenarioFactory = testScenarioFactory;
        this.webDriverActionExecution = execution;
    }

    public AutomationResult replay(TestScenario testScenario, String fileName) throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.execute(testScenario);
        LoadingTimes loadingTimes = webDriverActionExecution.getLoadingTimes();
        loadingTimes.dump(fileName);
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replayOnScreen(TestScenario testScenario,
                                           String screen)
            throws IOException, InterruptedException, URISyntaxException {
        webDriverActionExecution.executeOnScreen(testScenario, screen);
        return webDriverActionExecution.getAutomationResult();
    }

    public AutomationResult replay(String pathToSerializedTest,
                                   String fileName)
            throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return replay(testScenario, fileName);
    }

    public AutomationResult replay(InputStream inputStream,
                                   String fileName) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return replay(testScenario, fileName);
    }

    public AutomationResult replayOnScreen(String pathToSerializedTest,
                                           String screen)
            throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return replayOnScreen(testScenario, screen);
    }

    public AutomationResult replayOnScreen(InputStream inputStream,
                                           String fileName) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return replayOnScreen(testScenario, fileName);
    }
}
