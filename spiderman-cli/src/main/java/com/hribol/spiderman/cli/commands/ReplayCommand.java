package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.browsers.chrome.replay.ChromeDriverActionExecution;
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

    public ReplayCommand(String pathToDriver, String pathToApplicationConfiguration, String pathToSerializedTest) {
        this.pathToDriver = pathToDriver;
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.pathToSerializedTest = pathToSerializedTest;
    }

    @Override
    public void run() {
        try {
            WebDriverActionFactory factory = new PredefinedWebDriverActionFactory();

            WebDriverActionExecutor executor = new WebDriverActionExecutor()
                    .pathToDriverExecutable(pathToDriver)
                    .baseURI("http://www.tenniskafe.com/")
                    .timeoutInSeconds(20)
                    .measurementsPrecisionInMilliseconds(500);

            ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                    .builder()
                    .pathToApplicationConfiguration(pathToApplicationConfiguration)
                    .url("http://www.tenniskafe.com/")
                    .webdriverActionFactory(factory)
                    .build();


            WebDriverActionExecution execution = new ChromeDriverActionExecution(executor);

            ReplayBrowser replayBrowser = replayBrowserConfiguration.getReplayBrowser();
            replayBrowser.replay(pathToSerializedTest, execution, "example.csv");
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
