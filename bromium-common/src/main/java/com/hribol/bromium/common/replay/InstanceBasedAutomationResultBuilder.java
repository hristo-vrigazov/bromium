package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.execution.AutomationResultBuilder;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.report.AutomationResult;

import java.util.concurrent.TimeoutException;

/**
 * Builds a feasible {@link AutomationResult} based on the instance of the {@link Throwable}
 */
public class InstanceBasedAutomationResultBuilder implements AutomationResultBuilder {

    /**
     * Builds a feasible {@link AutomationResult} based on the instance of the {@link Throwable}
     * @param throwable the exception. The instance of the class will be used to return the correct {@link AutomationResult}
     * @return the correct {@link AutomationResult}
     */
    @Override
    public AutomationResult buildAutomationResult(Throwable throwable) {
        if (throwable instanceof AssertionError) {
            return AutomationResult.ASSERTION_ERROR;
        } else if (throwable instanceof TimeoutException) {
            return AutomationResult.TIMEOUT;
        } else if (throwable instanceof InterruptedException) {
            return AutomationResult.INTERRUPTED;
        } else if (throwable instanceof org.openqa.selenium.TimeoutException) {
            return AutomationResult.TIMEOUT;
        } else if (throwable instanceof WebDriverActionExecutionException) {
            return buildAutomationResult(throwable.getCause());
        }

        return AutomationResult.UNRECOGNIZED_EXCEPTION;
    }
}
