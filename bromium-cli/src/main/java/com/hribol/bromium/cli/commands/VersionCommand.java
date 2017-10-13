package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * A command for creating a new version of an application
 */
public class VersionCommand implements Command {
    private TextIO textIO;
    private PromptUtils promptUtils;
    private IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public VersionCommand(PromptUtils promptUtils,
                          IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider,
                          ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.promptUtils = promptUtils;
        this.applicationConfigurationIOProvider = applicationConfigurationIOProvider;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void run() {
        textIO = promptUtils.getTextIO();

        try {
            ApplicationConfiguration applicationConfiguration = applicationConfigurationIOProvider.get();
            textIO.getTextTerminal().println("Let's create a new version");

            applicationConfiguration.setVersion(promptUtils.promptForVersion());

            textIO.getTextTerminal().println("Let's update the actions that have to be different");
            promptUtils.updateApplicationConfiguration(applicationConfiguration);

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
