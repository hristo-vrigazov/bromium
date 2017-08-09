package com.hribol.bromium.integration.tests.record;

import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.integration.tests.TestUtils.DYNAMIC_DEMO_PAGE;

/**
 * Created by hvrigazov on 08.08.17.
 */
public class RecordClickCssSelectorIT extends BaseRecordIntegrationTest {

    @Override
    protected void verifyAssertions() throws IOException {

    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(baseUrl + DYNAMIC_DEMO_PAGE);
    }

}
