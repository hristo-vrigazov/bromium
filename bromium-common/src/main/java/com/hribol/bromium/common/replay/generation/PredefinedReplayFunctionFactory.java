package com.hribol.bromium.common.replay.generation;

import com.hribol.bromium.common.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class PredefinedReplayFunctionFactory extends BaseReplayFunctionFactory {
    public PredefinedReplayFunctionFactory(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier) {
        super(emptyGeneratedFunctionSupplier);
    }

    @Override
    protected void addCustom() {

    }
}
