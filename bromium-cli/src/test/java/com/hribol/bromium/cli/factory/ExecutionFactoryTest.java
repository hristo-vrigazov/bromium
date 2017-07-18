package com.hribol.bromium.cli.factory;

import com.hribol.bromium.browsers.chrome.replay.ChromeDriverActionExecution;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 15.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ExecutionFactory.class,
        ChromeDriverActionExecution.class,
        ExecutorBuilder.class
})
public class ExecutionFactoryTest {

    @Test
    public void canCreateChrome() throws Exception {
        String baseURL = "http://runTest.com";
        ChromeDriverActionExecution chromeDriverActionExecution = mock(ChromeDriverActionExecution.class);
        when(chromeDriverActionExecution.getBaseURL()).thenReturn(baseURL);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);

        whenNew(ChromeDriverActionExecution.class).withArguments(executorBuilder).thenReturn(chromeDriverActionExecution);

        ExecutionFactory executionFactory = new ExecutionFactory();

        WebDriverActionExecution webDriverActionExecution = executionFactory.create(CHROME, executorBuilder);
        assertEquals(baseURL, webDriverActionExecution.getBaseURL());
    }
}
