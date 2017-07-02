package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.generation.replay.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptCodeSupplier;

/**
 * Created by hvrigazov on 02.07.17.
 */
public interface ReplayFunction extends JavascriptCodeSupplier,
    GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation> {
}
