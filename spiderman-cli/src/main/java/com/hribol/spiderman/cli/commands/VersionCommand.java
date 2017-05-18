package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.replay.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.config.utils.ConfigurationUtils;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 12.04.17.
 */
public class VersionCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils;

    public VersionCommand(String pathToApplicationConfiguration, PromptUtils promptUtils) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.promptUtils = promptUtils;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = promptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's create a new version");

            applicationConfiguration.setVersion(promptUtils.promptForVersion());

            textIO.getTextTerminal().println("Let's update the actions that have to be different");
            promptUtils.updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
