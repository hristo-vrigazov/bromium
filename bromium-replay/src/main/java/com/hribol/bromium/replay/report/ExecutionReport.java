package com.hribol.bromium.replay.report;

import net.lightbody.bmp.core.har.Har;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class ExecutionReport {
    private LoadingTimes loadingTimes;
    private Har har;
    private AutomationResult automationResult;

    public static ExecutionReport noVirtualScreen() {
        return new ExecutionReport(LoadingTimes.empty(), new Har(), AutomationResult.NO_VIRTUAL_SCREEN);
    }

    public static ExecutionReport couldNotCreateDriver() {
        return new ExecutionReport(LoadingTimes.empty(), new Har(), AutomationResult.COULD_NOT_CREATE_DRIVER);
    }

    public ExecutionReport(LoadingTimes loadingTimes, Har har, AutomationResult automationResult) {
        this.loadingTimes = loadingTimes;
        this.har = har;
        this.automationResult = automationResult;
    }

    public LoadingTimes getLoadingTimes() {
        return loadingTimes;
    }

    public AutomationResult getAutomationResult() {
        return automationResult;
    }

    public Har getHar() {
        return har;
    }
}
