package com.hribol.spiderman.core.execution.application;

import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface ApplicationAction {
    Optional<WebDriverAction> getPrecondition();
    Optional<WebDriverAction> getWebdriverAction();
    Optional<WebDriverAction> getPostcondition();
}
