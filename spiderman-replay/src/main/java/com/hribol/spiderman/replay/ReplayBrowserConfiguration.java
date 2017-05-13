package com.hribol.spiderman.replay;

import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.core.utils.ConfigurationUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ReplayBrowserConfiguration {
    private ReplayBrowser replayBrowser;

    public ReplayBrowserConfiguration(String filename, WebDriverActionFactory webDriverActionFactory) throws IOException {
        this(new FileInputStream(filename), webDriverActionFactory);
    }

    public ReplayBrowserConfiguration(InputStream configurationInputStream, WebDriverActionFactory webDriverActionFactory) throws IOException {
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(configurationInputStream);
        ApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(applicationConfiguration, webDriverActionFactory);
        replayBrowser = new ReplayBrowser(applicationActionFactory);
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

}
