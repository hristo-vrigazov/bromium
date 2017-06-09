package com.hribol.bromium.common.record.application;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.TypeRegistry;
import com.hribol.bromium.record.javascript.generation.WebDriverActionRecorderGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGenerator implements WebDriverActionRecorderGenerator {
    private TypeRegistry recorderTypeRegistry;

    public IncludeInvokeRecorderGenerator(TypeRegistry recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        String getRecordingCode = recorderTypeRegistry.getCodeForType(eventName, webDriverActionConfiguration);
        recorderTypeRegistry.register(eventName, webDriverActionConfiguration);
        return getRecordingCode;
    }
}
