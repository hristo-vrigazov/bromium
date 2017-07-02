package com.hribol.bromium.common.replay.functions;

import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.replay.generation.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptCodeSupplier;

/**
 * Created by hvrigazov on 02.07.17.
 */
public interface ReplayFunction extends JavascriptCodeSupplier,
    GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation> {
}
