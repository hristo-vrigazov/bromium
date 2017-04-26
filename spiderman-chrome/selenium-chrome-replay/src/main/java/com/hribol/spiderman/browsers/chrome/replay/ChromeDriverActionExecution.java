package com.hribol.spiderman.browsers.chrome.replay;

import com.hribol.spiderman.replay.execution.WebDriverActionExecutionBase;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
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
    protected ReplaySettings createReplaySettings() {
        RequestFilter requestFilter = replayFiltersFacade.getRequestFilter();
        ResponseFilter responseFilter = replayFiltersFacade.getResponseFilter();
        return new ChromeDriverReplaySettings(requestFilter, responseFilter);
    }

    @Override
    protected String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }
}
