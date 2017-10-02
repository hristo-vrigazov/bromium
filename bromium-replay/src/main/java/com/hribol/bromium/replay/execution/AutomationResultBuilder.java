package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.report.AutomationResult;

/**
 * Creates a descriptive {@link AutomationResult} by a given {@link Throwable}
 */
public interface AutomationResultBuilder {
    /**
     * Creates a descriptive {@link AutomationResult} by a given {@link Throwable}
     * @param throwable the exception
     * @return the descriptive {@link AutomationResult}
     */
    AutomationResult buildAutomationResult(Throwable throwable);
}
