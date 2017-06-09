package com.hribol.bromium.common.record;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.ApplicationActionRecorder;

import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingJavascriptGenerator implements JavascriptGenerator {

    private ApplicationActionRecorder applicationActionRecorder;
    private String baseTemplate;

    public RecordingJavascriptGenerator(String baseTemplate, ApplicationActionRecorder applicationActionRecorder) {
        this.baseTemplate = baseTemplate;
        this.applicationActionRecorder = applicationActionRecorder;
    }

    @Override
    public String generate(ApplicationConfiguration applicationConfiguration) {
        return baseTemplate +
                applicationConfiguration
                .getApplicationActionConfigurationList()
                .stream()
                .map(applicationActionConfiguration -> applicationActionRecorder.generate(applicationActionConfiguration))
                .collect(Collectors.joining());
    }
}
