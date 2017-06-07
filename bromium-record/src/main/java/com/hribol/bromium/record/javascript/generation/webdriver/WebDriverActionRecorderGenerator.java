package com.hribol.bromium.record.javascript.generation.webdriver;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface WebDriverActionRecorderGenerator {
    String generate(WebDriverActionConfiguration webDriverActionConfiguration);
}
