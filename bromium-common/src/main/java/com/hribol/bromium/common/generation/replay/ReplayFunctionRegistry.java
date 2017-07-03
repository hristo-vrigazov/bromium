package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.common.FunctionRegistryBase;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayFunctionRegistry extends FunctionRegistryBase<
        StepAndWebDriverActionConfiguration,
        ReplayFunctionInvocation,
        WebDriverActionConfiguration> {

    public ReplayFunctionRegistry(BaseReplayFunctionFactory generatedFunctionFactory) {
        super(generatedFunctionFactory);
    }
}
