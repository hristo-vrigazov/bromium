package com.hribol.bromium.common.record.functions;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.RecorderFunction;
import com.hribol.bromium.common.record.invocations.EmptyRecorderFunctionInvocation;
import com.hribol.bromium.core.generation.RecorderFunctionInvocation;

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
