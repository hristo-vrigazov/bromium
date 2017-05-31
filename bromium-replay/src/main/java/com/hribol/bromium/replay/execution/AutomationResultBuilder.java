package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.report.AutomationResult;

/**
 * Created by hvrigazov on 20.05.17.
 */
public interface AutomationResultBuilder {
    AutomationResult buildAutomationResult(Throwable throwable);
}
