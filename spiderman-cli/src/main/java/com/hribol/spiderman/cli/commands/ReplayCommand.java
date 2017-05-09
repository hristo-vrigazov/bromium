package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.factory.ExecutionFactory;
import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.replay.*;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class ReplayCommand implements Command {
    private String pathToDriver;
    private String pathToApplicationConfiguration;
    private String pathToSerializedTest;
    private String csvMeasurementsFileName;
    private int timeout;
    private int measurementsPrecisionMilli;
    private String baseURI;
    private String browserType;
    private ExecutionFactory executionFactory;

    public ReplayCommand(String pathToDriver,
                         String pathToApplicationConfiguration,
                         String pathToSerializedTest,
                         String csvMeasurementsFileName,
                         int timeout,
                         int measurementsPrecisionMilli,
                         String baseURI,
                         String browserType,
                         ExecutionFactory executionFactory) {
        this.pathToDriver = pathToDriver;
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.pathToSerializedTest = pathToSerializedTest;
        this.csvMeasurementsFileName = csvMeasurementsFileName;
        this.timeout = timeout;
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        this.baseURI = baseURI;
        this.browserType = browserType;
        this.executionFactory = executionFactory;
    }

    @Override
    public void run() {
        try {
            WebDriverActionFactory factory = new PredefinedWebDriverActionFactory();

            WebDriverActionExecutor executor = new WebDriverActionExecutor()
                    .pathToDriverExecutable(pathToDriver)
                    .baseURI(baseURI)
                    .timeoutInSeconds(timeout)
                    .measurementsPrecisionInMilliseconds(measurementsPrecisionMilli);

            ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                    .builder()
                    .pathToApplicationConfiguration(pathToApplicationConfiguration)
                    .url(baseURI)
                    .webdriverActionFactory(factory)
                    .build();

            WebDriverActionExecution execution = this.executionFactory.create(browserType, executor);

            ReplayBrowser replayBrowser = replayBrowserConfiguration.getReplayBrowser();
            replayBrowser.replay(pathToSerializedTest, execution, csvMeasurementsFileName);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
