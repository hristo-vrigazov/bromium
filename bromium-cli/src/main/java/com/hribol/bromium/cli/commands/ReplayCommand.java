package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.cli.providers.IOURIProvider;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class ReplayCommand implements Command {

    private PromptUtils promptUtils;
    private IOURIProvider<ReplayBrowser> replayBrowserProvider;
    private IOProvider<List<Map<String, String>>> stepsProvider;

    @Inject
    public ReplayCommand(PromptUtils promptUtils, IOURIProvider<ReplayBrowser> replayBrowserProvider, IOProvider<List<Map<String, String>>> stepsProvider) {
        this.promptUtils = promptUtils;
        this.replayBrowserProvider = replayBrowserProvider;
        this.stepsProvider = stepsProvider;
    }

    @Override
    public void run() {
        try {
            List<Map<String, String>> testCaseSteps = stepsProvider.get();
            ReplayBrowser replayBrowser = replayBrowserProvider.get();
            ExecutionReport executionReport = replayBrowser.replay(testCaseSteps);
            System.out.println(executionReport.getAutomationResult());
        } catch (IOException | URISyntaxException e) {
            promptUtils.getTextIO().getTextTerminal().println(e.getMessage());
        } finally {
            promptUtils.dispose();
        }
    }
}
