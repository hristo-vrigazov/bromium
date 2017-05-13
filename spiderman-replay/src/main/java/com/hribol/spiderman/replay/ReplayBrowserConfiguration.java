package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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
        replayBrowser = new ReplayBrowser(applicationActionFactory, new TestScenarioFactory());
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private InputStream pathToApplicationConfiguration;
        private WebDriverActionFactory webDriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) throws FileNotFoundException {
            return configurationStream(new FileInputStream(pathToApplicationConfiguration));
        }

        public Builder configurationStream(InputStream pathToApplicationConfiguration) {
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
