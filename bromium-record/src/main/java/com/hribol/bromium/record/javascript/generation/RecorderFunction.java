package com.hribol.bromium.record.javascript.generation;


import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.JavascriptCodeSupplier;
import com.hribol.bromium.record.javascript.generation.RecorderFunctionInvocation;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunction extends JavascriptCodeSupplier {
    RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
}
