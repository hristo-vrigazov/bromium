package browser.commands;

import config.ApplicationConfiguration;
import org.beryx.textio.TextIO;
import utils.*;

import java.io.IOException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class UpdateCommand implements Command {
    private TextIO textIO;
    private String pathToApplicationConfiguration;

    public UpdateCommand(String pathToApplicationConfiguration) {
        this.pathToApplicationConfiguration = pathToApplicationConfiguration;
    }

    @Override
    public void run() {
        try {
            ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
            textIO = PromptUtils.getTextIO();
            textIO.getTextTerminal().println("Let's update the configuration!");

            PromptUtils.promptForApplicationName(applicationConfiguration);
            PromptUtils.updateApplicationConfiguration(applicationConfiguration);

            String outputFilename = textIO
                    .newStringInputReader()
                    .read("Where should I save the configuration");
            ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

        } catch (IOException e) {
            textIO.getTextTerminal().print(e.getMessage());
        }
    }
}
