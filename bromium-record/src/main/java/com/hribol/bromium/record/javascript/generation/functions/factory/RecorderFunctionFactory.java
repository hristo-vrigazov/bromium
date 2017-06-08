package com.hribol.bromium.record.javascript.generation.functions.factory;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.functions.RecorderFunction;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunctionFactory {
    RecorderFunction create(WebDriverActionConfiguration webDriverActionConfiguration);
}
