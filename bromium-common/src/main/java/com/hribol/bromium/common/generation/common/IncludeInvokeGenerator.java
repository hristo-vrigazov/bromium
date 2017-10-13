package com.hribol.bromium.common.generation.common;

import com.google.inject.Inject;
import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.generation.RegistryInformation;

/**
 * Represents a {@link JavascriptGenerator} which generates code by a given {@link RegistryInfo} and then registers the
 * {@link RegistryInfo} to a given {@link FunctionRegistry}
 * @param <RegistryInfo> the info needed for registration
 */
public class IncludeInvokeGenerator<RegistryInfo extends RegistryInformation> implements JavascriptGenerator<RegistryInfo> {
    private FunctionRegistry<RegistryInfo> recorderFunctionRegistry;

    @Inject
    public IncludeInvokeGenerator(FunctionRegistry<RegistryInfo> recorderFunctionRegistry) {
        this.recorderFunctionRegistry = recorderFunctionRegistry;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generate(RegistryInfo generationInformation) {
        String getRecordingCode = recorderFunctionRegistry.generate(generationInformation);
        recorderFunctionRegistry.register(generationInformation);
        return getRecordingCode;
    }
}
