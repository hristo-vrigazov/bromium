package browser;

import io.airlift.airline.Cli;
import io.airlift.airline.Command;
import io.airlift.airline.Help;
import io.airlift.airline.Option;
import record.RecordBrowser;

import java.io.IOException;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("bot")
                .withDescription("Selenium record and replay bot for applications")
                .withDefaultCommand(Help.class)
                .withCommands(Help.class, Record.class);

        Cli<Runnable> gitParser = builder.build();
        gitParser.parse(args).run();
    }

    @Command(name = "record", description = "Opens up the browser and listens for application specific events")
    public static class Record implements Runnable {

        @Option(name = "-d", description = "Path to chrome driver executable", required = true)
        public String pathToChromedriver;

        @Override
        public void run() {
            RecordBrowser recordBrowser = new RecordBrowser(pathToChromedriver);
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
