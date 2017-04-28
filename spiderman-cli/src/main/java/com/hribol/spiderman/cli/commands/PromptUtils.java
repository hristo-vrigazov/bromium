package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.MainMenuChoice;
import com.hribol.spiderman.core.config.ApplicationActionConfiguration;
import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.core.config.ParameterConfiguration;
import com.hribol.spiderman.core.config.WebDriverActionConfiguration;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import javax.xml.soap.Text;
import java.util.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class PromptUtils {

    public TextIO getTextIO() {
        return textIO;
    }

    private TextIO textIO = TextIoFactory.getTextIO();

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
                    .read("Let's add another one! Choose from below");
            getTextIO().getTextTerminal().println();
            switch (mainMenuChoice) {
                case ASSERTION:
                    getTextIO().getTextTerminal().println("Let's add an assertion!");
                    break;
                case ACTION:
                    getTextIO().getTextTerminal().println("Let's add an action!");
                    applicationConfiguration.addApplicationActionConfiguration(showAddActionMenu());
                    break;
                default:
                    break;
            }
        } while (!(mainMenuChoice == MainMenuChoice.SAVE_AND_EXIT));
    }

    public ApplicationActionConfiguration showAddActionMenu() {
        String actionName = getTextIO().newStringInputReader().read("Action name: ");
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(actionName);

        WebDriverActionConfiguration preconditionConfiguration =
                promptForActionConfigurationType("Precondition: ");
        applicationActionConfiguration.setConditionBeforeExecution(preconditionConfiguration);
        getTextIO().getTextTerminal().println();

        WebDriverActionConfiguration webDriverActionConfiguration =
                promptForActionConfigurationType("Action: ");
        applicationActionConfiguration.setWebDriverAction(webDriverActionConfiguration);
        getTextIO().getTextTerminal().println();

        WebDriverActionConfiguration postconditionConfiguration =
                promptForActionConfigurationType("Postaction: ");
        applicationActionConfiguration.setConditionAfterExecution(postconditionConfiguration);
        getTextIO().getTextTerminal().println();

        boolean expectsHttpRequest = promptForExpectHttpRequest();

        applicationActionConfiguration.setExpectsHttpRequest(expectsHttpRequest);

        getTextIO().getTextTerminal().println("Done! Awesome!");
        getTextIO().getTextTerminal().println();

        return applicationActionConfiguration;
    }

    public boolean promptForExpectHttpRequest() {
        return getTextIO()
                .newBooleanInputReader()
                .read("Expect HTTP request after the action?");
    }

    public WebDriverActionConfiguration promptForActionConfigurationType(String prompt) {
        getTextIO().getTextTerminal().println(prompt);
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        String webDriverActionType = getTextIO()
                .newStringInputReader()
                .withPossibleValues("CUSTOM", "NOTHING")
                .read("Type: ");

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
        if (webdriverActionType == "CUSTOM") {
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


}
