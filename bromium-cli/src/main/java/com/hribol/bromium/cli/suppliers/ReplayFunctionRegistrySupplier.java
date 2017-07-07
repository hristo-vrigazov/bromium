package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.generation.replay.BaseReplayFunctionFactory;
import com.hribol.bromium.common.generation.replay.ReplayFunctionRegistry;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class ReplayFunctionRegistrySupplier {
    public ReplayFunctionRegistry get(BaseReplayFunctionFactory baseReplayFunctionFactory) {
        return new ReplayFunctionRegistry(baseReplayFunctionFactory);
    }
}
