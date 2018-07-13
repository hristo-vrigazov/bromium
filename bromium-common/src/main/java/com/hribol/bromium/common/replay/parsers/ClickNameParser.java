package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickName;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.NAME;

public class ClickNameParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        String name = parameters.get(NAME);
        return new ClickName(name);
    }
}
