package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingJavascriptGenerator implements JavascriptGenerator<ApplicationConfiguration> {

    private JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator;
    private String baseTemplate;

    public RecordingJavascriptGenerator(String baseTemplate, JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator) {
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
