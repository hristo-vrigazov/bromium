package com.hribol.bromium.browsers.chrome.replay;

import com.hribol.bromium.common.replay.WebDriverActionExecutionBase;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.replay.settings.ReplayManager;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;

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
    public ReplayManager createReplayManager(String screenToUse) {
        RequestFilter requestFilter = proxyFacade.getRequestFilter();
        ResponseFilter responseFilter = proxyFacade.getResponseFilter();
        int timeout = executor.getTimeout();
        return new ChromeDriverReplayManager(requestFilter, responseFilter, timeout, screenToUse);
    }
    
}
