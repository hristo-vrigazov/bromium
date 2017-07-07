package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.suppliers.*;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepsAndConfigurationSupplier;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.common.replay.factory.DefaultApplicationActionFactory;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.suppliers.JavascriptInjectorSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 28.04.17.
 */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(IOUtils.class)
public class ReplayCommandTest {
//
//    private String pathToDriver;
//    private String pathToApplicationConfiguration;
//    private String pathToSerializedTest;
//    private int timeout;
//    private int measurementsPrecisionMilli;
//    private String baseURI;
//    private String browserType;
//
//    @Test
//    public void ifDriverStartsSuccessfullyEverythingWorks() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        ExecutionReport executionReport = mock(ExecutionReport.class);
//        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);
//        when(replayBrowser.replay(any(InputStream.class))).thenReturn(executionReport);
//        baseTest(replayBrowser);
//        verify(replayBrowser).replay(any(InputStream.class));
//
//    }
//
//    @Test
//    public void ifExceptionIsThrownThenItIsLogged() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        ExecutionReport executionReport = mock(ExecutionReport.class);
//        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);
//        when(replayBrowser.replay(any(InputStream.class))).thenReturn(executionReport);
//        when(replayBrowser.replay(anyString(), anyString())).thenThrow(new IOException("No driver found"));
//        baseTest(replayBrowser);
//    }
//
//    @Test
//    public void ifExceptionWhenReplayingFromInputStreamIsThrownThenItIsLogged() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        when(replayBrowser.replay(any(InputStream.class))).thenThrow(new IOException("No driver found"));
//        baseTest(replayBrowser);
//    }
//
//    private void baseTest(ReplayBrowser replayBrowser) throws Exception {
//        pathToDriver = "chromedriver";
//        pathToApplicationConfiguration = getClass().getResource("/tenniskafe.json").getFile();
//        pathToSerializedTest = getClass().getResource("/testCase.json").getFile();
//        timeout = 10;
//        measurementsPrecisionMilli = 500;
//        baseURI = "http://tenniskafe.com";
//        browserType = CHROME;
//
//
//        ApplicationConfigurationParser applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
//        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
//
//        ExecutionFactory executionFactory = mock(ExecutionFactory.class);
//        when(executionFactory.create(eq(CHROME), any(ExecutorBuilder.class))).thenReturn(webDriverActionExecution);
//
//        ReplayCommand.Builder builder = mock(ReplayCommand.Builder.class);
//
//        InputStream testInputStream = mock(InputStream.class);
//        InputStream applicationConfigurationInputStream = mock(InputStream.class);
//        JavascriptInjectorSupplier javascriptInjectorSupplier = mock(JavascriptInjectorSupplier.class);
//        PredefinedWebDriverActionFactorySupplier predefinedWebDriverActionFactorySupplier = mock(PredefinedWebDriverActionFactorySupplier.class);
//        TestCaseStepToApplicationActionConverterSupplier testCaseStepToApplicationActionConverterSupplier = mock(TestCaseStepToApplicationActionConverterSupplier.class);
//        DefaultApplicationActionFactorySupplier defaultApplicationActionFactorySupplier =
//                mock(DefaultApplicationActionFactorySupplier.class);
//        TestScenarioFactorySupplier testScenarioFactorySupplier = mock(TestScenarioFactorySupplier.class);
//        StepsAndConfigurationSupplier stepsAndConfigurationSupplier = mock(StepsAndConfigurationSupplier.class);
//        JsCollector jsCollector = mock(JsCollector.class);
//        PredefinedReplayFunctionFactorySupplier predefinedReplayFunctionFactorySupplier = mock(PredefinedReplayFunctionFactorySupplier.class);
//        Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyFunctionSupplier =
//                mock(Supplier.class);
//        ReplayFunctionRegistrySupplier replayFunctionRegistrySupplier = mock(ReplayFunctionRegistrySupplier.class);
//        IncludeInvokeGeneratorSupplier includeInvokeGeneratorSupplier = mock(IncludeInvokeGeneratorSupplier.class);
//        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = mock(StepAndActionConfigurationSupplier.class);
//        ReplayGeneratorByStepAndActionConfigurationSupplier replayGeneratorByStepAndActionConfigurationSupplier = mock(ReplayGeneratorByStepAndActionConfigurationSupplier.class);
//        ReplayingJavascriptGeneratorSupplier replayingJavascriptGeneratorSupplier = mock(ReplayingJavascriptGeneratorSupplier.class);
//        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
//        ReplayBrowserSupplier replayBrowserSupplier = mock(ReplayBrowserSupplier.class);
//
//        Mockito.when(builder.getPathToDriver()).thenReturn(pathToDriver);
//        Mockito.when(builder.getApplicationConfigurationInputStream()).thenReturn(applicationConfigurationInputStream);
//        Mockito.when(builder.getApplicationConfigurationParser()).thenReturn(applicationConfigurationParser);
//        Mockito.when(builder.getTestInputStream()).thenReturn(testInputStream);
//        Mockito.when(builder.getTimeout()).thenReturn(timeout);
//        Mockito.when(builder.getMeasurementsPrecisionMilli()).thenReturn(measurementsPrecisionMilli);
//        Mockito.when(builder.getBaseURL()).thenReturn(baseURI);
//        Mockito.when(builder.getBrowserType()).thenReturn(browserType);
//        Mockito.when(builder.getExecutionFactory()).thenReturn(executionFactory);
//        Mockito.when(builder.getPredefinedWebDriverActionFactorySupplier()).thenReturn(predefinedWebDriverActionFactorySupplier);
//        Mockito.when(builder.getTestCaseStepToApplicationActionConverterSupplier()).thenReturn(testCaseStepToApplicationActionConverterSupplier);
//        Mockito.when(builder.getJavascriptInjectorSupplier()).thenReturn(javascriptInjectorSupplier);
//        Mockito.when(builder.getDefaultApplicationActionFactorySupplier()).thenReturn(defaultApplicationActionFactorySupplier);
//        Mockito.when(builder.getTestScenarioFactorySupplier()).thenReturn(testScenarioFactorySupplier);
//        Mockito.when(builder.getStepsAndConfigurationSupplier()).thenReturn(stepsAndConfigurationSupplier);
//        Mockito.when(builder.getJsCollector()).thenReturn(jsCollector);
//        Mockito.when(builder.getPredefinedReplayFunctionFactorySupplier()).thenReturn(predefinedReplayFunctionFactorySupplier);
//        Mockito.when(builder.getEmptyGeneratedFunctionSupplier()).thenReturn(emptyFunctionSupplier);
//        Mockito.when(builder.getReplayFunctionRegistrySupplier()).thenReturn(replayFunctionRegistrySupplier);
//        Mockito.when(builder.getIncludeInvokeGeneratorSupplier()).thenReturn(includeInvokeGeneratorSupplier);
//        Mockito.when(builder.getStepAndActionConfigurationSupplier()).thenReturn(stepAndActionConfigurationSupplier);
//        Mockito.when(builder.getReplayGeneratorByStepAndActionConfigurationSupplier()).thenReturn(replayGeneratorByStepAndActionConfigurationSupplier);
//        Mockito.when(builder.getReplayingJavascriptGeneratorSupplier()).thenReturn(replayingJavascriptGeneratorSupplier);
//        Mockito.when(builder.getExecutorBuilder()).thenReturn(executorBuilder);
//        Mockito.when(builder.getReplayBrowserSupplier()).thenReturn(replayBrowserSupplier);
//
//        FileInputStream fileInputStream = mock(FileInputStream.class);
//
//        whenNew(ReplayBrowser.class).withAnyArguments().thenReturn(replayBrowser);
//        whenNew(FileInputStream.class).withAnyArguments().thenReturn(fileInputStream);
//
//        PowerMockito.mockStatic(IOUtils.class);
//        when(IOUtils.toString(any(InputStream.class))).thenReturn("");
//
//        ReplayCommand replayCommand = new ReplayCommand(builder);
//        replayCommand.run();
//    }

}
