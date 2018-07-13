package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickId;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.ID;

public class ClickIdParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        return new ClickId(parameters.get(ID));
    }
}
