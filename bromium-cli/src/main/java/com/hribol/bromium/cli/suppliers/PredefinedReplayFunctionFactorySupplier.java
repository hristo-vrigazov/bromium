package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.PredefinedReplayFunctionFactory;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class PredefinedReplayFunctionFactorySupplier {
    public PredefinedReplayFunctionFactory get(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                               JsCollector jsCollector) {
        return new PredefinedReplayFunctionFactory(emptyGeneratedFunctionSupplier, jsCollector);
    }
}
