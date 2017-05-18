package core.execution.application;

import core.actions.WebDriverAction;

import java.util.Optional;

/**
 * An application action by given precondition, webDriver action and
 * postcondition.
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
