package com.hribol.bromium.common.record.generation;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.generation.TypeRegistry;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeGenerator implements JavascriptGenerator<NameWebDriverActionConfiguration> {
    private TypeRegistry<NameWebDriverActionConfiguration> recorderTypeRegistry;

    @Inject
    public IncludeInvokeGenerator(TypeRegistry<NameWebDriverActionConfiguration> recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(NameWebDriverActionConfiguration generationInformation) {
        String getRecordingCode = recorderTypeRegistry.generate(generationInformation);
        recorderTypeRegistry.register(generationInformation);
        return getRecordingCode;
    }
}
