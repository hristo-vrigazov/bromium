package browser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import config.ApplicationActionConfiguration;
import config.ApplicationConfiguration;
import io.airlift.airline.*;
import io.airlift.airline.model.CommandMetadata;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import record.RecordBrowser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("bot")
                .withDescription("Selenium record and replay bot for applications")
                .withDefaultCommand(Help.class)
                .withCommands(Help.class, Init.class);

        builder
                .withGroup("test")
                .withDescription("Commands related to test cases")
                .withDefaultCommand(Record.class)
                .withCommands(Record.class);

        Cli<Runnable> parser = builder.build();

        try {
            parser.parse(args).run();
        } catch (ParseOptionMissingException | ParseArgumentsUnexpectedException e) {

            final List<String> commandNames =
                    parser.getMetadata().getCommandGroups().stream()
                            .flatMap(cg -> cg.getCommands().stream().map(CommandMetadata::getName))
                            .collect(Collectors.toList());

            Help.help(parser.getMetadata(), commandNames);
        }
    }

    @Command(name = "record", description = "Opens up the browser and listens for application specific events")
    public static class Record implements Runnable {

        @Option(name = "-d", description = "Path to chrome driver executable", required = true)
        public String pathToChromedriver;

        @Option(name = "-j", description = "Path to js file to be injected into every response", required = true)
        public String pathToJSInjectionFile;

        @Option(name = "-u", description = "Base url of your application", required = true)
        public String baseUrl;

        @Option(name = "-o", description = "The output file, which will contain the test cases as JSON", required = true)
        public String outputFile;

        @Override
        public void run() {
            RecordBrowser recordBrowser = new RecordBrowser(pathToChromedriver, pathToJSInjectionFile);
            try {
                recordBrowser.record(baseUrl);
                System.out.println("Press Enter when finished recording");
                System.in.read();
                recordBrowser.dumpActions(outputFile);
            } catch (IOException | InterruptedException | URISyntaxException e) {
                e.printStackTrace();
            }

            recordBrowser.quit();

            System.exit(0);
        }
    }

    @Command(name = "init", description = "Guides you through creating an automation layer for your application!")
    public static class Init implements Runnable {

        MainMenuChoice mainMenuChoice;
        ApplicationConfiguration applicationConfiguration;
        TextIO textIO;

        @Override
        public void run() {
            textIO = TextIoFactory.getTextIO();
            textIO.getTextTerminal().println("Welcome! I will guide you through creating an automation layer for you application");
            applicationConfiguration = new ApplicationConfiguration();

            applicationConfiguration.setApplicationName(textIO
                    .newStringInputReader()
                    .read("What is the name of your application?"));

            applicationConfiguration.setVersion(textIO
                    .newStringInputReader()
                    .withDefaultValue("0.0.1")
                    .read("What is the version of your application?"));

            textIO.getTextTerminal().println("Let's now define some actions and assertions!");
            textIO.getTextTerminal().println("The initial page loading is added by default");

            showAssertionActionChoice();

            try {
                String outputFilename = textIO
                        .newStringInputReader()
                        .read("Where should I save the configuration");
                Writer writer = new FileWriter(outputFilename);
                Gson gson = new GsonBuilder().create();
                gson.toJson(applicationConfiguration, writer);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.exit(0);
        }

        private void showAssertionActionChoice() {
            do {
                mainMenuChoice = textIO.newEnumInputReader(MainMenuChoice.class)
                        .read("Let's add another one! Choose from below");

                switch (mainMenuChoice) {
                    case ASSERTION:
                        textIO.getTextTerminal().println("Let's add an assertion!");
                        break;
                    case CONDITION_FOR_EXECUTION:
                        textIO.getTextTerminal().println("Let's add a condition for execution!");
                        break;
                    case ACTION:
                        textIO.getTextTerminal().println("Let's add an action!");
                        showAddActionMenu();
                        break;
                    default:
                        break;
                }
            } while (!(mainMenuChoice == MainMenuChoice.SAVE_AND_EXIT));
        }

        private void showAddActionMenu() {
            String actionName = textIO.newStringInputReader().read("Action name: ");
            ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
            applicationActionConfiguration.setName(actionName);
            applicationConfiguration.addApplicationAction(applicationActionConfiguration);
            textIO.getTextTerminal().println("Done!");
            textIO.getTextTerminal().println();
        }
    }

    public enum MainMenuChoice {
        ASSERTION,
        CONDITION_FOR_EXECUTION,
        ACTION,
        SAVE_AND_EXIT
    }
}
