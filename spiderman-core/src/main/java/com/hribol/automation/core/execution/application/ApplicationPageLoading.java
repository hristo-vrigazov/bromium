package com.hribol.automation.core.execution.application;

import com.hribol.automation.core.actions.WebDriverAction;
import com.hribol.automation.core.actions.PageLoading;

import java.util.Optional;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ApplicationPageLoading implements ApplicationAction {

    private String url;
    private String eventName;

    public ApplicationPageLoading(String url, String eventName) {
        this.url = url;
        this.eventName = eventName;
    }

    @Override
    public Optional<WebDriverAction> getPrecondition() {
        return Optional.empty();
    }

    @Override
    public Optional<WebDriverAction> getWebdriverAction() {
        return Optional.of(new PageLoading(url, eventName));
    }

    @Override
    public Optional<WebDriverAction> getPostcondition() {
        return Optional.empty();
    }
}
