package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.cli.providers.IOURIProvider;
import com.hribol.bromium.replay.ReplayBrowser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class ReplayCommandRewrite implements Command {

    private IOURIProvider<ReplayBrowser> replayBrowserProvider;
    private IOProvider<List<Map<String, String>>> stepsProvider;

    @Inject
    public ReplayCommandRewrite(IOURIProvider<ReplayBrowser> replayBrowserProvider, IOProvider<List<Map<String, String>>> stepsProvider) {
        this.replayBrowserProvider = replayBrowserProvider;
        this.stepsProvider = stepsProvider;
    }

    @Override
    public void run() {
        try {
            replayBrowserProvider.get().replay(stepsProvider.get());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
