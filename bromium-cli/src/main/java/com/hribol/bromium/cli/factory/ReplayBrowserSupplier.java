package com.hribol.bromium.cli.factory;

import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.ExecutorBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 09.05.17.
 */
public interface ReplayBrowserSupplier {
    WebDriverActionExecution get(ExecutorBuilder executorBuilder) throws IOException, URISyntaxException;
}
