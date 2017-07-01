package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.ReplayCommand;
import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.suppliers.ReplayCommandBuilderSupplier;

import java.io.FileNotFoundException;
import java.util.Map;

import static com.hribol.bromium.cli.handlers.OptUtils.*;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class ReplayCommandHandler implements CommandHandler {

    private ExecutionFactory executionFactory;
    private ReplayCommandBuilderSupplier replayCommandBuilderSupplier;

    @Inject
    public ReplayCommandHandler(ExecutionFactory executionFactory, ReplayCommandBuilderSupplier replayCommandBuilderSupplier) {
        this.executionFactory = executionFactory;
        this.replayCommandBuilderSupplier = replayCommandBuilderSupplier;
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
                .applicationConfiguration(pathToApplicationConfiguration)
                .testCase(pathToSerializedTest)
                .timeout(timeout)
                .measurementsPrecisionMilli(measurementsPrecisionMilli)
                .baseURL(baseURL)
                .browserType(browserType)
                .executionFactory(executionFactory)
                .build()
                .run();

    }
}
