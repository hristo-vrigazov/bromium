package com.hribol.bromium.browsers.chrome.replay;

import com.hribol.bromium.common.replay.WebDriverActionExecutionBase;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.replay.settings.ReplaySettings;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverActionExecution extends WebDriverActionExecutionBase {

    public ChromeDriverActionExecution(ExecutorBuilder executorBuilder) throws IOException, URISyntaxException {
        super(executorBuilder);
    }

    @Override
    public ReplaySettings createReplaySettings() {
        RequestFilter requestFilter = proxyFacade.getRequestFilter();
        ResponseFilter responseFilter = proxyFacade.getResponseFilter();
        int timeout = executor.getTimeout();
        return new ChromeDriverReplaySettings(requestFilter, responseFilter, timeout);
    }

    @Override
    public String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }
}
