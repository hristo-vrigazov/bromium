package com.hribol.bromium.common.generation.common;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.generation.RegistryInformation;
import com.hribol.bromium.core.generation.TypeRegistry;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeGenerator<T extends RegistryInformation> implements JavascriptGenerator<T> {
    private TypeRegistry<T> recorderTypeRegistry;

    @Inject
    public IncludeInvokeGenerator(TypeRegistry<T> recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(T generationInformation) {
        String getRecordingCode = recorderTypeRegistry.generate(generationInformation);
        recorderTypeRegistry.register(generationInformation);
        return getRecordingCode;
    }
}
