package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.report.AutomationResult;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class InstanceBasedAutomationResultBuilderTest {

    @Test
    public void correctlyCreatesAssertionError() {
        Throwable throwable = new AssertionError();
        AutomationResultBuilder automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        AutomationResult automationResult = automationResultBuilder.buildAutomationResult(throwable);
        assertEquals(automationResult, AutomationResult.ASSERTION_ERROR);
    }

    @Test
    public void correctlyCreatesTimeoutExceptionSelenium() {
        Throwable throwable = new TimeoutException();
        AutomationResultBuilder automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        AutomationResult automationResult = automationResultBuilder.buildAutomationResult(throwable);
        assertEquals(automationResult, AutomationResult.TIMEOUT);
    }

    @Test
    public void correctlyCreatesTimeoutExceptionThread() {
        Throwable throwable = new java.util.concurrent.TimeoutException();
        AutomationResultBuilder automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        AutomationResult automationResult = automationResultBuilder.buildAutomationResult(throwable);
        assertEquals(automationResult, AutomationResult.TIMEOUT);
    }

    @Test
    public void correctlyCreatesInterruptedExceptionThread() {
        Throwable throwable = new InterruptedException();
        AutomationResultBuilder automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        AutomationResult automationResult = automationResultBuilder.buildAutomationResult(throwable);
        assertEquals(automationResult, AutomationResult.INTERRUPTED);
    }

    @Test
    public void correctlyCreatesUnrecognizedException() {
        Throwable throwable = new NullPointerException();
        AutomationResultBuilder automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        AutomationResult automationResult = automationResultBuilder.buildAutomationResult(throwable);
        assertEquals(automationResult, AutomationResult.UNRECOGNIZED_EXCEPTION);
    }
}
