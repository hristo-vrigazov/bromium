package com.hribol.spiderman.browsers.chrome.replay;

import com.hribol.spiderman.replay.execution.WebDriverActionExecutionBase;
import com.hribol.spiderman.replay.execution.ExecutorBuilder;
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

    public ChromeDriverActionExecution(ExecutorBuilder executorBuilder) throws IOException, URISyntaxException {
        super(executorBuilder);
    }

    @Override
    protected ReplaySettings createReplaySettings() {
        RequestFilter requestFilter = proxyFacade.getRequestFilter();
        ResponseFilter responseFilter = proxyFacade.getResponseFilter();
        return new ChromeDriverReplaySettings(requestFilter, responseFilter);
    }

    @Override
    public String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }
}
