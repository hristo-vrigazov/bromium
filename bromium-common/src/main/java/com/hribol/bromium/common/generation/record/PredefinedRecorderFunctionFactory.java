package com.hribol.bromium.common.generation.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

/**
 * A {@link BaseRecorderFunctionFactory} that uses just the predefined actions
 */
public class PredefinedRecorderFunctionFactory extends BaseRecorderFunctionFactory {

    @Inject
    public PredefinedRecorderFunctionFactory(Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                             JsCollector jsCollector) {
        super(emptyGeneratedFunctionSupplier, jsCollector);
    }

    @Override
    protected void addCustom() {

    }
}
