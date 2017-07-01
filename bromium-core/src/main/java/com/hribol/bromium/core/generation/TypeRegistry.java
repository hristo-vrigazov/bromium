package com.hribol.bromium.core.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 09.06.17.
 */
public interface TypeRegistry {
    String getCodeForType(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
    void register(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
}
