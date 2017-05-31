package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.report.AutomationResult;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class WebDriverActionExecutionException extends RuntimeException {

    private AutomationResult automationResult;

    public WebDriverActionExecutionException(String message, Throwable cause) {
        this(message, cause, new InstanceBasedAutomationResultBuilder());
    }

    public WebDriverActionExecutionException(String message, Throwable cause, AutomationResultBuilder automationResultBuilder) {
        super(message, cause);
        this.automationResult = automationResultBuilder.buildAutomationResult(cause);
    }

    public AutomationResult getAutomationResult() {
        return automationResult;
    }
}
