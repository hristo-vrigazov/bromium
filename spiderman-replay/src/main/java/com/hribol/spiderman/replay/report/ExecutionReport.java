package com.hribol.spiderman.replay.report;

import net.lightbody.bmp.core.har.Har;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class ExecutionReport {
    private LoadingTimes loadingTimes;
    private Har har;
    private AutomationResult automationResult;

    public ExecutionReport(LoadingTimes loadingTimes, Har har, AutomationResult automationResult) {
        this.loadingTimes = loadingTimes;
        this.har = har;
        this.automationResult = automationResult;
    }

    public void dumpHarMetrics(File outputFile) throws IOException {
        this.har.writeTo(outputFile);
    }

    public LoadingTimes getLoadingTimes() {
        return loadingTimes;
    }

    public AutomationResult getAutomationResult() {
        return automationResult;
    }
}
