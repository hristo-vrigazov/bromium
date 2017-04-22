package com.hribol.automation.core.replay;

import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.automation.core.execution.executor.TestScenarioFactoryImpl;
import com.hribol.automation.core.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.core.utils.ConfigurationUtils;
import com.hribol.automation.core.execution.webdriver.WebDriverActionFactory;

import java.io.IOException;

import static java.util.Objects.requireNonNull;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ReplayBrowserConfiguration {
    private ReplayBrowser replayBrowser;

    public static Builder builder() {
        return new ReplayBrowserConfiguration.Builder();
    }

    public ReplayBrowserConfiguration(Builder builder) throws IOException {
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(builder.pathToApplicationConfiguration);
        WebDriverActionFactory webDriverActionFactory = builder.webDriverActionFactory;
        DefaultApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(builder.url, applicationConfiguration, webDriverActionFactory);
        replayBrowser = new ReplayBrowser(applicationActionFactory, new TestScenarioFactoryImpl());
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private String pathToApplicationConfiguration;
        private WebDriverActionFactory webDriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder webdriverActionFactory(WebDriverActionFactory webDriverActionFactory) {
            this.webDriverActionFactory = webDriverActionFactory;
            return this;
        }

        public ReplayBrowserConfiguration build() throws IOException {
            requireNonNull(pathToApplicationConfiguration, "pathToApplicationConfiguration is a required parameter");
            requireNonNull(webDriverActionFactory, "webDriverActionFactory is a required parameter");
            requireNonNull(url, "url is a required parameter");

            return new ReplayBrowserConfiguration(this);
        }

    }

}
