package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.common.replay.factory.DefaultApplicationActionFactory;
import com.hribol.bromium.common.replay.factory.TestCaseStepToApplicationActionConverter;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.common.replay.factory.PredefinedWebDriverActionFactory;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import com.hribol.bromium.replay.*;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class ReplayCommand implements Command {

    private Builder builder;

    public ReplayCommand(Builder builder) {
        this.builder = builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void run() {
        try {
            WebDriverActionFactory factory = new PredefinedWebDriverActionFactory(builder.baseURL);

            String javascriptInjectionCode = new JavascriptInjector(builder.javascriptInputStream).getInjectionCode();
            ExecutorBuilder executor = new ExecutorBuilder()
                    .pathToDriverExecutable(builder.pathToDriver)
                    .baseURL(builder.baseURL)
                    .timeoutInSeconds(builder.timeout)
                    .measurementsPrecisionInMilliseconds(builder.measurementsPrecisionMilli)
                    .javascriptInjectionCode(javascriptInjectionCode);

            WebDriverActionExecution execution = builder.executionFactory.create(builder.browserType, executor);

            WebDriverActionFactory webDriverActionFactory = new PredefinedWebDriverActionFactory(builder.baseURL);
            TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter =
                    new TestCaseStepToApplicationActionConverter(webDriverActionFactory);
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(builder.applicationConfigurationInputStream);
            ApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(applicationConfiguration,
                    testCaseStepToApplicationActionConverter);
            TestScenarioFactory testScenarioFactory = new TestScenarioFactory(applicationActionFactory);
            ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, execution);
            ExecutionReport report = replayBrowser.replay(builder.testInputStream);
            System.out.println(report.getAutomationResult());
        } catch (IOException | URISyntaxException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static class Builder {
        private String pathToDriver;
        private InputStream applicationConfigurationInputStream;
        private InputStream testInputStream;
        private InputStream javascriptInputStream;
        private Integer timeout;
        private Integer measurementsPrecisionMilli;
        private String baseURL;
        private String browserType;
        private ExecutionFactory executionFactory;

        public Builder pathToDriver(String pathToDriver) {
            this.pathToDriver = pathToDriver;
            return this;
        }

        public Builder applicationConfiguration(String configurationFileName) throws FileNotFoundException {
            return applicationConfiguration(new File(configurationFileName));
        }

        public Builder applicationConfiguration(File configurationFile) throws FileNotFoundException {
            this.applicationConfigurationInputStream = new FileInputStream(configurationFile);
            return this;
        }

        public Builder applicationConfigurationInputStream(InputStream inputStream) {
            this.applicationConfigurationInputStream = inputStream;
            return this;
        }

        public Builder testCase(String filename) throws FileNotFoundException {
            return testCase(new File(filename));
        }

        public Builder testCase(File testCaseFile) throws FileNotFoundException {
            return testInputStream(new FileInputStream(testCaseFile));
        }

        public Builder testInputStream(InputStream inputStream) {
            this.testInputStream = inputStream;
            return this;
        }

        public Builder javascriptInputStream(InputStream inputStream) {
            this.javascriptInputStream = inputStream;
            return this;
        }

        public Builder javascriptFile(File javascriptFile) throws FileNotFoundException {
            return javascriptInputStream(new FileInputStream(javascriptFile));
        }

        public Builder javascriptFile(String javascriptFilename) throws FileNotFoundException {
            return javascriptFile(new File(javascriptFilename));
        }

        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder measurementsPrecisionMilli(Integer measurementsPrecisionMilli) {
            this.measurementsPrecisionMilli = measurementsPrecisionMilli;
            return this;
        }

        public Builder baseURL(String baseURL) {
            this.baseURL = baseURL;
            return this;
        }

        public Builder browserType(String browserType) {
            this.browserType = browserType;
            return this;
        }

        public Builder executionFactory(ExecutionFactory executionFactory) {
            this.executionFactory = executionFactory;
            return this;
        }

        public ReplayCommand build() {
            return new ReplayCommand(this);
        }
    }
}
