package com.hribol.bromium.common.record;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.ApplicationActionGenerator;

import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingJavascriptGenerator implements JavascriptGenerator {

    private ApplicationActionGenerator applicationActionGenerator;
    private String baseTemplate;

    public RecordingJavascriptGenerator(String baseTemplate, ApplicationActionGenerator applicationActionGenerator) {
        this.baseTemplate = baseTemplate;
        this.applicationActionGenerator = applicationActionGenerator;
    }

    @Override
    public String generate(ApplicationConfiguration applicationConfiguration) {
        return baseTemplate +
                applicationConfiguration
                .getApplicationActionConfigurationList()
                .stream()
                .map(applicationActionConfiguration -> applicationActionGenerator.generate(applicationActionConfiguration))
                .collect(Collectors.joining());
    }
}
