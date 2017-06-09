package com.hribol.bromium.common.record.application;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.TypeRegistry;
import com.hribol.bromium.record.javascript.generation.WebDriverActionGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeGenerator implements WebDriverActionGenerator {
    private TypeRegistry recorderTypeRegistry;

    @Inject
    public IncludeInvokeGenerator(TypeRegistry recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        String getRecordingCode = recorderTypeRegistry.getCodeForType(eventName, webDriverActionConfiguration);
        recorderTypeRegistry.register(eventName, webDriverActionConfiguration);
        return getRecordingCode;
    }
}
