package com.hribol.bromium.common.generation.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.common.FunctionRegistryBase;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Represents a {@link FunctionRegistryBase} for recorder functions
 */
public class RecorderFunctionRegistry extends FunctionRegistryBase<
        NameWebDriverActionConfiguration,
        RecorderFunctionInvocation,
        WebDriverActionConfiguration> {

    @Inject
    public RecorderFunctionRegistry(BaseRecorderFunctionFactory recorderFunctionFactory) {
        super(recorderFunctionFactory);
    }

}
