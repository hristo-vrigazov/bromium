package browser.commands;

import execution.executor.WebDriverActionExecutor;
import execution.executor.WebdriverActionExecutorBuilder;
import execution.webdriver.PredefinedWebdriverActionFactory;
import replay.ReplayBrowser;
import replay.ReplayBrowserConfiguration;

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
            WebDriverActionExecutor executor = new WebdriverActionExecutorBuilder()
                    .pathToDriverExecutable(pathToChromedriver)
                    .baseURI("http://www.tenniskafe.com/")
                    .buildChromedriver();

            ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                    .builder()
                    .pathToApplicationConfiguration(pathToApplicationConfiguration)
                    .url("http://www.tenniskafe.com/")
                    .webdriverActionFactory(new PredefinedWebdriverActionFactory())
                    .executor(executor)
                    .build();

            ReplayBrowser replayBrowser = replayBrowserConfiguration.getReplayBrowser();
            replayBrowser.replay(pathToSerializedTest);
            replayBrowser.dumpAllMetrics("metrics.har", "metrics.csv");
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
