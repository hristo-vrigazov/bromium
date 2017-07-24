package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordBrowserTest {

    @Test
    public void integratesComponentsInCorrectWay() throws IOException, URISyntaxException, InterruptedException {
        TestScenarioSteps testScenarioSteps = mock(TestScenarioSteps.class);

        RecordManager recordManager = mock(RecordManager.class);
        when(recordManager.getTestCaseSteps()).thenReturn(testScenarioSteps);

        String baseUrl = "http://something.com";

        RecordBrowser recordBrowser = new RecordBrowser(baseUrl, recordManager);

        recordBrowser.record();

        verify(recordManager).prepareRecord();
        verify(recordManager).open(baseUrl);

        TestScenarioSteps actualTestCaseSteps = recordBrowser.getTestCaseSteps();

        assertEquals(testScenarioSteps, actualTestCaseSteps);

        recordBrowser.cleanUp();

        verify(recordManager).cleanUpRecord();
    }
}
