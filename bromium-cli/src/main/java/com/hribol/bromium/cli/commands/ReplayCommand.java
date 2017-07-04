package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.suppliers.DefaultApplicationActionFactorySupplier;
import com.hribol.bromium.cli.suppliers.PredefinedWebDriverActionFactorySupplier;
import com.hribol.bromium.cli.suppliers.TestCaseStepToApplicationActionConverterSupplier;
import com.hribol.bromium.cli.suppliers.TestScenarioFactorySupplier;
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
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
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

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = builder.getApplicationConfigurationParser()
                    .parseApplicationConfiguration(builder.getApplicationConfigurationInputStream());

            WebDriverActionFactory webDriverActionFactory = builder.getPredefinedWebDriverActionFactorySupplier()
                    .get(builder.getBaseURL());
            TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter =
                    builder.getTestCaseStepToApplicationActionConverterSupplier().get(webDriverActionFactory);
            ApplicationActionFactory applicationActionFactory = builder
                    .getDefaultApplicationActionFactorySupplier().get(
                            applicationConfiguration,
                            testCaseStepToApplicationActionConverter);

            TestScenarioFactory testScenarioFactory = builder.getTestScenarioFactorySupplier().get(applicationActionFactory);
            List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(builder.getTestInputStream());
            StepsAndConfiguration stepsAndConfiguration = new StepsAndConfiguration(testCaseSteps, applicationConfiguration);

            String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/replay.js"));

            JsCollector jsCollector = new JsCollector();
            BaseReplayFunctionFactory baseReplayFunctionFactory = new PredefinedReplayFunctionFactory(EmptyFunction::new, jsCollector);
            ReplayFunctionRegistry replayTypeRegistry = new ReplayFunctionRegistry(baseReplayFunctionFactory);
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
                    .pathToDriverExecutable(builder.getPathToDriver())
                    .baseURL(builder.getBaseURL())
                    .timeoutInSeconds(builder.getTimeout())
                    .measurementsPrecisionInMilliseconds(builder.getMeasurementsPrecisionMilli())
                    .javascriptInjectionCode(javascriptInjectionCode);

            WebDriverActionExecution execution = builder.getExecutionFactory().create(builder.getBrowserType(), executor);

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
        private ApplicationConfigurationParser applicationConfigurationParser;
        private PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier;
        private TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier;
        private DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier;
        private TestScenarioFactorySupplier testScenarioFactorySupplier;

        public String getPathToDriver() {
            return pathToDriver;
        }

        public InputStream getApplicationConfigurationInputStream() {
            return applicationConfigurationInputStream;
        }

        public InputStream getTestInputStream() {
            return testInputStream;
        }

        public Integer getTimeout() {
            return timeout;
        }

        public Integer getMeasurementsPrecisionMilli() {
            return measurementsPrecisionMilli;
        }

        public String getBaseURL() {
            return baseURL;
        }

        public String getBrowserType() {
            return browserType;
        }

        public ExecutionFactory getExecutionFactory() {
            return executionFactory;
        }

        public ApplicationConfigurationParser getApplicationConfigurationParser() {
            return applicationConfigurationParser;
        }

        public Builder pathToDriver(String pathToDriver) {
            this.pathToDriver = pathToDriver;
            return this;
        }

        public Builder applicationConfiguration(String configurationFileName) throws FileNotFoundException {
            return applicationConfiguration(new File(configurationFileName));
        }

        public Builder applicationConfiguration(File configurationFile) throws FileNotFoundException {
            return applicationConfigurationInputStream(new FileInputStream(configurationFile));
        }

        public Builder applicationConfigurationInputStream(InputStream inputStream) {
            this.applicationConfigurationInputStream = inputStream;
            return this;
        }

        public Builder applicationConfigurationParser(ApplicationConfigurationParser applicationConfigurationParser) {
            this.applicationConfigurationParser = applicationConfigurationParser;
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

        public Builder predefinedWebDriverActionFactorySupplier(PredefinedWebDriverActionFactorySupplier supplier) {
            this.predefinedWebDriverActionFactorySupplier = supplier;
            return this;
        }

        public PredefinedWebDriverActionFactorySupplier getPredefinedWebDriverActionFactorySupplier() {
            return predefinedWebDriverActionFactorySupplier;
        }

        public ReplayCommand build() {
            return new ReplayCommand(this);
        }


        public TestCaseStepToApplicationActionConverterSupplier getTestCaseStepToApplicationActionConverterSupplier() {
            return testCaseStepToApplicationActionConverterSupplier;
        }

        public Builder testCaseStepToApplicationActionConverterSupplier(
                TestCaseStepToApplicationActionConverterSupplier supplier) {
            this.testCaseStepToApplicationActionConverterSupplier = supplier;
            return this;
        }

        public Builder defaultApplicationActionFactorySupplier(
                DefaultApplicationActionFactorySupplier supplier) {
            this.defaultApplicationActionFactorySupplier = supplier;
            return this;
        }

        public DefaultApplicationActionFactorySupplier getDefaultApplicationActionFactorySupplier() {
            return defaultApplicationActionFactorySupplier;
        }

        public TestScenarioFactorySupplier getTestScenarioFactorySupplier() {
            return testScenarioFactorySupplier;
        }

        public Builder testScenarioFactorySupplier(TestScenarioFactorySupplier testScenarioFactorySupplier) {
            this.testScenarioFactorySupplier = testScenarioFactorySupplier;
            return this;
        }

    }
}
