package com.hribol.bromium.record.javascript.generation.functions;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.invocations.EmptyRecorderFunctionInvocation;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class EmptyRecorderFunction implements RecorderFunction {
    @Override
    public String getJavascriptCode() {
        return "";
    }

    @Override
    public RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        return new EmptyRecorderFunctionInvocation();
    }
}
