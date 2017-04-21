package com.hribol.automation.core.execution.webdriver;

import com.hribol.automation.core.execution.executor.WebDriverActionExecution;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface WebDriverActionSupplier {
    WebDriverActionExecution get() throws IOException, URISyntaxException;
}
