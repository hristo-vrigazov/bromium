package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.cli.providers.IOURIProvider;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.cli.Constants.SCREEN_NUMBER;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class ReplayCommand implements Command {

    private PromptUtils promptUtils;
    private IOURIProvider<ReplayBrowser> replayBrowserProvider;
    private IOProvider<List<Map<String, String>>> stepsProvider;
    private VirtualScreenProcessCreator virtualScreenProcessCreator;
    private Integer screenNumber;

    @Inject
    public ReplayCommand(PromptUtils promptUtils,
                         IOURIProvider<ReplayBrowser> replayBrowserProvider,
                         IOProvider<List<Map<String, String>>> stepsProvider,
                         VirtualScreenProcessCreator virtualScreenProcessCreator,
                         @Named(SCREEN_NUMBER) Integer screenNumber) {
        this.promptUtils = promptUtils;
        this.replayBrowserProvider = replayBrowserProvider;
        this.stepsProvider = stepsProvider;
        this.virtualScreenProcessCreator = virtualScreenProcessCreator;
        this.screenNumber = screenNumber;
    }

    @Override
    public void run() {
        try {
            List<Map<String, String>> testCaseSteps = stepsProvider.get();
            ReplayBrowser replayBrowser = replayBrowserProvider.get();

            ExecutionReport executionReport = screenNumber == 0 ?
                    replayBrowser.replay(testCaseSteps) :
                    replayBrowser.createVirtualScreenProcessAndExecute(testCaseSteps, screenNumber, virtualScreenProcessCreator);

            System.out.println(executionReport.getAutomationResult());
        } catch (IOException | URISyntaxException e) {
            promptUtils.getTextIO().getTextTerminal().println(e.getMessage());
        } finally {
            promptUtils.dispose();
        }
    }
}
