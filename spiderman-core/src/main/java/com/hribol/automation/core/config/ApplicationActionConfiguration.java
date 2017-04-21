package com.hribol.automation.core.config;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ApplicationActionConfiguration {
    private String name;
    private WebdriverActionConfiguration conditionBeforeExecution;
    private WebdriverActionConfiguration webdriverAction;
    private WebdriverActionConfiguration conditionAfterExecution;
    private boolean expectsHttpRequest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebdriverActionConfiguration getConditionBeforeExecution() {
        return conditionBeforeExecution;
    }

    public void setConditionBeforeExecution(WebdriverActionConfiguration conditionBeforeExecution) {
        this.conditionBeforeExecution = conditionBeforeExecution;
    }

    public WebdriverActionConfiguration getConditionAfterExecution() {
        return conditionAfterExecution;
    }

    public void setConditionAfterExecution(WebdriverActionConfiguration conditionAfterExecution) {
        this.conditionAfterExecution = conditionAfterExecution;
    }

    public WebdriverActionConfiguration getWebdriverAction() {
        return webdriverAction;
    }

    public void setWebdriverAction(WebdriverActionConfiguration webdriverAction) {
        this.webdriverAction = webdriverAction;
    }

    public Boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    public void setExpectsHttpRequest(boolean expectsHttpRequest) {
        this.expectsHttpRequest = expectsHttpRequest;
    }
}
