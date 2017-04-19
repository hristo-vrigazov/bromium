package com.hribol.automation.execution.application;

import com.hribol.automation.execution.webdriver.WebdriverAction;
import com.hribol.automation.actions.PageLoading;

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
    public Optional<WebdriverAction> getPrecondition() {
        return Optional.empty();
    }

    @Override
    public Optional<WebdriverAction> getWebdriverAction() {
        return Optional.of(new PageLoading(url, eventName));
    }

    @Override
    public Optional<WebdriverAction> getPostcondition() {
        return Optional.empty();
    }
}
