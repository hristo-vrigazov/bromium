package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.replay.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.config.utils.ConfigurationUtils;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils;

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
