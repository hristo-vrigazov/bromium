package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.core.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.parsing.JsonDumper;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * A command for updating a configuration
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider;
    private PromptUtils promptUtils;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public UpdateCommand(IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider,
                         PromptUtils promptUtils,
                         ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.applicationConfigurationIOProvider = applicationConfigurationIOProvider;
        this.promptUtils = promptUtils;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void run() {
        textIO = promptUtils.getTextIO();

        try {
            ApplicationConfiguration applicationConfiguration = applicationConfigurationIOProvider.get();
            textIO.getTextTerminal().println("Let's update the configuration!");

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
