package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ConfirmAlert;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

public class ConfirmAlertParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        return new ConfirmAlert(expectHttpRequest);
    }

}
