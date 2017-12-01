package com.hribol.bromium.common.record;

import com.hribol.bromium.common.replay.DriverOperations;
import com.hribol.bromium.core.TestScenarioSteps;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordBrowserTest {

    @Test
    public void integratesComponentsInCorrectWay() throws IOException, URISyntaxException, InterruptedException {
        TestScenarioSteps testScenarioSteps = mock(TestScenarioSteps.class);

        DriverOperations recordOperations = mock(DriverOperations.class);
        Supplier<TestScenarioSteps> stepsSupplier = () -> testScenarioSteps;

        String baseUrl = "http://something.com";

        RecordBrowser recordBrowser = new RecordBrowser(baseUrl, recordOperations, stepsSupplier);

        recordBrowser.record();

        verify(recordOperations).prepare();
        verify(recordOperations).open(baseUrl);

        TestScenarioSteps actualTestCaseSteps = recordBrowser.getTestCaseSteps();

        assertEquals(testScenarioSteps, actualTestCaseSteps);

        recordBrowser.cleanUp();

        verify(recordOperations).cleanUp();
    }
}
