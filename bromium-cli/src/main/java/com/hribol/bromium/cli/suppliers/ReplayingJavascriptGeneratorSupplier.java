package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.replay.ReplayingJavascriptGenerator;
import com.hribol.bromium.core.generation.JavascriptGenerator;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class ReplayingJavascriptGeneratorSupplier {
    public ReplayingJavascriptGenerator get(String baseTemplate,
                                            JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration,
                                            StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier) {
        return new ReplayingJavascriptGenerator(baseTemplate, generatorByStepAndActionConfiguration, stepAndActionConfigurationSupplier);
    }
}
