package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.ReplayFunctionRegistry;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class IncludeInvokeGeneratorSupplier {
    public IncludeInvokeGenerator<StepAndWebDriverActionConfiguration> get(ReplayFunctionRegistry replayFunctionRegistry) {
        return new IncludeInvokeGenerator<>(replayFunctionRegistry);
    }
}
