package com.hribol.bromium.common.generation.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.common.TypeRegistryBase;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
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
