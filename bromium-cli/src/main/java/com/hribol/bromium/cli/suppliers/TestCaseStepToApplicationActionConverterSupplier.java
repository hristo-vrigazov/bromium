package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.common.replay.factory.TestCaseStepToApplicationActionConverter;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class TestCaseStepToApplicationActionConverterSupplier {
    public TestCaseStepToApplicationActionConverter get(WebDriverActionFactory webDriverActionFactory) {
        return new TestCaseStepToApplicationActionConverter(webDriverActionFactory);
    }
}
