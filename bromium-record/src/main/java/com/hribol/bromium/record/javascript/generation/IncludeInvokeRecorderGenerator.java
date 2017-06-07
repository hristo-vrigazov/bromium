package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorderGenerator;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGenerator implements WebDriverActionRecorderGenerator {
    private JavascriptRecorderBuilder javascriptRecorderBuilder;

    public IncludeInvokeRecorderGenerator(JavascriptRecorderBuilder javascriptRecorderBuilder) {
        this.javascriptRecorderBuilder = javascriptRecorderBuilder;
    }

    @Override
    public String generate(WebDriverActionConfiguration webDriverActionConfiguration) {
        if (!javascriptRecorderBuilder.isActionWithTheSameTypeIncluded(webDriverActionConfiguration)) {
            String recordingCode = javascriptRecorderBuilder.getRecordingCodeForType(webDriverActionConfiguration);
            javascriptRecorderBuilder.registerRecordingType(webDriverActionConfiguration);
            return recordingCode;
        }

        String recordingCode = javascriptRecorderBuilder.getInvocationCodeForType(webDriverActionConfiguration);
        javascriptRecorderBuilder.registerInvocationOfRecordingType(webDriverActionConfiguration);
        return recordingCode;
    }
}
