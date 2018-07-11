package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.generation.record.functions.RecorderFunctionProvider;

import java.util.List;

/**
 * A {@link BaseRecorderFunctionFactory} that uses just the predefined actions
 */
public class PredefinedRecorderFunctionFactory extends BaseRecorderFunctionFactory {

    public PredefinedRecorderFunctionFactory(RecorderFunctionProvider recorderFunctionProvider,
                                             List<String> additionalActions) {
        super(recorderFunctionProvider, additionalActions);
    }

}
