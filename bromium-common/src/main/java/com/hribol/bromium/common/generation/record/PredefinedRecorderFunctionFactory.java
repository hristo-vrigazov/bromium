package com.hribol.bromium.common.generation.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
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
