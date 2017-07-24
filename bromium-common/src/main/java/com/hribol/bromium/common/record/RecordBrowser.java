package com.hribol.bromium.common.record;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.providers.IOProvider;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URL;
import static com.hribol.bromium.core.DependencyInjectionConstants.PATH_TO_DRIVER;
import static com.hribol.bromium.core.DependencyInjectionConstants.PATH_TO_DRIVER_EXECUTABLE_SYSTEM_PROPERTY;

/**
 * Created by hvrigazov on 09.03.17.
 */
public class RecordBrowser {

    private final String baseUrl;
    private final RecordManager recordManager;

    @Inject
    public RecordBrowser(@Named(BASE_URL) String baseUrl,
                         RecordManager recordManager) throws IOException {
        this.baseUrl = baseUrl;
        this.recordManager = recordManager;
    }

    public void record() throws IOException {
        recordManager.prepareRecord();
        recordManager.open(baseUrl);
    }

    public TestScenarioSteps getTestCaseSteps() {
        return recordManager.getTestCaseSteps();
    }

    public void cleanUp() {
        recordManager.cleanUpRecord();
    }
}
