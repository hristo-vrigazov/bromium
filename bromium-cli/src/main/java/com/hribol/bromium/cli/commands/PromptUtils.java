package com.hribol.bromium.cli.commands;

import java.io.IOException;

/**
 * Utilities for prompting the user
 */
public class PromptUtils {


    public void promptForRecording() throws IOException {
        pressAnyKeyToContinue();
    }

    private void pressAnyKeyToContinue() throws IOException {
        System.out.println("Press Enter key to continue...");
        System.in.read();
    }
}
