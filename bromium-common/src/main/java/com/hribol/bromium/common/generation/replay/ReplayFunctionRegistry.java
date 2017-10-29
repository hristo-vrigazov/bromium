package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.common.FunctionRegistryBase;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * A {@link com.hribol.bromium.core.generation.FunctionRegistry} for {@link com.hribol.bromium.common.generation.replay.functions.ReplayFunction}
 */
public class ReplayFunctionRegistry extends FunctionRegistryBase<
        StepAndWebDriverActionConfiguration,
        ReplayFunctionInvocation,
        WebDriverActionConfiguration> {

    public ReplayFunctionRegistry(BaseReplayFunctionFactory generatedFunctionFactory) {
        super(generatedFunctionFactory);
    }
}
