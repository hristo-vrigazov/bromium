package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.replay.ReplayGeneratorByStepAndActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class ReplayGeneratorByStepAndActionConfigurationSupplier {

    public ReplayGeneratorByStepAndActionConfiguration get(JavascriptGenerator<StepAndWebDriverActionConfiguration> generator,
                                                           StepAndWebDriverActionConfigurationSupplier supplier) {
        return new ReplayGeneratorByStepAndActionConfiguration(generator, supplier);
    }
}
