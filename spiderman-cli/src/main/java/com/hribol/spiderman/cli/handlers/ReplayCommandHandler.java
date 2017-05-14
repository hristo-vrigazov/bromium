package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.ReplayCommand;
import com.hribol.spiderman.cli.factory.ExecutionFactory;

import java.io.FileNotFoundException;
import java.util.Map;

import static com.hribol.spiderman.cli.handlers.OptUtils.*;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class ReplayCommandHandler implements CommandHandler {

    @Override
    public void handle(Map<String, Object> opts) throws FileNotFoundException {
        String pathToDriver = getPathToDriver(opts);
        String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
        String pathToSerializedTest = getPathToTestCase(opts);
        int timeout = getTimeout(opts);
        int measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
        String baseURL = getBaseUrl(opts);
        String browserType = getBrowserType(opts);
        ExecutionFactory executionFactory = new ExecutionFactory();

        ReplayCommand.builder()
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
