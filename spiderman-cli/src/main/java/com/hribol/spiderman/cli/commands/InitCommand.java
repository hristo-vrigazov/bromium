package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.replay.config.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.config.utils.ConfigurationUtils;
import org.beryx.textio.TextIO;

import java.io.IOException;


/**
 * Created by hvrigazov on 11.04.17.
 */
public class InitCommand implements Command {
    private TextIO textIO;
    private ApplicationConfiguration applicationConfiguration;
    private PromptUtils promptUtils;

    public InitCommand(PromptUtils promptUtils) {
        this.promptUtils = promptUtils;
    }

    @Override
    public void run() {
        textIO = promptUtils.getTextIO();
        textIO.getTextTerminal().println("Welcome! I will guide you through creating an automation layer for you application");
        applicationConfiguration = new ApplicationConfiguration();

        textIO.getTextTerminal().println();
        applicationConfiguration.setApplicationName(textIO
                .newStringInputReader()
                .read("What is the name of your application?"));

        applicationConfiguration.setVersion(promptUtils.promptForVersion());

        textIO.getTextTerminal().println();
        textIO.getTextTerminal().println("Let's now define some actions and assertions!");
        textIO.getTextTerminal().println();
        textIO.getTextTerminal().println("The initial page loading is added by default");

        promptUtils.showAssertionActionChoice(applicationConfiguration);

        try {
            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);
        } catch (IOException e) {
            textIO.getTextTerminal().print(e.getMessage());
        }
    }

}
