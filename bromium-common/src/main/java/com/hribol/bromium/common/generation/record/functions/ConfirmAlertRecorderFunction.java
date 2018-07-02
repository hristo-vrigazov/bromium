package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.ConfirmAlertInvocation;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;

public class ConfirmAlertRecorderFunction implements RecorderFunction {

    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        return new ConfirmAlertInvocation();
    }

    /**
     * @return the javascript code
     */
    @Override
    public String getJavascriptCode() {
        return "";
    }
}
