package com.hribol.bromium.cli.commands;

/**
 * Utilities for prompting the user
 */
public class PromptUtils {


    public void promptForRecording() {
        pressAnyKeyToContinue();
    }

    private void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
