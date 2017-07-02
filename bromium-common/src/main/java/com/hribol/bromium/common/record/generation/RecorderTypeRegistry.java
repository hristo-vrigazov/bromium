package com.hribol.bromium.common.record.generation;

import com.google.inject.Inject;
import com.hribol.bromium.common.TypeRegistryBase;
import com.hribol.bromium.common.record.generation.BaseRecorderFunctionFactory;
import com.hribol.bromium.common.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecorderTypeRegistry extends TypeRegistryBase<
        NameWebDriverActionConfiguration,
        RecorderFunctionInvocation,
        WebDriverActionConfiguration> {

    @Inject
    public RecorderTypeRegistry(BaseRecorderFunctionFactory recorderFunctionFactory) {
        super(recorderFunctionFactory);
    }

}
