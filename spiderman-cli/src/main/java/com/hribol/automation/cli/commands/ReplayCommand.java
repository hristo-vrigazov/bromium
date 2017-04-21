package com.hribol.automation.cli.commands;

import com.hribol.automation.core.execution.executor.WebDriverActionExecution;
import com.hribol.automation.core.execution.webdriver.PredefinedWebdriverActionFactory;
import com.hribol.automation.core.replay.ReplayBrowserConfiguration;
import com.hribol.automation.core.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.core.replay.ReplayBrowser;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class ReplayCommand implements Command {
    private String pathToChromedriver;
    private String pathToApplicationConfiguration;
    private String pathToSerializedTest;

    public ReplayCommand(String pathToChromedriver, String pathToApplicationConfiguration, String pathToSerializedTest) {
        this.pathToChromedriver = pathToChromedriver;
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.pathToSerializedTest = pathToSerializedTest;
    }

    @Override
    public void run() {
        try {
            WebDriverActionExecutor executor = new WebDriverActionExecutor()
                    .pathToDriverExecutable(pathToChromedriver)
                    .baseURI("http://www.tenniskafe.com/")
                    .timeoutInSeconds(20)
                    .measurementsPrecisionInMilliseconds(500);

            ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                    .builder()
                    .pathToApplicationConfiguration(pathToApplicationConfiguration)
                    .url("http://www.tenniskafe.com/")
                    .webdriverActionFactory(new PredefinedWebdriverActionFactory())
                    .executor(executor)
                    .build();

            ReplayBrowser replayBrowser = replayBrowserConfiguration.getReplayBrowser();
            replayBrowser.replay(pathToSerializedTest);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
