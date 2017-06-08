package com.hribol.bromium.record.javascript.generation.invocations.factory;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.functions.RecorderFunction;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunctionInvocationFactory {
    RecorderFunctionInvocation create(RecorderFunction recorderFunction, WebDriverActionConfiguration webDriverActionConfiguration);
}
