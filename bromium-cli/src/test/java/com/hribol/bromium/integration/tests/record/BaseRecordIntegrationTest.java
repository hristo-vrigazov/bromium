package com.hribol.bromium.integration.tests.record;

import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.ParsedOptions.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 08.08.17.
 */
public abstract class BaseRecordIntegrationTest extends BaseDemoAppIntegrationTest {
    public BaseRecordIntegrationTest(String resourceConfigurationPath, String pathToTestCase) {
        super(resourceConfigurationPath, pathToTestCase);
    }

    @Override
    public void runTest() throws IOException {
        /**
         * record
         * -d ./bromium-chrome/bromium-chrome-base/src/test/resources/chromedriver
         * -a /home/hvrigazov/bromium-data/demo-app/configurations/demo.json
         * -u http://localhost:3000
         * -o bromium-core/src/test/resources/dynamic-testCase.json
         */
        File outputFile = createTempFile(pathToTestCase);
        Map<String, Object> opts = new HashMap<>();
        opts.put(DRIVER, chromedriverFile.getAbsolutePath());
        opts.put(APPLICATION, configurationFile.getAbsolutePath());
        opts.put(URL, demoApp.getBaseUrl());
        opts.put(OUTPUT, outputFile.getAbsolutePath());
        opts.put(BROWSER, CHROME);
        opts.put(TIMEOUT, String.valueOf(10));
        opts.put(SCREEN, screen);
        doRunTest(opts);
    }

    protected abstract void doRunTest(Map<String, Object> opts) throws IOException;
}
