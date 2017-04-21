package com.hribol.automation.core.replay;

import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.execution.executor.WebDriverActionExecution;
import com.hribol.automation.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.automation.core.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.core.utils.ConfigurationUtils;
import com.hribol.automation.core.execution.webdriver.WebdriverActionFactory;

import java.io.IOException;

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
        WebDriverActionExecutor webDriverActionExecution = builder.webDriverActionExecution;
        WebdriverActionFactory webdriverActionFactory = builder.webdriverActionFactory;
        DefaultApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(builder.url, applicationConfiguration, webdriverActionFactory);
        replayBrowser = new ReplayBrowser(webDriverActionExecution, applicationActionFactory);
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private String pathToApplicationConfiguration;
        private WebDriverActionExecutor webDriverActionExecution;
        private WebdriverActionFactory webdriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder executor(WebDriverActionExecutor executor) {
            this.webDriverActionExecution = executor;
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

        public ReplayBrowserConfiguration build() throws IOException {
            return new ReplayBrowserConfiguration(this);
        }
    }

}
