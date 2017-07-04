package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.ReplayCommand;
import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.suppliers.*;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepsAndConfigurationSupplier;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.suppliers.JavascriptInjectorSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class ReplayCommandHandlerTest {
    @Test
    public void replayCommandHandlerIsRan() throws Exception {
        /**
         *
         String pathToDriver = getPathToDriver(opts);
         String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
         String pathToSerializedTest = getPathToTestCase(opts);
         String csvMeasurementsFileName = getMeasurementsFile(opts);
         int timeout = getTimeout(opts);
         int measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
         String baseURL = getBaseUrl(opts);
         String browserType = getBrowserType(opts);
         */

        Map<String, Object> opts = new HashMap<>();

        String pathToDriver = "chromedriver";
        String configuration = "configuration.json";
        String testCase = "case.json";
        String measurements = "measurements.csv";
        String precision = "500";
        String browserType = CHROME;
        String timeout = "10";
        String url = "http://tenniskafe.com";

        opts.put(OptUtils.DRIVER, pathToDriver);
        opts.put(OptUtils.APPLICATION, configuration);
        opts.put(OptUtils.CASE, testCase);
        opts.put(OptUtils.MEASUREMENTS, measurements);
        opts.put(OptUtils.PRECISION, precision);
        opts.put(OptUtils.BROWSER, browserType);
        opts.put(OptUtils.TIMEOUT, timeout);
        opts.put(OptUtils.URL, url);

        ExecutionFactory executionFactory = mock(ExecutionFactory.class);
        ReplayCommandBuilderSupplier replayCommandBuilderSupplier = mock(ReplayCommandBuilderSupplier.class);
        ApplicationConfigurationParser applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
        PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier = mock(PredefinedWebDriverActionFactorySupplier.class);
        TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier = mock(TestCaseStepToApplicationActionConverterSupplier.class);
        DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier = mock(DefaultApplicationActionFactorySupplier.class);
        TestScenarioFactorySupplier testScenarioFactorySupplier = mock(TestScenarioFactorySupplier.class);
        StepsAndConfigurationSupplier stepsAndConfigurationSupplier = mock(StepsAndConfigurationSupplier.class);
        JsCollector jsCollector = mock(JsCollector.class);
        PredefinedReplayFunctionFactorySupplier predefinedReplayFunctionFactorySupplier = mock(PredefinedReplayFunctionFactorySupplier.class);
        Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier = mock(Supplier.class);
        ReplayFunctionRegistrySupplier replayFunctionRegistrySupplier = mock(ReplayFunctionRegistrySupplier.class);
        IncludeInvokeGeneratorSupplier includeInvokeGeneratorSupplier = mock(IncludeInvokeGeneratorSupplier.class);
        StepAndWebDriverActionConfigurationSupplier stepAndWebDriverActionConfigurationSupplier = mock(StepAndWebDriverActionConfigurationSupplier.class);
        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = mock(StepAndActionConfigurationSupplier.class);
        ReplayGeneratorByStepAndActionConfigurationSupplier replayGeneratorByStepAndActionConfigurationSupplier = mock(ReplayGeneratorByStepAndActionConfigurationSupplier.class);
        ReplayingJavascriptGeneratorSupplier replayingJavascriptGeneratorSupplier = mock(ReplayingJavascriptGeneratorSupplier.class);
        JavascriptInjectorSupplier javascriptInjectorSupplier = mock(JavascriptInjectorSupplier.class);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        ReplayBrowserSupplier replayBrowserSupplier = mock(ReplayBrowserSupplier.class);
        CommandHandler commandHandler = new ReplayCommandHandler(executionFactory,
                replayCommandBuilderSupplier,
                applicationConfigurationParser,
                predefinedWebDriverActionFactorySupplier,
                testCaseStepToApplicationActionConverterSupplier,
                defaultApplicationActionFactorySupplier,
                testScenarioFactorySupplier,
                stepsAndConfigurationSupplier,
                jsCollector,
                predefinedReplayFunctionFactorySupplier,
                emptyGeneratedFunctionSupplier,
                replayFunctionRegistrySupplier,
                includeInvokeGeneratorSupplier,
                stepAndActionConfigurationSupplier,
                stepAndWebDriverActionConfigurationSupplier,
                replayGeneratorByStepAndActionConfigurationSupplier,
                replayingJavascriptGeneratorSupplier,
                javascriptInjectorSupplier,
                executorBuilder,
                replayBrowserSupplier);

        ReplayCommand command = mock(ReplayCommand.class);

        ReplayCommand.Builder builder = mock(ReplayCommand.Builder.class);
        when(builder.pathToDriver(pathToDriver)).thenReturn(builder);
        when(builder.applicationConfiguration(configuration)).thenReturn(builder);
        when(builder.applicationConfigurationParser(applicationConfigurationParser)).thenReturn(builder);
        when(builder.testCase(testCase)).thenReturn(builder);
        when(builder.timeout(10)).thenReturn(builder);
        when(builder.measurementsPrecisionMilli(500)).thenReturn(builder);
        when(builder.baseURL(url)).thenReturn(builder);
        when(builder.browserType(browserType)).thenReturn(builder);
        when(builder.executionFactory(any(ExecutionFactory.class))).thenReturn(builder);
        when(builder.predefinedWebDriverActionFactorySupplier(any())).thenReturn(builder);
        when(builder.testCaseStepToApplicationActionConverterSupplier(any())).thenReturn(builder);
        when(builder.defaultApplicationActionFactorySupplier(any())).thenReturn(builder);
        when(builder.testScenarioFactorySupplier(any())).thenReturn(builder);
        when(builder.stepsAndConfigurationSupplier(any())).thenReturn(builder);
        when(builder.jsCollector(any())).thenReturn(builder);
        when(builder.predefinedReplayFunctionFactorySupplier(any())).thenReturn(builder);
        when(builder.emptyGeneratedFunctionSupplier(any())).thenReturn(builder);
        when(builder.replayFunctionRegistrySupplier(any())).thenReturn(builder);
        when(builder.includeInvokeGeneratorSupplier(any())).thenReturn(builder);
        when(builder.stepAndWebDriverActionConfigurationSupplier(any())).thenReturn(builder);
        when(builder.stepAndActionConfigurationSupplier(any())).thenReturn(builder);
        when(builder.replayGeneratorByStepAndActionConfigurationSupplier(any())).thenReturn(builder);
        when(builder.replayingJavascriptGeneratorSupplier(any())).thenReturn(builder);
        when(builder.javascriptInjectorSupplier(any())).thenReturn(builder);
        when(builder.executorBuilder(any())).thenReturn(builder);
        when(builder.replayBrowserSupplier(any())).thenReturn(builder);
        when(builder.build()).thenReturn(command);
        when(replayCommandBuilderSupplier.get()).thenReturn(builder);
        commandHandler.handle(opts);

        verify(command).run();
    }
}
