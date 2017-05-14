package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.factory.ExecutionFactory;
import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.replay.ReplayBrowser;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.execution.ExecutorBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 28.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        WebDriverActionFactory.class,
        InputStream.class,
        PredefinedWebDriverActionFactory.class,
        ReplayBrowser.class,
        FileInputStream.class,
        ReplayCommand.class
})
public class ReplayCommandTest {

    private String pathToDriver;
    private String pathToApplicationConfiguration;
    private String pathToSerializedTest;
    private int timeout;
    private int measurementsPrecisionMilli;
    private String baseURI;

    @Test
    public void ifDriverStartsSuccessfullyEverythingWorks() throws Exception {
        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
        baseTest(replayBrowser);
        verify(replayBrowser).replay(any(InputStream.class));

    }

    @Test
    public void ifExceptionIsThrownThenItIsLogged() throws Exception {
        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
        when(replayBrowser.replay(anyString(), anyString())).thenThrow(new IOException("No driver found"));
        baseTest(replayBrowser);
    }

    private void baseTest(ReplayBrowser replayBrowser) throws Exception {
        pathToDriver = "chromedriver";
        pathToApplicationConfiguration = getClass().getResource("/tenniskafe.json").getFile();
        pathToSerializedTest = getClass().getResource("/testCase.json").getFile();
        timeout = 10;
        measurementsPrecisionMilli = 500;
        baseURI = "http://tenniskafe.com";

        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);

        ExecutionFactory executionFactory = mock(ExecutionFactory.class);
        when(executionFactory.create(eq(CHROME), any(ExecutorBuilder.class))).thenReturn(webDriverActionExecution);

        ReplayCommand replayCommand = ReplayCommand.builder()
                .pathToDriver(pathToDriver)
                .applicationConfiguration(pathToApplicationConfiguration)
                .testCase(pathToSerializedTest)
                .timeout(timeout)
                .measurementsPrecisionMilli(measurementsPrecisionMilli)
                .baseURL(baseURI)
                .browserType(CHROME)
                .executionFactory(executionFactory)
                .build();

        FileInputStream fileInputStream = mock(FileInputStream.class);

        whenNew(ReplayBrowser.class).withAnyArguments().thenReturn(replayBrowser);
        whenNew(FileInputStream.class).withAnyArguments().thenReturn(fileInputStream);
        replayCommand.run();
    }

}
