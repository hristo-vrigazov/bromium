package com.hribol.automation.core.actions;

import com.hribol.automation.core.execution.application.ApplicationAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ConvertedApplicationAction implements ApplicationAction {
    private Optional<WebDriverAction> precondition;
    private Optional<WebDriverAction> webdriverAction;
    private Optional<WebDriverAction> postcondition;

    public ConvertedApplicationAction(Optional<WebDriverAction> precondition,
                                       Optional<WebDriverAction> webdriverAction,
                                       Optional<WebDriverAction> postcondition) {
        this.precondition = precondition;
        this.webdriverAction = webdriverAction;
        this.postcondition = postcondition;
    }

    @Override
    public Optional<WebDriverAction> getPrecondition() {
        return precondition;
    }

    @Override
    public Optional<WebDriverAction> getWebdriverAction() {
        return webdriverAction;
    }

    @Override
    public Optional<WebDriverAction> getPostcondition() {
        return postcondition;
    }
}
