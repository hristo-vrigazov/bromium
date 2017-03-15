package browser;

import io.airlift.airline.*;
import io.airlift.airline.model.CommandMetadata;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import record.RecordBrowser;

import java.io.IOException;
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

        @Override
        public void run() {
            System.out.println("Welcome! I will guide you through creating an automation layer for you application");
            TextIO textIO = TextIoFactory.getTextIO();
            String applicationName = textIO.newStringInputReader()
                    .read("What is the name of your application?");

            System.out.println("Let's now define some actions and assertions!");
            do {
                mainMenuChoice = textIO.newEnumInputReader(MainMenuChoice.class)
                        .read("Let's add another one! Choose from below");
            } while (!(mainMenuChoice == MainMenuChoice.SAVE_AND_EXIT));

            System.out.println(applicationName);
            System.out.println(mainMenuChoice);
            System.exit(0);
        }
    }

    public enum MainMenuChoice {
        ASSERTION,
        ACTION,
        SAVE_AND_EXIT
    }
}
