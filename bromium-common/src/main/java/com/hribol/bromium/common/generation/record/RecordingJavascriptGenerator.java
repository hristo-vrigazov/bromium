package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

/**
 * Represents a class which by a given {@link ApplicationConfiguration} generates recording javascript
 * code.
 */
public class RecordingJavascriptGenerator implements JavascriptGenerator<ApplicationConfiguration> {

    private JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator;
    private String baseTemplate;

    private final static Logger logger = LoggerFactory.getLogger(RecordingJavascriptGenerator.class);

    /**
     * Creates a new instance
     * @param baseTemplate the template to be included in the beginning
     * @param applicationActionGenerator the generator per action
     */
    public RecordingJavascriptGenerator(String baseTemplate, JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator) {
        this.baseTemplate = baseTemplate;
        this.applicationActionGenerator = applicationActionGenerator;
    }

    @Override
    public String generate(ApplicationConfiguration applicationConfiguration) {
        long start = System.currentTimeMillis();
        String generated = baseTemplate + System.lineSeparator() +
                applicationConfiguration
                        .getApplicationActionConfigurationList()
                        .stream()
                        .map(applicationActionConfiguration -> applicationActionGenerator.generate(applicationActionConfiguration) + System.lineSeparator())
                        .collect(Collectors.joining());
        long total = System.currentTimeMillis() - start;
        logger.info("Generation took {}ms", total);
        return generated;
    }
}
