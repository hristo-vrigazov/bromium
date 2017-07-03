package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.record.RecordingJavascriptGenerator;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class RecordingJavascriptGeneratorSupplier {

    public RecordingJavascriptGenerator get(String baseTemplate, JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator) {
        return new RecordingJavascriptGenerator(baseTemplate, applicationActionGenerator);
    }
}
