package com.hribol.bromium.record.javascript.generation.functions;


import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.JavascriptCodeSupplier;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface RecorderFunction extends JavascriptCodeSupplier {
    RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration);
}
