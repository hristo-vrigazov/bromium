package com.hribol.spiderman.replay.report;

import net.lightbody.bmp.core.har.Har;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 15.05.17.
 */
public class ExecutionReportTest {

    @Test
    public void canAccessFilesNeededForReport() {
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        Har har = mock(Har.class);
        AutomationResult automationResult = AutomationResult.SUCCESS;

        ExecutionReport executionReport = new ExecutionReport(loadingTimes, har, automationResult);

        assertEquals(loadingTimes, executionReport.getLoadingTimes());
        assertEquals(har, executionReport.getHar());
        assertEquals(automationResult, executionReport.getAutomationResult());
    }

}
