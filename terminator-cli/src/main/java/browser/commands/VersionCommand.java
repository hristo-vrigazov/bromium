package browser.commands;

import config.ApplicationConfiguration;
import org.beryx.textio.TextIO;
import utils.ConfigurationUtils;

import java.io.IOException;

import static browser.commands.PromptUtils.promptForVersion;
import static browser.commands.PromptUtils.updateApplicationConfiguration;

/**
 * Created by hvrigazov on 12.04.17.
 */
public class VersionCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;

    public VersionCommand(String pathToApplicationConfiguration) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = PromptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's create a new version");

            applicationConfiguration.setVersion(promptForVersion());

            textIO.getTextTerminal().println("Let's update the actions that have to be different");
            updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
