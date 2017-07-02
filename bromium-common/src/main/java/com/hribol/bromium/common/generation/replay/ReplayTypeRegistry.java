package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.common.TypeRegistryBase;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayTypeRegistry extends TypeRegistryBase<
        StepAndWebDriverActionConfiguration,
        ReplayFunctionInvocation,
        WebDriverActionConfiguration> {

    public ReplayTypeRegistry(BaseReplayFunctionFactory generatedFunctionFactory) {
        super(generatedFunctionFactory);
    }
}
