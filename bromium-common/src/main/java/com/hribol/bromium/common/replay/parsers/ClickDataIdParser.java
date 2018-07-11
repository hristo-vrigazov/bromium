package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.ClickDataId;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.DATA_ID;

public class ClickDataIdParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        String dataId = parameters.get(DATA_ID);
        return new ClickDataId(dataId, expectHttpRequest);
    }

}
