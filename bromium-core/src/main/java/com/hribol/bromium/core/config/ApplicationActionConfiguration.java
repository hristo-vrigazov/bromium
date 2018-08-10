package com.hribol.bromium.core.config;

import com.hribol.bromium.core.generation.GenerationInformation;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * A configuration of an action, which is usually contained
 * in the application configuration file. It is used
 * for serialization / deserialization
 */
public class ApplicationActionConfiguration implements GenerationInformation {
    private String name;
    private WebDriverActionConfiguration conditionBeforeExecution;
    private ContextProvider contextProvider;
    private WebDriverActionConfiguration webDriverAction;
    private WebDriverActionConfiguration conditionAfterExecution;
    private boolean expectsHttpRequest;

    public void setSyntaxDefinitionConfigurationList(List<SyntaxDefinitionConfiguration> syntaxDefinitionConfigurationList) {
        this.syntaxDefinitionConfigurationList = syntaxDefinitionConfigurationList;
    }

    private List<SyntaxDefinitionConfiguration> syntaxDefinitionConfigurationList;

    public ApplicationActionConfiguration() {
        this.syntaxDefinitionConfigurationList = new ArrayList<>();
    }

    /**
     * @return the name of the application action
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the application action
     * @param name the new name of the application
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The configuration of the application action which has to be fulfilled
     * before executing the action
     * @return the configuration of the precondition
     */
    public WebDriverActionConfiguration getConditionBeforeExecution() {
        return conditionBeforeExecution;
    }

    /**
     * Set the configuration of the precondition to the given parameter
     * @param conditionBeforeExecution - the new precondition configuration
     */
    public void setConditionBeforeExecution(WebDriverActionConfiguration conditionBeforeExecution) {
        this.conditionBeforeExecution = conditionBeforeExecution;
    }

    /**
     * The configuration of the application action which has to be fulfilled
     * after executing the action
     * @return the configuration of the postcondition
     */
    public WebDriverActionConfiguration getConditionAfterExecution() {
        return conditionAfterExecution;
    }

    /**
     * Set the configuration of the postcondition to the given parameter
     * @param conditionAfterExecution - the new postcondition configuration
     */
    public void setConditionAfterExecution(WebDriverActionConfiguration conditionAfterExecution) {
        this.conditionAfterExecution = conditionAfterExecution;
    }

    /**
     * Get the configuration of the selenium action to be executed
     * @return the configuration of the selenium action to be executed
     */
    public WebDriverActionConfiguration getWebDriverAction() {
        return webDriverAction;
    }

    /**
     * Set the configuration of the action
     * @param webDriverAction - the new action configuration
     */
    public void setWebDriverAction(WebDriverActionConfiguration webDriverAction) {
        this.webDriverAction = webDriverAction;
    }

    /**
     * Indicates whether execution should be locked after the action is executed
     * @return true if should be locked; else false
     */
    public Boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    /**
     * Sets whether execution should be locked after the action is executed
     * @param expectsHttpRequest new value
     */
    public void setExpectsHttpRequest(boolean expectsHttpRequest) {
        this.expectsHttpRequest = expectsHttpRequest;
    }

    /**
     * Gets a list of syntax definition configurations
     * @return a list of syntax definition configurations
     */
    public List<SyntaxDefinitionConfiguration> getSyntaxDefinitionConfigurationList() {
        return syntaxDefinitionConfigurationList;
    }

    /**
     * Adds a given syntax definition to the configuration
     * @param syntaxDefinitionConfiguration the configuration to be added
     */
    public void addSyntaxDefinition(SyntaxDefinitionConfiguration syntaxDefinitionConfiguration) {
       syntaxDefinitionConfigurationList.add(syntaxDefinitionConfiguration);
    }

    public ContextProvider getContextProvider() {
        return contextProvider;
    }

    public void setContextProvider(ContextProvider contextProvider) {
        this.contextProvider = contextProvider;
    }
}
