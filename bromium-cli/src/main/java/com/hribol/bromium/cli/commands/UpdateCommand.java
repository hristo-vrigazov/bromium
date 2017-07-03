package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.beryx.textio.TextIO;

import java.io.IOException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;
    private PromptUtils promptUtils;
    private ApplicationConfigurationParser applicationConfigurationParser;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public UpdateCommand(String pathToApplicationConfiguration,
                         PromptUtils promptUtils,
                         ApplicationConfigurationParser applicationConfigurationParser, ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
        this.promptUtils = promptUtils;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void run() {
        textIO = promptUtils.getTextIO();

        try {
            ApplicationConfiguration applicationConfiguration = applicationConfigurationParser.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO.getTextTerminal().println("Let's update the configuration!");

            promptUtils.updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            applicationConfigurationDumper.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            textIO.getTextTerminal().print(e.getMessage());
        }
    }
}
