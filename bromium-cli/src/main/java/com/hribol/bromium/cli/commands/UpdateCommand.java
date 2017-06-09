package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils;

    @Inject
    public UpdateCommand(String pathToApplicationConfiguration, PromptUtils promptUtils) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.promptUtils = promptUtils;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = promptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's update the configuration!");

            promptUtils.updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            textIO.getTextTerminal().print(e.getMessage());
        }
    }
}
