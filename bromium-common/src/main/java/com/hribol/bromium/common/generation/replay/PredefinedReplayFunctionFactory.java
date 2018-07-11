package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionProvider;

import java.util.List;

/**
 * A {@link BaseReplayFunctionFactory} that uses only the predefined actions
 */
public class PredefinedReplayFunctionFactory extends BaseReplayFunctionFactory {

    public PredefinedReplayFunctionFactory(ReplayFunctionProvider replayFunctionProvider,
                                           List<String> additionalActions) {
        super(replayFunctionProvider, additionalActions);
    }

}
