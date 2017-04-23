package com.hribol.spiderman.browsers.chrome.replay;

import com.hribol.spiderman.replay.WebDriverActionExecutionBase;
import com.hribol.spiderman.replay.WebDriverActionExecutor;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverActionExecution extends WebDriverActionExecutionBase {

    public ChromeDriverActionExecution(WebDriverActionExecutor webDriverActionExecutor) throws IOException, URISyntaxException {
        super(webDriverActionExecutor);
    }

    @Override
    protected ReplaySettings createExecutionSettings() {
        return new ChromeDriverReplaySettings(this.baseURI, replayRequestFilter, replayResponseFilter);
    }

    @Override
    protected String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }
}
