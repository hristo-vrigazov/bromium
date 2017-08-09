package com.hribol.bromium.integration.tests.record;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.IOException;
import java.util.Map;

import static com.hribol.bromium.cli.ParsedOptions.OUTPUT;
import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;
import static com.hribol.bromium.integration.tests.TestUtils.exampleTestScenarioSteps;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 24.07.17.
 */
public class RecordThroughTheRecordRequestFilterIT extends BaseRecordIntegrationTest {

    private TestScenarioSteps expected = exampleTestScenarioSteps();

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps actual = getActualSteps();
        assertEquals(expected, actual);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        RequestFilter recordRequestFilter = recordingSimulatorModule.getRecordRequestFilter();
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

        for (Map<String, String> testCaseStep: expected) {
            String queryString = ConfigurationUtils.toQueryString(testCaseStep);
            HttpRequest httpRequest = mock(HttpRequest.class);
            when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + queryString);
            recordRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
        }
    }
}
