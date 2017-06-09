package com.hribol.bromium.common.record.application;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.RecorderTypeRegistry;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorderGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGenerator implements WebDriverActionRecorderGenerator {
    private RecorderTypeRegistry recorderTypeRegistry;

    public IncludeInvokeRecorderGenerator(RecorderTypeRegistry recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        String getRecordingCode = recorderTypeRegistry.getRecordingCodeForType(eventName, webDriverActionConfiguration);
        recorderTypeRegistry.register(eventName, webDriverActionConfiguration);
        return getRecordingCode;
    }
}
