package com.hribol.spiderman.cli.factory;

import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 09.05.17.
 */
public interface ReplayBrowserSupplier {
    WebDriverActionExecution get(WebDriverActionExecutor webDriverActionExecutor) throws IOException, URISyntaxException;
}
