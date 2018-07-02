package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ConfirmAlert;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;

public class ConfirmAlertParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        return new ConfirmAlert(expectHttpRequest);
    }

}
