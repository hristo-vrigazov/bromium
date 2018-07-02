package com.hribol.bromium.cli;

import com.hribol.bromium.common.generation.record.functions.RecorderFunction;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunction;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

public interface Action {

    WebDriverActionParameterParser getParser();

    RecorderFunction getRecorderFunction();

    ReplayFunction getReplayFunction();

}
