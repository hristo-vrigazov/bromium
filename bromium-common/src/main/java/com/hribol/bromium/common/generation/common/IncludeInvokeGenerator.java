package com.hribol.bromium.common.generation.common;

import com.google.inject.Inject;
import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.generation.RegistryInformation;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeGenerator<T extends RegistryInformation> implements JavascriptGenerator<T> {
    private FunctionRegistry<T> recorderFunctionRegistry;

    @Inject
    public IncludeInvokeGenerator(FunctionRegistry<T> recorderFunctionRegistry) {
        this.recorderFunctionRegistry = recorderFunctionRegistry;
    }

    @Override
    public String generate(T generationInformation) {
        String getRecordingCode = recorderFunctionRegistry.generate(generationInformation);
        recorderFunctionRegistry.register(generationInformation);
        return getRecordingCode;
    }
}
