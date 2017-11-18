package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.parsing.JsonDumper;
import org.beryx.textio.TextIO;

import java.io.IOException;


/**
 * A command for creating a configuration
 */
public class InitCommand implements Command {
    private TextIO textIO;
    private ApplicationConfiguration applicationConfiguration;
    private PromptUtils promptUtils;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public InitCommand(ApplicationConfiguration applicationConfiguration,
                       PromptUtils promptUtils,
                       ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.applicationConfiguration = applicationConfiguration;
        this.promptUtils = promptUtils;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void run() {
        textIO = promptUtils.getTextIO();
        textIO.getTextTerminal().println("Welcome! I will guide you through creating an automation layer for you application");

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
            applicationConfigurationDumper.dumpApplicationConfiguration(applicationConfiguration, outputFilename);
        } catch (IOException e) {
            textIO.getTextTerminal().print(e.getMessage());
        } finally {
            promptUtils.dispose();
        }
    }

}
