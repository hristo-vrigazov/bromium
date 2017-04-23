package com.hribol.spiderman.core.config;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ApplicationActionConfiguration {
    private String name;
    private WebDriverActionConfiguration conditionBeforeExecution;
    private WebDriverActionConfiguration webDriverAction;
    private WebDriverActionConfiguration conditionAfterExecution;
    private boolean expectsHttpRequest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebDriverActionConfiguration getConditionBeforeExecution() {
        return conditionBeforeExecution;
    }

    public void setConditionBeforeExecution(WebDriverActionConfiguration conditionBeforeExecution) {
        this.conditionBeforeExecution = conditionBeforeExecution;
    }

    public WebDriverActionConfiguration getConditionAfterExecution() {
        return conditionAfterExecution;
    }

    public void setConditionAfterExecution(WebDriverActionConfiguration conditionAfterExecution) {
        this.conditionAfterExecution = conditionAfterExecution;
    }

    public WebDriverActionConfiguration getWebDriverAction() {
        return webDriverAction;
    }

    public void setWebDriverAction(WebDriverActionConfiguration webDriverAction) {
        this.webDriverAction = webDriverAction;
    }

    public Boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    public void setExpectsHttpRequest(boolean expectsHttpRequest) {
        this.expectsHttpRequest = expectsHttpRequest;
    }
}
