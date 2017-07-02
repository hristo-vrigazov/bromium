package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class PredefinedReplayFunctionFactory extends BaseReplayFunctionFactory {
    public PredefinedReplayFunctionFactory(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                           JsCollector jsCollector) {
        super(emptyGeneratedFunctionSupplier, jsCollector);
    }

    @Override
    protected void addCustom() {

    }
}
