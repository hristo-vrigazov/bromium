package com.hribol.bromium.common.record.functions;

import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.common.record.invocations.EmptyRecorderFunctionInvocation;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class EmptyRecorderFunction implements RecorderFunction {
    @Override
    public String getJavascriptCode() {
        return "";
    }

    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        return new EmptyRecorderFunctionInvocation();
    }
}
