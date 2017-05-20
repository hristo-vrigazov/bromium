package com.hribol.spiderman.replay.replay;

import com.hribol.spiderman.replay.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.execution.application.DefaultApplicationActionFactory;
import com.hribol.spiderman.replay.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.replay.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.replay.execution.scenario.TestScenario;
import com.hribol.spiderman.replay.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.replay.config.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.config.utils.ConfigurationUtils;
import com.hribol.spiderman.replay.ReplayBrowser;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import com.hribol.spiderman.replay.report.ExecutionReport;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import com.hribol.spiderman.replay.report.LoadingTimes;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 22.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayBrowser.class,
        FileInputStream.class,
        PredefinedWebDriverActionFactory.class,
        DefaultApplicationActionFactory.class,
        TestScenarioFactory.class,
        ConfigurationUtils.class
})
public class ReplayBrowserTest {

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest, screen);

        Mockito.verify(webDriverActionExecution).execute(testScenario, screen);
    }

    @Test
    public void canCreateReplayBrowserByConfigurationAndExecution() throws Exception {
        String screen = ":2";
        String baseURL = "http://something.com";
        String configurationFile = "config.json";
        WebDriverActionExecution execution = mock(WebDriverActionExecution.class);
        ExecutionReport executionReport = mock(ExecutionReport.class);
        when(execution.getBaseURL()).thenReturn(baseURL);

        TestScenario testScenario = mock(TestScenario.class);
        FileInputStream fileInputStream = mock(FileInputStream.class);
        PredefinedWebDriverActionFactory predefinedWebDriverActionFactory = mock(PredefinedWebDriverActionFactory.class);
        DefaultApplicationActionFactory defaultApplicationActionFactory = mock(DefaultApplicationActionFactory.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromInputStream(fileInputStream)).thenReturn(testScenario);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        whenNew(FileInputStream.class).withArguments(configurationFile).thenReturn(fileInputStream);
        whenNew(PredefinedWebDriverActionFactory.class).withArguments(execution.getBaseURL()).thenReturn(predefinedWebDriverActionFactory);
        whenNew(DefaultApplicationActionFactory.class).withAnyArguments().thenReturn(defaultApplicationActionFactory);
        whenNew(TestScenarioFactory.class).withAnyArguments().thenReturn(testScenarioFactory);

        mockStatic(ConfigurationUtils.class);
        when(ConfigurationUtils.parseApplicationConfiguration(fileInputStream)).thenReturn(applicationConfiguration);
        when(execution.execute(testScenario, screen)).thenReturn(executionReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(configurationFile, execution);
        ExecutionReport report = replayBrowser.replay(fileInputStream, screen);
        assertEquals(report, executionReport);
    }

    @Test
    public void canInjectCustomWebDriverActionFactory() throws Exception {
        String configurationFile = "config.json";
        String baseURL = "http://something.com";

        FileInputStream fileInputStream = mock(FileInputStream.class);
        WebDriverActionFactory webDriverActionFactory = mock(WebDriverActionFactory.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        WebDriverActionExecution execution = mock(WebDriverActionExecution.class);
        PredefinedWebDriverActionFactory predefinedWebDriverActionFactory = mock(PredefinedWebDriverActionFactory.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);

        when(execution.getBaseURL()).thenReturn(baseURL);

        whenNew(FileInputStream.class).withArguments(configurationFile).thenReturn(fileInputStream);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        mockStatic(ConfigurationUtils.class);
        when(ConfigurationUtils.parseApplicationConfiguration(fileInputStream)).thenReturn(applicationConfiguration);
        whenNew(PredefinedWebDriverActionFactory.class).withArguments(execution.getBaseURL()).thenReturn(predefinedWebDriverActionFactory);
        whenNew(TestScenarioFactory.class).withAnyArguments().thenReturn(testScenarioFactory);

        ReplayBrowser replayBrowser = new ReplayBrowser(configurationFile, webDriverActionFactory, webDriverActionExecution);

        VirtualScreenProcessCreator creator = mock(VirtualScreenProcessCreator.class);

        replayBrowser.replay(fileInputStream);
        replayBrowser.createVirtualScreenProcessAndExecute(fileInputStream, 1, creator);
    }

}
