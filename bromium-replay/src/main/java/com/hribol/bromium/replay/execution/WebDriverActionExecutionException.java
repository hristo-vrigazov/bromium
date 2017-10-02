package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.report.AutomationResult;

/**
 * A runtime exception while executing a scenario
 */
public class WebDriverActionExecutionException extends RuntimeException {

    private AutomationResult automationResult;

    /**
     * Creates a new exception
     * @param message description of the exception
     * @param cause cause of the error
     * @param automationResultBuilder an instance which converts the cause to a meaningful {@link AutomationResult}
     */
    public WebDriverActionExecutionException(String message, Throwable cause, AutomationResultBuilder automationResultBuilder) {
        super(message, cause);
        this.automationResult = automationResultBuilder.buildAutomationResult(cause);
    }

    /**
     * Gets the automation result
     * @return meaningful automation result
     */
    public AutomationResult getAutomationResult() {
        return automationResult;
    }
}
