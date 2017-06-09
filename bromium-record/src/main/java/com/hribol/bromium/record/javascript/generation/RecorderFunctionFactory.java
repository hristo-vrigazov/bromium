package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.RecorderFunction;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunctionFactory {
    RecorderFunction create(WebDriverActionConfiguration webDriverActionConfiguration);
}
