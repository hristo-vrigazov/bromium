package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 12.04.17.
 */
public class VersionCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils;
    private ApplicationConfigurationParser applicationConfigurationParser;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    public VersionCommand(String pathToApplicationConfiguration,
                          PromptUtils promptUtils,
                          ApplicationConfigurationParser applicationConfigurationParser, ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.promptUtils = promptUtils;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = applicationConfigurationParser.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = promptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's create a new version");

            applicationConfiguration.setVersion(promptUtils.promptForVersion());

            textIO.getTextTerminal().println("Let's update the actions that have to be different");
            promptUtils.updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            applicationConfigurationDumper.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
