package com.hribol.bromium.common.generation.record.invocations;

import com.hribol.bromium.common.generation.common.NormalInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_DATA_ID;

public class ClickDataIdInvocation extends NormalInvocation implements RecorderFunctionInvocation {
    public ClickDataIdInvocation(String dataId, String eventName) {
        super(CLICK_DATA_ID, dataId, eventName);
    }
}
