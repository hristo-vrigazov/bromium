package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.report.AutomationResult;

import java.util.concurrent.ExecutionException;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class WebDriverActionExecutionException extends ExecutionException {

    private AutomationResult automationResult;

    public WebDriverActionExecutionException(String message, Throwable cause, AutomationResultBuilder automationResultBuilder) {
        super(message, cause);
        this.automationResult = automationResultBuilder.buildAutomationResult(cause);
    }

    public AutomationResult getAutomationResult() {
        return automationResult;
    }
}
