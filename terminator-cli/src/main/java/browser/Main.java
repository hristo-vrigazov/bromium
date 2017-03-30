package browser;

import com.google.common.collect.Maps;
import config.*;
import execution.executor.WebDriverActionExecutor;
import execution.executor.WebdriverActionExecutorBuilder;
import execution.webdriver.PredefinedWebdriverActionFactory;
import io.airlift.airline.*;
import io.airlift.airline.model.CommandMetadata;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import record.ChromeRecordBrowser;
import record.RecordBrowserBase;
import replay.ReplayBrowser;
import replay.ReplayBrowserConfiguration;
import utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("bot")
                .withDescription("Selenium record and replay bot for applications")
                .withDefaultCommand(Help.class)
                .withCommands(Help.class);

        builder
                .withGroup("test")
                .withDescription("Commands related to test cases - record, replay, etc.")
                .withDefaultCommand(Record.class)
                .withCommands(Record.class, Replay.class);

        builder
                .withGroup("app")
                .withDescription("Commands related to application - creating configuration, " +
                        "updating configuration, adding a new version")
                .withDefaultCommand(Init.class)
                .withCommands(Init.class, Update.class);

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

    static TextIO textIO;


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
            RecordBrowserBase recordBrowserBase = new ChromeRecordBrowser(pathToChromedriver, pathToJSInjectionFile);
            try {
                recordBrowserBase.record(baseUrl);
                System.out.println("Press Enter when finished recording");
                System.in.read();
                recordBrowserBase.dumpActions(outputFile);
            } catch (IOException | InterruptedException | URISyntaxException e) {
                e.printStackTrace();
            }

            recordBrowserBase.cleanUp();

            System.exit(0);
        }
    }

    @Command(name = "replay", description = "Replays a test case")
    public static class Replay implements Runnable {

        @Option(name = "-d", description = "Path to chrome driver executable", required = true)
        public String pathToChromedriver;

        @Option(name = "-c", description = "Path to application configuration", required = true)
        public String pathToApplicationConfiguration;

        @Option(name = "-t", description = "Path to serialized test", required = true)
        public String pathToSerializedTest;

        @Override
        public void run() {
            try {
                WebDriverActionExecutor executor = new WebdriverActionExecutorBuilder()
                        .pathToDriverExecutable(pathToChromedriver)
                        .baseURI("http://www.tenniskafe.com/")
                        .buildChromedriver();

                ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                        .builder()
                        .pathToApplicationConfiguration(pathToApplicationConfiguration)
                        .url("http://www.tenniskafe.com/")
                        .webdriverActionFactory(new PredefinedWebdriverActionFactory())
                        .executor(executor)
                        .build();

                ReplayBrowser replayBrowser = replayBrowserConfiguration.getReplayBrowser();
                replayBrowser.replay(pathToSerializedTest);
                replayBrowser.dumpAllMetrics("metrics.har", "metrics.csv");
            } catch (IOException | InterruptedException | URISyntaxException e) {
                e.printStackTrace();
            }

            System.exit(0);
        }
    }

    @Command(name = "init", description = "Guides you through creating an automation layer for your application!")
    public static class Init implements Runnable {

        MainMenuChoice mainMenuChoice;
        ApplicationConfiguration applicationConfiguration;

        @Override
        public void run() {
            textIO = TextIoFactory.getTextIO();
            textIO.getTextTerminal().println("Welcome! I will guide you through creating an automation layer for you application");
            applicationConfiguration = new ApplicationConfiguration();

            textIO.getTextTerminal().println();
            applicationConfiguration.setApplicationName(textIO
                    .newStringInputReader()
                    .read("What is the name of your application?"));

            applicationConfiguration.setVersion(textIO
                    .newStringInputReader()
                    .withDefaultValue("0.0.1")
                    .read("What is the version of your application?"));

            textIO.getTextTerminal().println();
            textIO.getTextTerminal().println("Let's now define some actions and assertions!");
            textIO.getTextTerminal().println();
            textIO.getTextTerminal().println("The initial page loading is added by default");

            showAssertionActionChoice();

            try {
                String outputFilename = textIO
                        .newStringInputReader()
                        .read("Where should I save the configuration");
                Utils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.exit(0);
        }

        private void showAssertionActionChoice() {
            do {
                mainMenuChoice = textIO.newEnumInputReader(MainMenuChoice.class)
                        .read("Let's add another one! Choose from below");
                textIO.getTextTerminal().println();
                switch (mainMenuChoice) {
                    case ASSERTION:
                        textIO.getTextTerminal().println("Let's add an assertion!");
                        break;
                    case ACTION:
                        textIO.getTextTerminal().println("Let's add an action!");
                        applicationConfiguration.addApplicationActionConfiguration(showAddActionMenu());
                        break;
                    default:
                        break;
                }
            } while (!(mainMenuChoice == MainMenuChoice.SAVE_AND_EXIT));
        }

    }

    @Command(name = "update", description = "Update existing application configuration")
    public static class Update implements Runnable {

        @Option(name = "-c", description = "Path to application configuration", required = true)
        public String pathToApplicationConfiguration;

        @Override
        public void run() {
            try {
                ApplicationConfiguration applicationConfiguration = Utils.parseApplicationConfiguration(pathToApplicationConfiguration);
                textIO = TextIoFactory.getTextIO();
                textIO.getTextTerminal().println("Let's update the configuration!");

                updateApplicationConfiguration(applicationConfiguration);
                
                String outputFilename = textIO
                        .newStringInputReader()
                        .read("Where should I save the configuration");
                Utils.dumpApplicationConfiguration(applicationConfiguration, outputFilename);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void updateApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
            promptForApplicationName(applicationConfiguration);

            List<ApplicationActionConfiguration> applicationActionConfigurations =
                    applicationConfiguration.getApplicationActionConfigurationList();
            Map<String, ApplicationActionConfiguration> nameToActionMap =
                    Maps.uniqueIndex(applicationActionConfigurations, ApplicationActionConfiguration::getName);

            do {
                String choice = textIO.newStringInputReader()
                        .withPossibleValues(new ArrayList<>(nameToActionMap.keySet()))
                        .read("Select action: ");

                ApplicationActionConfiguration applicationActionConfiguration = nameToActionMap.get(choice);
                promptExpectsHttpRequest(applicationActionConfiguration);

                Optional<WebdriverActionConfiguration> optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "precondition");
                if (optionalConfiguration.isPresent()) {
                    applicationActionConfiguration.setConditionBeforeExecution(optionalConfiguration.get());
                }

                optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "action");
                if (optionalConfiguration.isPresent()) {
                    applicationActionConfiguration.setWebdriverAction(optionalConfiguration.get());
                }

                optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "postcondition");
                if (optionalConfiguration.isPresent()) {
                    applicationActionConfiguration.setConditionAfterExecution(optionalConfiguration.get());
                }

            } while (userWantsToEditApplicationAction());
        }

        private Optional<WebdriverActionConfiguration> promptForChangeAction(ApplicationActionConfiguration applicationActionConfiguration,
                                               String prompt) {
            boolean userWantsToChangePrecondition =
                    shouldChangePrompt(prompt, applicationActionConfiguration.getConditionBeforeExecution().getWebdriverActionType());

            if (userWantsToChangePrecondition) {
                WebdriverActionConfiguration configuration = promptForActionConfigurationType(prompt + ": ");
                return Optional.of(configuration);
            }

            return Optional.empty();
        }

        private void promptExpectsHttpRequest(ApplicationActionConfiguration applicationActionConfiguration) {
            boolean changeExpectHttp = shouldChangePrompt("expect http request",
                    applicationActionConfiguration.expectsHttpRequest().toString());

            if (changeExpectHttp) {
                applicationActionConfiguration.setExpectsHttpRequest(promptForExpectHttpRequest());
            }
        }

        private boolean userWantsToEditApplicationAction() {
            return textIO.newBooleanInputReader()
                    .read("Edit another action?");
        }

        private void promptForApplicationName(ApplicationConfiguration applicationConfiguration) {
            Boolean shouldEditName = shouldChangePrompt("application name", applicationConfiguration.getApplicationName());

            if (shouldEditName) {
                String newName = textIO.newStringInputReader()
                        .read("Application name: ");
                applicationConfiguration.setApplicationName(newName);
            }
        }

        private Boolean shouldChangePrompt(String propertyToBeChanged, String defaultValue) {
            return textIO.newBooleanInputReader()
                    .read("Update the " + propertyToBeChanged + " ("
                            + defaultValue
                            + ") ? ");
        }
    }

    private static ApplicationActionConfiguration showAddActionMenu() {
        String actionName = textIO.newStringInputReader().read("Action name: ");
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(actionName);

        WebdriverActionConfiguration preconditionConfiguration =
                promptForActionConfigurationType("Precondition: ");
        applicationActionConfiguration.setConditionBeforeExecution(preconditionConfiguration);
        textIO.getTextTerminal().println();

        WebdriverActionConfiguration webdriverActionConfiguration =
                promptForActionConfigurationType("Action: ");
        applicationActionConfiguration.setWebdriverAction(webdriverActionConfiguration);
        textIO.getTextTerminal().println();

        WebdriverActionConfiguration postconditionConfiguration =
                promptForActionConfigurationType("Postaction: ");
        applicationActionConfiguration.setConditionAfterExecution(postconditionConfiguration);
        textIO.getTextTerminal().println();

        boolean expectsHttpRequest = promptForExpectHttpRequest();

        applicationActionConfiguration.setExpectsHttpRequest(expectsHttpRequest);

        textIO.getTextTerminal().println("Done! Awesome!");
        textIO.getTextTerminal().println();

        return applicationActionConfiguration;
    }

    private static Boolean promptForExpectHttpRequest() {
        return textIO
                .newBooleanInputReader()
                .read("Expect HTTP request after the action?");
    }

    private static WebdriverActionConfiguration promptForActionConfigurationType(String prompt) {
        textIO.getTextTerminal().println(prompt);
        WebdriverActionConfiguration webdriverActionConfiguration = new WebdriverActionConfiguration();
        WebdriverActionType webdriverActionType = textIO
                .newEnumInputReader(WebdriverActionType.class)
                .read("Type: ");

        String webdriverAction = getWebdriverAction(webdriverActionType);

        Map<String, ParameterConfiguration> parameterConfigurations =
                collectParametersConfiguration(webdriverActionType);
        webdriverActionConfiguration.setParametersConfiguration(parameterConfigurations);
        webdriverActionConfiguration.setWebdriverActionType(webdriverAction);

        return webdriverActionConfiguration;
    }

    private static String getWebdriverAction(WebdriverActionType webdriverActionType) {
        if (webdriverActionType == WebdriverActionType.CUSTOM) {
            return textIO.newStringInputReader().read("Enter the custom type name: ");
        }

        return webdriverActionType.toString();
    }

    private static Map<String, ParameterConfiguration> collectParametersConfiguration(WebdriverActionType webdriverActionType) {
        if (webdriverActionType == WebdriverActionType.NOTHING) {
            return new HashMap<>();
        }

        Map<String, ParameterConfiguration> parametersConfiguration = new HashMap<>();

        while (promptForAddParameters()) {
            ParameterConfiguration parameterConfiguration = promptForParameterConfiguration(webdriverActionType);
            parametersConfiguration.put(parameterConfiguration.getParameterName(), parameterConfiguration);
        }

        return parametersConfiguration;
    }

    private static ParameterConfiguration promptForParameterConfiguration(WebdriverActionType webdriverActionType) {
        return getParameterConfigurationForCustom();
    }

    private static ParameterConfiguration getParameterConfigurationForCustom() {
        textIO.getTextTerminal().println();
        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setParameterName(promptForParameterName());
        return getParameterConfigurationForName(parameterConfiguration);
    }

    private static ParameterConfiguration getParameterConfigurationForName(ParameterConfiguration parameterConfiguration) {
        parameterConfiguration.setExpose(
                promptForParameterExposing(parameterConfiguration.getParameterName()));

        if (parameterConfiguration.isExposed()) {
            parameterConfiguration.setAlias(
                    promptForAlias(parameterConfiguration.getParameterName()));
            return parameterConfiguration;
        }

        parameterConfiguration.setValue(promptForValue(parameterConfiguration.getParameterName()));
        return parameterConfiguration;
    }

    private static String promptForValue(String parameterName) {
        return textIO.newStringInputReader().read("Value of " + parameterName);
    }

    private static String promptForAlias(String parameterName) {
        return textIO.newStringInputReader().read("Alias for " + parameterName);
    }

    private static boolean promptForAddParameters() {
        textIO.getTextTerminal().println();
        return textIO.newBooleanInputReader().read("Add a parameter?");
    }

    private static String promptForParameterName() {
        return textIO.newStringInputReader().read("Parameter name: ");
    }

    private static boolean promptForParameterExposing(String parameterName) {
        return textIO.newBooleanInputReader().read("Should I expose " + parameterName);
    }

}
