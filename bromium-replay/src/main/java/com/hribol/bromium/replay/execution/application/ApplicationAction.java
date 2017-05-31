package com.hribol.bromium.replay.execution.application;

import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Optional;

/**
 * An action specific for an application, which consists of precondition,
 * webdriver action and a postcondition.
 */
public interface ApplicationAction {
    Optional<WebDriverAction> getPrecondition();
    Optional<WebDriverAction> getWebdriverAction();
    Optional<WebDriverAction> getPostcondition();
}
