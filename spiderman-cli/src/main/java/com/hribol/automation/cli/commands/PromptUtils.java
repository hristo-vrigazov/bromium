package com.hribol.automation.cli.commands;

import com.hribol.automation.cli.MainMenuChoice;
import com.hribol.automation.core.config.*;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import java.util.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class PromptUtils {

    private TextIO textIO = TextIoFactory.getTextIO();

    public TextIO getTextIO() {
        return textIO;
    }

    public String promptForVersion() {
        return textIO
                .newStringInputReader()
                .withDefaultValue("0.0.1")
                .read("What is the version of your application?");
    }

    public void showAssertionActionChoice(ApplicationConfiguration applicationConfiguration) {
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

    public ApplicationActionConfiguration showAddActionMenu() {
        String actionName = textIO.newStringInputReader().read("Action name: ");
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(actionName);

        WebDriverActionConfiguration preconditionConfiguration =
                promptForActionConfigurationType("Precondition: ");
        applicationActionConfiguration.setConditionBeforeExecution(preconditionConfiguration);
        textIO.getTextTerminal().println();

        WebDriverActionConfiguration webDriverActionConfiguration =
                promptForActionConfigurationType("Action: ");
        applicationActionConfiguration.setWebdriverAction(webDriverActionConfiguration);
        textIO.getTextTerminal().println();

        WebDriverActionConfiguration postconditionConfiguration =
                promptForActionConfigurationType("Postaction: ");
        applicationActionConfiguration.setConditionAfterExecution(postconditionConfiguration);
        textIO.getTextTerminal().println();

        boolean expectsHttpRequest = promptForExpectHttpRequest();

        applicationActionConfiguration.setExpectsHttpRequest(expectsHttpRequest);

        textIO.getTextTerminal().println("Done! Awesome!");
        textIO.getTextTerminal().println();

        return applicationActionConfiguration;
    }

    public boolean promptForExpectHttpRequest() {
        return textIO
                .newBooleanInputReader()
                .read("Expect HTTP request after the action?");
    }

    public WebDriverActionConfiguration promptForActionConfigurationType(String prompt) {
        textIO.getTextTerminal().println(prompt);
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        WebdriverActionType webdriverActionType = textIO
                .newEnumInputReader(WebdriverActionType.class)
                .read("Type: ");

        String webdriverAction = getWebdriverAction(webdriverActionType);

        Map<String, ParameterConfiguration> parameterConfigurations =
                collectParametersConfiguration(webdriverActionType);
        webDriverActionConfiguration.setParametersConfiguration(parameterConfigurations);
        webDriverActionConfiguration.setWebDriverActionType(webdriverAction);

        return webDriverActionConfiguration;
    }

    public Map<String, ParameterConfiguration> collectParametersConfiguration(WebdriverActionType webdriverActionType) {
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

    public ParameterConfiguration promptForParameterConfiguration(WebdriverActionType webdriverActionType) {
        return getParameterConfigurationForCustom();
    }

    public boolean promptForAddParameters() {
        textIO.getTextTerminal().println();
        return textIO.newBooleanInputReader().read("Add a parameter?");
    }

    public String getWebdriverAction(WebdriverActionType webdriverActionType) {
        if (webdriverActionType == WebdriverActionType.CUSTOM) {
            return textIO.newStringInputReader().read("Enter the custom type name: ");
        }

        return webdriverActionType.toString();
    }

    public ParameterConfiguration getParameterConfigurationForCustom() {
        textIO.getTextTerminal().println();
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
        return textIO.newStringInputReader().read("Value of " + parameterName);
    }

    public String promptForAlias(String parameterName) {
        return textIO.newStringInputReader().read("Alias for " + parameterName);
    }

    public boolean promptForParameterExposing(String parameterName) {
        return textIO.newBooleanInputReader().read("Should I expose " + parameterName);
    }

    public String promptForParameterName() {
        return textIO.newStringInputReader().read("Parameter name: ");
    }

    public void promptForApplicationName(ApplicationConfiguration applicationConfiguration) {
        Boolean shouldEditName = shouldChangePrompt("application name", applicationConfiguration.getApplicationName());

        if (shouldEditName) {
            String newName = textIO.newStringInputReader()
                    .read("Application name: ");
            applicationConfiguration.setApplicationName(newName);
        }
    }

    public Boolean shouldChangePrompt(String propertyToBeChanged, String defaultValue) {
        return textIO.newBooleanInputReader()
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
            String choice = textIO.newStringInputReader()
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
                applicationActionConfiguration.setWebdriverAction(optionalConfiguration.get());
            }

            optionalConfiguration = promptForChangeAction(applicationActionConfiguration, "postcondition");
            if (optionalConfiguration.isPresent()) {
                applicationActionConfiguration.setConditionAfterExecution(optionalConfiguration.get());
            }

        } while (userWantsToEditApplicationAction());
    }

    public boolean userWantsToEditApplicationAction() {
        return textIO.newBooleanInputReader()
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


}
