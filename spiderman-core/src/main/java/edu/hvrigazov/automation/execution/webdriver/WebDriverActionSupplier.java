package edu.hvrigazov.automation.execution.webdriver;

import edu.hvrigazov.automation.execution.executor.WebDriverActionExecutor;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface WebDriverActionSupplier {
    WebDriverActionExecutor get() throws IOException, URISyntaxException;
}
