package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.MainMenuChoice;
import com.hribol.spiderman.core.config.ApplicationActionConfiguration;
import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.core.config.ParameterConfiguration;
import com.hribol.spiderman.core.config.WebDriverActionConfiguration;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import javax.xml.soap.Text;
import java.io.IOException;
import java.util.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class PromptUtils {

    public static final String LET_S_ADD_ANOTHER_ONE_CHOOSE_FROM_BELOW = "Let's add another one! Choose from below";
    public static final String LET_S_ADD_AN_ASSERTION = "Let's add an assertion!";
    public static final String LET_S_ADD_AN_ACTION = "Let's add an action!";
    public static final String ACTION_NAME = "Action name: ";
    public static final String ASSERTION_NAME = "Assertion name: ";
    public static final String PRECONDITION = "Precondition: ";
    public static final String ACTION = "Action: ";
    public static final String POSTACTION = "Postaction: ";
    public static final String CUSTOM = "CUSTOM";
    public static final String NOTHING = "NOTHING";
    public static final String TYPE = "Type: ";
    public static final String EXPECT_HTTP_REQUEST_AFTER_THE_ACTION = "Expect HTTP request after the action?";

    public TextIO getTextIO() {
        return textIO;
    }

    public PromptUtils() {
        this.textIO = TextIoFactory.getTextIO();
    }

    private TextIO textIO;

    public String promptForVersion() {
        return getTextIO()
                .newStringInputReader()
                .withDefaultValue("0.0.1")
                .read("What is the version of your application?");
    }

    public void showAssertionActionChoice(ApplicationConfiguration applicationConfiguration) {
        MainMenuChoice mainMenuChoice;
        do {
            mainMenuChoice = getTextIO().newEnumInputReader(MainMenuChoice.class)
                    .read(LET_S_ADD_ANOTHER_ONE_CHOOSE_FROM_BELOW);
            getTextIO().getTextTerminal().println();
            switch (mainMenuChoice) {
                case ASSERTION:
                    getTextIO().getTextTerminal().println(LET_S_ADD_AN_ASSERTION);
                    applicationConfiguration.addApplicationActionConfiguration(showAddAssertionMenu());
                    break;
                case ACTION:
                    getTextIO().getTextTerminal().println(LET_S_ADD_AN_ACTION);
                    applicationConfiguration.addApplicationActionConfiguration(showAddActionMenu());
                    break;
                default:
                    break;
            }
        } while (!(mainMenuChoice == MainMenuChoice.SAVE_AND_EXIT));
    }

    public ApplicationActionConfiguration showAddBaseMenu(String prompt) {
        String actionName = getTextIO().newStringInputReader().read(prompt);
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(actionName);

        WebDriverActionConfiguration preconditionConfiguration =
                promptForActionConfigurationType(PRECONDITION);
        applicationActionConfiguration.setConditionBeforeExecution(preconditionConfiguration);
        getTextIO().getTextTerminal().println();

        WebDriverActionConfiguration webDriverActionConfiguration =
                promptForActionConfigurationType(ACTION);
        applicationActionConfiguration.setWebDriverAction(webDriverActionConfiguration);
        getTextIO().getTextTerminal().println();

        WebDriverActionConfiguration postconditionConfiguration =
                promptForActionConfigurationType(POSTACTION);
        applicationActionConfiguration.setConditionAfterExecution(postconditionConfiguration);
        getTextIO().getTextTerminal().println();

        boolean expectsHttpRequest = promptForExpectHttpRequest();

        applicationActionConfiguration.setExpectsHttpRequest(expectsHttpRequest);

        getTextIO().getTextTerminal().println("Done! Awesome!");
        getTextIO().getTextTerminal().println();

        return applicationActionConfiguration;
    }

    public ApplicationActionConfiguration showAddActionMenu() {
        return showAddBaseMenu(ACTION_NAME);
    }

    public ApplicationActionConfiguration showAddAssertionMenu() {
        return showAddBaseMenu(ASSERTION_NAME);
    }

    public boolean promptForExpectHttpRequest() {
        return getTextIO()
                .newBooleanInputReader()
                .read(EXPECT_HTTP_REQUEST_AFTER_THE_ACTION);
    }

    public WebDriverActionConfiguration promptForActionConfigurationType(String prompt) {
        getTextIO().getTextTerminal().println(prompt);
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        String webDriverActionType = getTextIO()
                .newStringInputReader()
                .withPossibleValues(CUSTOM, NOTHING)
                .read(TYPE);

        String webDriverAction = getWebDriverAction(webDriverActionType);

        Map<String, ParameterConfiguration> parameterConfigurations =
                collectParametersConfiguration(webDriverActionType);
        webDriverActionConfiguration.setParametersConfiguration(parameterConfigurations);
        webDriverActionConfiguration.setWebDriverActionType(webDriverAction);

        return webDriverActionConfiguration;
    }

    public Map<String, ParameterConfiguration> collectParametersConfiguration(String webDriverActionType) {
        if (Objects.equals(webDriverActionType, "NOTHING")) {
            return new HashMap<>();
        }

        Map<String, ParameterConfiguration> parametersConfiguration = new HashMap<>();

        while (promptForAddParameters()) {
            ParameterConfiguration parameterConfiguration = promptForParameterConfiguration();
            parametersConfiguration.put(parameterConfiguration.getParameterName(), parameterConfiguration);
        }

        return parametersConfiguration;
    }

    public ParameterConfiguration promptForParameterConfiguration() {
        return getParameterConfigurationForCustom();
    }

    public boolean promptForAddParameters() {
        getTextIO().getTextTerminal().println();
        return getTextIO().newBooleanInputReader().read("Add a parameter?");
    }

    public String getWebDriverAction(String webdriverActionType) {
        if (webdriverActionType.equals(CUSTOM)) {
            return getTextIO().newStringInputReader().read("Enter the custom type name: ");
        }

        return webdriverActionType;
    }

    public ParameterConfiguration getParameterConfigurationForCustom() {
        getTextIO().getTextTerminal().println();
        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setParameterName(promptForParameterName());
        return getParameterConfigurationForName(parameterConfiguration);
    }

    public ParameterConfiguration getParameterConfigurationForName(ParameterConfiguration parameterConfiguration) {
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

    public String promptForValue(String parameterName) {
        return getTextIO().newStringInputReader().read("Value of " + parameterName);
    }

    public String promptForAlias(String parameterName) {
        return getTextIO().newStringInputReader().read("Alias for " + parameterName);
    }

    public boolean promptForParameterExposing(String parameterName) {
        return getTextIO().newBooleanInputReader().read("Should I expose " + parameterName);
    }

    public String promptForParameterName() {
        return getTextIO().newStringInputReader().read("Parameter name: ");
    }

    public void promptForApplicationName(ApplicationConfiguration applicationConfiguration) {
        Boolean shouldEditName = shouldChangePrompt("application name", applicationConfiguration.getApplicationName());

        if (shouldEditName) {
            String newName = getTextIO().newStringInputReader()
                    .read("Application name: ");
            applicationConfiguration.setApplicationName(newName);
        }
    }

    public Boolean shouldChangePrompt(String propertyToBeChanged, String defaultValue) {
        return getTextIO().newBooleanInputReader()
                .read("Update the " + propertyToBeChanged + " ("
                        + defaultValue
                        + ") ? ");
    }

    public void updateApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
        List<ApplicationActionConfiguration> applicationActionConfigurations =
                applicationConfiguration.getApplicationActionConfigurationList();
        Map<String, ApplicationActionConfiguration> nameToActionMap = new HashMap<>();
        for (ApplicationActionConfiguration applicationActionConfiguration: applicationActionConfigurations) {
            nameToActionMap.put(applicationActionConfiguration.getName(), applicationActionConfiguration);
        }

        do {
            String choice = getTextIO().newStringInputReader()
                    .withPossibleValues(new ArrayList<>(nameToActionMap.keySet()))
                    .read("Select action: ");

            ApplicationActionConfiguration applicationActionConfiguration = nameToActionMap.get(choice);
            promptExpectsHttpRequest(applicationActionConfiguration);

            Optional<WebDriverActionConfiguration> optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "precondition");
            if (optionalConfiguration.isPresent()) {
                applicationActionConfiguration.setConditionBeforeExecution(optionalConfiguration.get());
            }

            optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "action");
            if (optionalConfiguration.isPresent()) {
                applicationActionConfiguration.setWebDriverAction(optionalConfiguration.get());
            }

            optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "postcondition");
            if (optionalConfiguration.isPresent()) {
                applicationActionConfiguration.setConditionAfterExecution(optionalConfiguration.get());
            }

        } while (userWantsToEditApplicationAction());
    }

    public boolean userWantsToEditApplicationAction() {
        return getTextIO().newBooleanInputReader()
                .read("Edit another action?");
    }

    public Optional<WebDriverActionConfiguration> promptForChangeAction(ApplicationActionConfiguration applicationActionConfiguration,
                                                                        String prompt) {
        boolean userWantsToChangePrecondition =
                shouldChangePrompt(prompt, applicationActionConfiguration.getConditionBeforeExecution().getWebDriverActionType());

        if (userWantsToChangePrecondition) {
            WebDriverActionConfiguration configuration = promptForActionConfigurationType(prompt + ": ");
            return Optional.of(configuration);
        }

        return Optional.empty();
    }

    public void promptExpectsHttpRequest(ApplicationActionConfiguration applicationActionConfiguration) {
        boolean changeExpectHttp = shouldChangePrompt("expect http request",
                applicationActionConfiguration.expectsHttpRequest().toString());

        if (changeExpectHttp) {
            applicationActionConfiguration.setExpectsHttpRequest(promptForExpectHttpRequest());
        }
    }

    public void promptForRecording() throws IOException {
        System.out.println("Press Enter when finished recording");
        System.in.read();
    }


}
