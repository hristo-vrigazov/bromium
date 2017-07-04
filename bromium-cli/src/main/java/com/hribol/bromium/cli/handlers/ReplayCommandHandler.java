package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.suppliers.*;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;

import java.io.FileNotFoundException;
import java.util.Map;

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

    @Inject
    public ReplayCommandHandler(ExecutionFactory executionFactory,
                                ReplayCommandBuilderSupplier replayCommandBuilderSupplier,
                                ApplicationConfigurationParser applicationConfigurationParser,
                                PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier,
                                TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier,
                                DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier,
                                TestScenarioFactorySupplier testScenarioFactorySupplier) {
        this.executionFactory = executionFactory;
        this.replayCommandBuilderSupplier = replayCommandBuilderSupplier;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.predefinedWebDriverActionFactorySupplier = predefinedWebDriverActionFactorySupplier;
        this.testCaseStepToApplicationActionConverterSupplier = testCaseStepToApplicationActionConverterSupplier;
        this.defaultApplicationActionFactorySupplier = defaultApplicationActionFactorySupplier;
        this.testScenarioFactorySupplier = testScenarioFactorySupplier;
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
                .build()
                .run();

    }
}
