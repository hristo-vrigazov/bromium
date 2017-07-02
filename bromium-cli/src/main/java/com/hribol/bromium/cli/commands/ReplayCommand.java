package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.replay.*;
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
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

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
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(builder.applicationConfigurationInputStream);

            WebDriverActionFactory webDriverActionFactory = new PredefinedWebDriverActionFactory(builder.baseURL);
            TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter =
                    new TestCaseStepToApplicationActionConverter(webDriverActionFactory);
            ApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(applicationConfiguration,
                    testCaseStepToApplicationActionConverter);
            TestScenarioFactory testScenarioFactory = new TestScenarioFactory(applicationActionFactory);
            List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(builder.testInputStream);
            StepsAndConfiguration stepsAndConfiguration = new StepsAndConfiguration(testCaseSteps, applicationConfiguration);

            String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/replay.js"));

            JsCollector jsCollector = new JsCollector();
            BaseReplayFunctionFactory baseReplayFunctionFactory = new PredefinedReplayFunctionFactory(EmptyFunction::new, jsCollector);
            ReplayTypeRegistry replayTypeRegistry = new ReplayTypeRegistry(baseReplayFunctionFactory);
            IncludeInvokeGenerator<StepAndWebDriverActionConfiguration> includeInvokeGenerator = new IncludeInvokeGenerator<>(replayTypeRegistry);

            StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = new StepAndActionConfigurationSupplier();
            StepAndWebDriverActionConfigurationSupplier stepAndWebDriverActionConfigurationSupplier = new StepAndWebDriverActionConfigurationSupplier();

            ReplayGeneratorByStepAndActionConfiguration replayGeneratorByStepAndActionConfiguration =
                    new ReplayGeneratorByStepAndActionConfiguration(includeInvokeGenerator, stepAndWebDriverActionConfigurationSupplier);
            ReplayingJavascriptGenerator replayingJavascriptGenerator = new ReplayingJavascriptGenerator(baseTemplate,
                    replayGeneratorByStepAndActionConfiguration, stepAndActionConfigurationSupplier);
            StringReader stringReader = new StringReader(replayingJavascriptGenerator.generate(stepsAndConfiguration));
            JavascriptInjector javascriptInjector = new JavascriptInjector(stringReader);
            String javascriptInjectionCode = javascriptInjector.getInjectionCode();
            System.out.println(javascriptInjectionCode);
            ExecutorBuilder executor = new ExecutorBuilder()
                    .pathToDriverExecutable(builder.pathToDriver)
                    .baseURL(builder.baseURL)
                    .timeoutInSeconds(builder.timeout)
                    .measurementsPrecisionInMilliseconds(builder.measurementsPrecisionMilli)
                    .javascriptInjectionCode(javascriptInjectionCode);

            WebDriverActionExecution execution = builder.executionFactory.create(builder.browserType, executor);

            ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, execution);
            ExecutionReport report = replayBrowser.replay(testCaseSteps);
            System.out.println(report.getAutomationResult());
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
