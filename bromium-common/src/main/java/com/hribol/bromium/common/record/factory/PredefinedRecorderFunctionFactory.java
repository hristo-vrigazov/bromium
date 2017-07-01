package com.hribol.bromium.common.record.factory;

import com.google.inject.Inject;
import com.hribol.bromium.common.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class PredefinedRecorderFunctionFactory extends BaseRecorderFunctionFactory {

    @Inject
    public PredefinedRecorderFunctionFactory(Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>> emptyGeneratedFunctionSupplier) {
        super(emptyGeneratedFunctionSupplier);
    }

    @Override
    protected void addCustom() {

    }
}
