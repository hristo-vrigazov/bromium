package browser.commands;

import browser.MainMenuChoice;
import com.google.common.collect.Maps;
import config.*;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import java.util.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class PromptUtils {

    private static TextIO textIO = TextIoFactory.getTextIO();

    public static TextIO getTextIO() {
        return textIO;
    }

    public static String promptForVersion() {
        return textIO
                .newStringInputReader()
                .withDefaultValue("0.0.1")
                .read("What is the version of your application?");
    }

    public static void showAssertionActionChoice(ApplicationConfiguration applicationConfiguration) {
        MainMenuChoice mainMenuChoice;
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

    public static ApplicationActionConfiguration showAddActionMenu() {
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

    public static boolean promptForExpectHttpRequest() {
        return textIO
                .newBooleanInputReader()
                .read("Expect HTTP request after the action?");
    }

    public static WebdriverActionConfiguration promptForActionConfigurationType(String prompt) {
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

    public static Map<String, ParameterConfiguration> collectParametersConfiguration(WebdriverActionType webdriverActionType) {
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

    public static ParameterConfiguration promptForParameterConfiguration(WebdriverActionType webdriverActionType) {
        return getParameterConfigurationForCustom();
    }

    public static boolean promptForAddParameters() {
        textIO.getTextTerminal().println();
        return textIO.newBooleanInputReader().read("Add a parameter?");
    }

    public static String getWebdriverAction(WebdriverActionType webdriverActionType) {
        if (webdriverActionType == WebdriverActionType.CUSTOM) {
            return textIO.newStringInputReader().read("Enter the custom type name: ");
        }

        return webdriverActionType.toString();
    }

    public static ParameterConfiguration getParameterConfigurationForCustom() {
        textIO.getTextTerminal().println();
        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setParameterName(promptForParameterName());
        return getParameterConfigurationForName(parameterConfiguration);
    }

    public static ParameterConfiguration getParameterConfigurationForName(ParameterConfiguration parameterConfiguration) {
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

    public static String promptForValue(String parameterName) {
        return textIO.newStringInputReader().read("Value of " + parameterName);
    }

    public static String promptForAlias(String parameterName) {
        return textIO.newStringInputReader().read("Alias for " + parameterName);
    }

    public static boolean promptForParameterExposing(String parameterName) {
        return textIO.newBooleanInputReader().read("Should I expose " + parameterName);
    }

    public static String promptForParameterName() {
        return textIO.newStringInputReader().read("Parameter name: ");
    }

    public static void promptForApplicationName(ApplicationConfiguration applicationConfiguration) {
        Boolean shouldEditName = shouldChangePrompt("application name", applicationConfiguration.getApplicationName());

        if (shouldEditName) {
            String newName = textIO.newStringInputReader()
                    .read("Application name: ");
            applicationConfiguration.setApplicationName(newName);
        }
    }

    public static Boolean shouldChangePrompt(String propertyToBeChanged, String defaultValue) {
        return textIO.newBooleanInputReader()
                .read("Update the " + propertyToBeChanged + " ("
                        + defaultValue
                        + ") ? ");
    }

    public static void updateApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
        List<ApplicationActionConfiguration> applicationActionConfigurations =
                applicationConfiguration.getApplicationActionConfigurationList();
        Map<String, ApplicationActionConfiguration> nameToActionMap =
                Maps.uniqueIndex
                        (applicationActionConfigurations.iterator(),
                        applicationActionConfiguration -> applicationActionConfiguration.getName());

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

    public static boolean userWantsToEditApplicationAction() {
        return textIO.newBooleanInputReader()
                .read("Edit another action?");
    }

    public static Optional<WebdriverActionConfiguration> promptForChangeAction(ApplicationActionConfiguration applicationActionConfiguration,
                                                                                String prompt) {
        boolean userWantsToChangePrecondition =
                shouldChangePrompt(prompt, applicationActionConfiguration.getConditionBeforeExecution().getWebdriverActionType());

        if (userWantsToChangePrecondition) {
            WebdriverActionConfiguration configuration = promptForActionConfigurationType(prompt + ": ");
            return Optional.of(configuration);
        }

        return Optional.empty();
    }

    public static void promptExpectsHttpRequest(ApplicationActionConfiguration applicationActionConfiguration) {
        boolean changeExpectHttp = shouldChangePrompt("expect http request",
                applicationActionConfiguration.expectsHttpRequest().toString());

        if (changeExpectHttp) {
            applicationActionConfiguration.setExpectsHttpRequest(promptForExpectHttpRequest());
        }
    }


}
