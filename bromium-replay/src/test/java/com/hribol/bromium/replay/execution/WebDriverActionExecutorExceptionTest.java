package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.report.AutomationResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 14.06.17.
 */
public class WebDriverActionExecutorExceptionTest {

    @Test
    public void returnsTheCorrectAutomationResult() {
        String message = "Some message";
        Throwable e = mock(Throwable.class);
        AutomationResultBuilder automationResultBuilder = mock(AutomationResultBuilder.class);

        AutomationResult expected = AutomationResult.TIMEOUT;
        when(automationResultBuilder.buildAutomationResult(e)).thenReturn(expected);

        WebDriverActionExecutionException webDriverActionExecutionException =
                new WebDriverActionExecutionException(message, e, automationResultBuilder);

        AutomationResult actual = webDriverActionExecutionException.getAutomationResult();

        assertEquals(expected, actual);
    }
}
