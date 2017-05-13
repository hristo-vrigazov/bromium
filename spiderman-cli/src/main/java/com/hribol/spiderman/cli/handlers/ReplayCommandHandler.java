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
        String csvMeasurementsFileName = getMeasurementsFile(opts);
        int timeout = getTimeout(opts);
        int measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
        String baseURI = getBaseUrl(opts);
        String browserType = getBrowserType(opts);
        ExecutionFactory executionFactory = new ExecutionFactory();
        Command command = new ReplayCommand(pathToDriver, pathToApplicationConfiguration, pathToSerializedTest,
                csvMeasurementsFileName, timeout, measurementsPrecisionMilli, baseURI, browserType, executionFactory);
        command.run();
    }
}
