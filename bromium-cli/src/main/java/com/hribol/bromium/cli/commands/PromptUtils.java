package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.MainMenuChoice;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

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
    public static final String ADD_A_PARAMETER = "Add a parameter?";
    public static final String PARAMETER_NAME = "Parameter name: ";
    public static final String SHOULD_I_EXPOSE = "Should I expose ";
    public static final String VALUE_OF = "Value of ";
    public static final String PRESS_ANY_KEY_WHEN_FINISHED_RECORDING = "Press any key when finished recording";
    public static final String ALIAS_FOR = "Alias for ";
    public static final String EXPECT_HTTP_REQUEST = "expect http request";
    public static final String UPDATE_THE = "Update the ";
    public static final String OPENING_BRACKET = " (";
    public static final String CLOSING_BRACKET = ") ? ";
    public static final String SELECT_ACTION = "Select action: ";
    public static final String PRECONDITION_WORD = "precondition";
    public static final String ACTION_WORD = "action";
    public static final String POSTCONDITION_WORD = "postcondition";
    public static final String EDIT_ANOTHER_ACTION = "Edit another action?";


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
                .read(TYPE);

        Map<String, ParameterConfiguration> parameterConfigurations =
                collectParametersConfiguration(webDriverActionType);
        webDriverActionConfiguration.setParametersConfiguration(parameterConfigurations);
        webDriverActionConfiguration.setWebDriverActionType(webDriverActionType);

        return webDriverActionConfiguration;
    }

    public Map<String, ParameterConfiguration> collectParametersConfiguration(String webDriverActionType) {
        if (Objects.equals(webDriverActionType, NOTHING)) {
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
        return getTextIO().newBooleanInputReader().read(ADD_A_PARAMETER);
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
        return getTextIO().newStringInputReader().read(VALUE_OF + parameterName);
    }

    public String promptForAlias(String parameterName) {
        return getTextIO().newStringInputReader().read(ALIAS_FOR + parameterName);
    }

    public boolean promptForParameterExposing(String parameterName) {
        return getTextIO().newBooleanInputReader().read(SHOULD_I_EXPOSE + parameterName);
    }

    public String promptForParameterName() {
        return getTextIO().newStringInputReader().read(PARAMETER_NAME);
    }

    public Boolean shouldChangePrompt(String propertyToBeChanged, String defaultValue) {
        return getTextIO().newBooleanInputReader()
                .read(UPDATE_THE + propertyToBeChanged + OPENING_BRACKET + defaultValue + CLOSING_BRACKET);
    }

    public void updateApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
        List<ApplicationActionConfiguration> applicationActionConfigurations =
                applicationConfiguration.getApplicationActionConfigurationList();
        Map<String, ApplicationActionConfiguration> nameToActionMap = new HashMap<>();
        for (ApplicationActionConfiguration applicationActionConfiguration: applicationActionConfigurations) {
            nameToActionMap.put(applicationActionConfiguration.getName(), applicationActionConfiguration);
        }

        do {
            String choice = getTextIO()
                    .newStringInputReader()
                    .withPossibleValues(new ArrayList<>(nameToActionMap.keySet()))
                    .read(SELECT_ACTION);

            ApplicationActionConfiguration applicationActionConfiguration = nameToActionMap.get(choice);
            promptExpectsHttpRequest(applicationActionConfiguration);

            WebDriverActionConfiguration preconditionConfiguration = applicationActionConfiguration.getConditionBeforeExecution();
            preconditionConfiguration = promptForChangeAction(preconditionConfiguration, PRECONDITION_WORD);
            applicationActionConfiguration.setConditionBeforeExecution(preconditionConfiguration);

            WebDriverActionConfiguration actionConfiguration = applicationActionConfiguration.getWebDriverAction();
            actionConfiguration = promptForChangeAction(actionConfiguration, ACTION_WORD);
            applicationActionConfiguration.setWebDriverAction(actionConfiguration);

            WebDriverActionConfiguration postconditionConfiguration = applicationActionConfiguration.getConditionAfterExecution();
            postconditionConfiguration = promptForChangeAction(postconditionConfiguration, POSTCONDITION_WORD);
            applicationActionConfiguration.setConditionBeforeExecution(postconditionConfiguration);

        } while (userWantsToEditApplicationAction());
    }

    public boolean userWantsToEditApplicationAction() {
        return getTextIO().newBooleanInputReader()
                .read(EDIT_ANOTHER_ACTION);
    }

    public WebDriverActionConfiguration promptForChangeAction(WebDriverActionConfiguration webDriverActionConfiguration,
                                                                        String prompt) {
        boolean userWantsToChangeAction = shouldChangePrompt(prompt, Boolean.FALSE.toString());

        if (userWantsToChangeAction) {
            return promptForActionConfigurationType(prompt + ": ");
        }

        return webDriverActionConfiguration;
    }

    public void promptExpectsHttpRequest(ApplicationActionConfiguration applicationActionConfiguration) {
        boolean changeExpectHttp = shouldChangePrompt(EXPECT_HTTP_REQUEST,
                applicationActionConfiguration.expectsHttpRequest().toString());

        if (changeExpectHttp) {
            applicationActionConfiguration.setExpectsHttpRequest(promptForExpectHttpRequest());
        }
    }

    public void promptForRecording() {
        textIO.newCharInputReader().read(PRESS_ANY_KEY_WHEN_FINISHED_RECORDING);
        textIO.dispose();
    }


}
