package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.factory.ExecutionFactory;
import com.hribol.spiderman.replay.config.suite.UbuntuVirtualScreenProcessCreator;
import com.hribol.spiderman.replay.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.replay.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.replay.*;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.execution.ExecutorBuilder;
import com.hribol.spiderman.replay.report.ExecutionReport;

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

            ExecutorBuilder executor = new ExecutorBuilder()
                    .pathToDriverExecutable(builder.pathToDriver)
                    .baseURL(builder.baseURL)
                    .timeoutInSeconds(builder.timeout)
                    .measurementsPrecisionInMilliseconds(builder.measurementsPrecisionMilli);

            WebDriverActionExecution execution = builder.executionFactory.create(builder.browserType, executor);

            ReplayBrowser replayBrowser = new ReplayBrowser(builder.applicationConfigurationInputStream, factory, execution);
            ExecutionReport report = replayBrowser.createVirtualScreenProcessAndExecute(builder.testInputStream, 1, new UbuntuVirtualScreenProcessCreator());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }

    public static class Builder {
        private String pathToDriver;
        private InputStream applicationConfigurationInputStream;
        private InputStream testInputStream;
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
