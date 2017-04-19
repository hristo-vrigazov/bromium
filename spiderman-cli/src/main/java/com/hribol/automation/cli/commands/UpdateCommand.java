package com.hribol.automation.cli.commands;

import com.hribol.automation.config.ApplicationConfiguration;
import com.hribol.automation.utils.ConfigurationUtils;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils = new PromptUtils();

    public UpdateCommand(String pathToApplicationConfiguration) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = promptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's update the configuration!");

            promptUtils.promptForApplicationName(applicationConfiguration);
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
