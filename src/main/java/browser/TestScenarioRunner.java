package browser;

import config.ApplicationConfiguration;
import execution.*;
import replay.ReplayBrowser;
import utils.Utils;

import java.io.IOException;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class TestScenarioRunner {
    private ReplayBrowser replayBrowser;

    public static Builder builder() {
        return new TestScenarioRunner.Builder();
    }

    public TestScenarioRunner(Builder builder) throws IOException {
        ApplicationConfiguration applicationConfiguration = Utils.parseApplicationConfiguration(builder.pathToApplicationConfiguration);
        WebdriverActionExecutor webdriverActionExecutor = builder.webdriverActionExecutor;
        WebdriverActionFactory webdriverActionFactory = builder.webdriverActionFactory;
        DefaultApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(builder.url, applicationConfiguration, webdriverActionFactory);
        replayBrowser = new ReplayBrowser(webdriverActionExecutor, applicationActionFactory);
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private String pathToApplicationConfiguration;
        private WebdriverActionExecutor webdriverActionExecutor;
        private WebdriverActionFactory webdriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder executor(WebdriverActionExecutor executor) {
            this.webdriverActionExecutor = executor;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder webdriverActionFactory(WebdriverActionFactory webdriverActionFactory) {
            this.webdriverActionFactory = webdriverActionFactory;
            return this;
        }

        public TestScenarioRunner build() throws IOException {
            return new TestScenarioRunner(this);
        }
    }

}
