package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import com.hribol.spiderman.replay.report.ExecutionReport;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private final WebDriverActionExecution webDriverActionExecution;
    private final TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(String filename, WebDriverActionExecution execution) throws IOException {
        this(new FileInputStream(filename), execution);
    }

    public ReplayBrowser(InputStream configurationInputStream, WebDriverActionExecution execution) throws IOException {
        this(configurationInputStream, new PredefinedWebDriverActionFactory(execution.getBaseURL()), execution);
    }

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

    public ExecutionReport replay(String pathToSerializedTest,
                                  String screen)
            throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecution.execute(testScenario, screen);
    }

    public ExecutionReport replay(InputStream inputStream,
                                  String screen) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.execute(testScenario, screen);
    }

    public ExecutionReport createVirtualScreenProcessAndExecute(InputStream inputStream,
                                                                int screenNumber,
                                                                VirtualScreenProcessCreator virtualScreenProcessCreator) throws IOException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.createVirtualScreenProcessAndExecute(testScenario, screenNumber, virtualScreenProcessCreator);
    }
}
