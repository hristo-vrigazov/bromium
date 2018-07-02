package com.hribol.bromium.common.generation.record.invocations;

import static com.hribol.bromium.core.utils.WebDriverActions.CONFIRM_ALERT;

public class ConfirmAlertInvocation implements RecorderFunctionInvocation {

    @Override
    public String getJavascriptCode() {
        return "\n" + CONFIRM_ALERT + "();\n";
    }
}
