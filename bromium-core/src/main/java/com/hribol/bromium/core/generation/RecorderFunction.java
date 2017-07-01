package com.hribol.bromium.core.generation;


import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunction extends JavascriptCodeSupplier {
    RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
}
