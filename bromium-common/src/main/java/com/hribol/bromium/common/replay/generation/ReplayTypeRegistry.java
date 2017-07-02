package com.hribol.bromium.common.replay.generation;

import com.hribol.bromium.common.TypeRegistryBase;
import com.hribol.bromium.common.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GeneratedFunctionFactory;

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
