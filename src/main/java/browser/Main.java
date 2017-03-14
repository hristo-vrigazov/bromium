package browser;

import io.airlift.airline.*;
import io.airlift.airline.model.CommandMetadata;
import record.RecordBrowser;

import java.io.IOException;
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
                .withCommands(Help.class, Record.class);

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

        @Override
        public void run() {
            RecordBrowser recordBrowser = new RecordBrowser(pathToChromedriver, pathToJSInjectionFile);
            try {
                recordBrowser.record("http://www.tenniskafe.com/");
                System.out.println("Press Enter when finished recording");
                System.in.read();
                recordBrowser.dumpActions("output.json");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            recordBrowser.quit();

            System.exit(0);
        }
    }
}
