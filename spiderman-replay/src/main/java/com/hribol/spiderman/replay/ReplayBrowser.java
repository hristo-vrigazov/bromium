package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.replay.report.ExecutionReport;
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

    public ExecutionReport replay(String pathToSerializedTest)
            throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecution.execute(testScenario);
    }

    public ExecutionReport replay(InputStream inputStream) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.execute(testScenario);
    }

    public ExecutionReport replayOnScreen(String pathToSerializedTest,
                                           String screen)
            throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecution.executeOnScreen(testScenario, screen);
    }

    public ExecutionReport replayOnScreen(InputStream inputStream,
                                           String screen) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.executeOnScreen(testScenario, screen);
    }
}
