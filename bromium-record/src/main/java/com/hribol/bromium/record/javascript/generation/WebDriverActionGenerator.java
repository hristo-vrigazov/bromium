package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface WebDriverActionGenerator {
    String generate(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
}
