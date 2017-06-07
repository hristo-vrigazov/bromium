package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.application.ApplicationActionRecorder;

import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingJavascriptGenerator implements JavascriptGenerator {

    private ApplicationActionRecorder applicationActionRecorder;

    public RecordingJavascriptGenerator(ApplicationActionRecorder applicationActionRecorder) {
        this.applicationActionRecorder = applicationActionRecorder;
    }

    @Override
    public String generate(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration
                .getApplicationActionConfigurationList()
                .stream()
                .map(applicationActionConfiguration -> applicationActionRecorder.generate(applicationActionConfiguration))
                .collect(Collectors.joining());
    }
}
