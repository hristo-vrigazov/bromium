package com.hribol.bromium.replay.report;

import net.lightbody.bmp.core.har.Har;

/**
 * Represents report from an execution
 */
public class ExecutionReport {
    private LoadingTimes loadingTimes;
    private Har har;
    private AutomationResult automationResult;

    /**
     * Utility function for missing virtual screen
     * @return the report
     */
    public static ExecutionReport noVirtualScreen() {
        return new ExecutionReport(LoadingTimes.empty(), new Har(), AutomationResult.NO_VIRTUAL_SCREEN);
    }

    /**
     * Utility function for the case when the driver could not be created
     * @return
     */
    public static ExecutionReport couldNotCreateDriver() {
        return new ExecutionReport(LoadingTimes.empty(), new Har(), AutomationResult.COULD_NOT_CREATE_DRIVER);
    }

    /**
     * Constructs a new execution report
     * @param loadingTimes the times for loading of different actions
     * @param har the http records
     * @param automationResult
     */
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
