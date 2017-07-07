package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
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

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Constants.REPLAY_TEMPLATE_RESOURCE;
import static com.hribol.bromium.cli.handlers.OptUtils.*;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class ReplayCommandHandler implements CommandHandler {

    private ExecutionFactory executionFactory;
    private ReplayCommandBuilderSupplier replayCommandBuilderSupplier;
    private ApplicationConfigurationParser applicationConfigurationParser;
    private PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier;
    private TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier;
    private DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier;
    private TestScenarioFactorySupplier testScenarioFactorySupplier;
    private StepsAndConfigurationSupplier stepsAndConfigurationSupplier;
    private JsCollector jsCollector;
    private PredefinedReplayFunctionFactorySupplier predefinedReplayFunctionFactorySupplier;
    private Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier;
    private ReplayFunctionRegistrySupplier replayFunctionRegistrySupplier;
    private IncludeInvokeGeneratorSupplier includeInvokeGeneratorSupplier;
    private StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier;
    private StepAndWebDriverActionConfigurationSupplier stepAndWebDriverActionConfigurationSupplier;
    private ReplayGeneratorByStepAndActionConfigurationSupplier replayGeneratorByStepAndActionConfigurationSupplier;
    private ReplayingJavascriptGeneratorSupplier replayingJavascriptGeneratorSupplier;
    private JavascriptInjectorSupplier javascriptInjectorSupplier;
    private ExecutorBuilder executorBuilder;
    private ReplayBrowserSupplier replayBrowserSupplier;
    private String templateResource;

    @Inject
    public ReplayCommandHandler(ExecutionFactory executionFactory,
                                ReplayCommandBuilderSupplier replayCommandBuilderSupplier,
                                ApplicationConfigurationParser applicationConfigurationParser,
                                PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier,
                                TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier,
                                DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier,
                                TestScenarioFactorySupplier testScenarioFactorySupplier,
                                StepsAndConfigurationSupplier stepsAndConfigurationSupplier,
                                JsCollector jsCollector,
                                PredefinedReplayFunctionFactorySupplier predefinedReplayFunctionFactorySupplier,
                                Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                ReplayFunctionRegistrySupplier replayFunctionRegistrySupplier,
                                IncludeInvokeGeneratorSupplier includeInvokeGeneratorSupplier,
                                StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier,
                                StepAndWebDriverActionConfigurationSupplier stepAndWebDriverActionConfigurationSupplier,
                                ReplayGeneratorByStepAndActionConfigurationSupplier replayGeneratorByStepAndActionConfigurationSupplier,
                                ReplayingJavascriptGeneratorSupplier replayingJavascriptGeneratorSupplier,
                                JavascriptInjectorSupplier javascriptInjectorSupplier,
                                ExecutorBuilder executorBuilder,
                                ReplayBrowserSupplier replayBrowserSupplier,
                                @Named(REPLAY_TEMPLATE_RESOURCE) String templateResource) {
        this.executionFactory = executionFactory;
        this.replayCommandBuilderSupplier = replayCommandBuilderSupplier;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.predefinedWebDriverActionFactorySupplier = predefinedWebDriverActionFactorySupplier;
        this.testCaseStepToApplicationActionConverterSupplier = testCaseStepToApplicationActionConverterSupplier;
        this.defaultApplicationActionFactorySupplier = defaultApplicationActionFactorySupplier;
        this.testScenarioFactorySupplier = testScenarioFactorySupplier;
        this.stepsAndConfigurationSupplier = stepsAndConfigurationSupplier;
        this.jsCollector = jsCollector;
        this.predefinedReplayFunctionFactorySupplier = predefinedReplayFunctionFactorySupplier;
        this.emptyGeneratedFunctionSupplier = emptyGeneratedFunctionSupplier;
        this.replayFunctionRegistrySupplier = replayFunctionRegistrySupplier;
        this.includeInvokeGeneratorSupplier = includeInvokeGeneratorSupplier;
        this.stepAndActionConfigurationSupplier = stepAndActionConfigurationSupplier;
        this.stepAndWebDriverActionConfigurationSupplier = stepAndWebDriverActionConfigurationSupplier;
        this.replayGeneratorByStepAndActionConfigurationSupplier = replayGeneratorByStepAndActionConfigurationSupplier;
        this.replayingJavascriptGeneratorSupplier = replayingJavascriptGeneratorSupplier;
        this.javascriptInjectorSupplier = javascriptInjectorSupplier;
        this.executorBuilder = executorBuilder;
        this.replayBrowserSupplier = replayBrowserSupplier;
        this.templateResource = templateResource;
    }

    @Override
    public void handle(Map<String, Object> opts) throws FileNotFoundException {
        String pathToDriver = getPathToDriver(opts);
        String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
        String pathToSerializedTest = getPathToTestCase(opts);
        Integer timeout = getTimeout(opts);
        Integer measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
        String baseURL = getBaseUrl(opts);
        String browserType = getBrowserType(opts);

        replayCommandBuilderSupplier.get()
                .pathToDriver(pathToDriver)
                .applicationConfigurationParser(applicationConfigurationParser)
                .applicationConfiguration(pathToApplicationConfiguration)
                .testCase(pathToSerializedTest)
                .timeout(timeout)
                .measurementsPrecisionMilli(measurementsPrecisionMilli)
                .baseURL(baseURL)
                .browserType(browserType)
                .executionFactory(executionFactory)
                .predefinedWebDriverActionFactorySupplier(predefinedWebDriverActionFactorySupplier)
                .testCaseStepToApplicationActionConverterSupplier(testCaseStepToApplicationActionConverterSupplier)
                .defaultApplicationActionFactorySupplier(defaultApplicationActionFactorySupplier)
                .testScenarioFactorySupplier(testScenarioFactorySupplier)
                .stepsAndConfigurationSupplier(stepsAndConfigurationSupplier)
                .jsCollector(jsCollector)
                .predefinedReplayFunctionFactorySupplier(predefinedReplayFunctionFactorySupplier)
                .emptyGeneratedFunctionSupplier(emptyGeneratedFunctionSupplier)
                .replayFunctionRegistrySupplier(replayFunctionRegistrySupplier)
                .includeInvokeGeneratorSupplier(includeInvokeGeneratorSupplier)
                .stepAndActionConfigurationSupplier(stepAndActionConfigurationSupplier)
                .stepAndWebDriverActionConfigurationSupplier(stepAndWebDriverActionConfigurationSupplier)
                .replayGeneratorByStepAndActionConfigurationSupplier(replayGeneratorByStepAndActionConfigurationSupplier)
                .replayingJavascriptGeneratorSupplier(replayingJavascriptGeneratorSupplier)
                .javascriptInjectorSupplier(javascriptInjectorSupplier)
                .executorBuilder(executorBuilder)
                .replayBrowserSupplier(replayBrowserSupplier)
                .templateResource(templateResource)
                .build()
                .run();

    }
}
