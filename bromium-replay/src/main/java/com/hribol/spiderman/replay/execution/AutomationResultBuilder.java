package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.report.AutomationResult;

/**
 * Created by hvrigazov on 20.05.17.
 */
public interface AutomationResultBuilder {
    AutomationResult buildAutomationResult(Throwable throwable);
}
