package com.hribol.bromium.record.javascript.generation.webdriver;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.RecorderTypeRegistry;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGenerator implements WebDriverActionRecorderGenerator {
    private RecorderTypeRegistry recorderTypeRegistry;

    public IncludeInvokeRecorderGenerator(RecorderTypeRegistry recorderTypeRegistry) {
        this.recorderTypeRegistry = recorderTypeRegistry;
    }

    @Override
    public String generate(WebDriverActionConfiguration webDriverActionConfiguration) {
        String getRecordingCode = recorderTypeRegistry.getRecordingCodeForType(webDriverActionConfiguration);
        recorderTypeRegistry.register(webDriverActionConfiguration);
        return getRecordingCode;
    }
}
