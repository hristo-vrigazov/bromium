package com.hribol.bromium.common.record.invocations;

import com.hribol.bromium.common.record.functions.RecorderFunctionInvocation;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class EmptyRecorderFunctionInvocation implements RecorderFunctionInvocation {
    @Override
    public String getJavascriptCode() {
        return "";
    }
}
