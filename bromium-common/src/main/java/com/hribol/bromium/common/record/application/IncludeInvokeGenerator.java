package com.hribol.bromium.common.record.application;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.TypeRegistry;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeGenerator implements JavascriptGenerator<NameWebDriverActionConfiguration> {
    private TypeRegistry recorderTypeRegistry;

    @Inject
    public IncludeInvokeGenerator(TypeRegistry recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(NameWebDriverActionConfiguration generationInformation) {
        String eventName = generationInformation.getEventName();
        WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();
        String getRecordingCode = recorderTypeRegistry.getCodeForType(eventName, webDriverActionConfiguration);
        recorderTypeRegistry.register(eventName, webDriverActionConfiguration);
        return getRecordingCode;
    }
}
