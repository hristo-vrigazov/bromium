package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;

import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepsAndConfigurationSupplier {
    public StepsAndConfiguration get(List<Map<String, String>> testCaseSteps, ApplicationConfiguration applicationConfiguration) {
        return new StepsAndConfiguration(testCaseSteps, applicationConfiguration);
    }

}
