package com.hribol.automation.core.execution.executor;

import com.hribol.automation.core.execution.webdriver.WebDriverAction;

import java.util.*;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class TestScenario {
    private Queue<WebDriverAction> webDriverActionQueue;
    private List<String> actions;

    public TestScenario() {
        webDriverActionQueue = new LinkedList<>();
        actions = new ArrayList<>();
    }

    public void addWebDriverAction(WebDriverAction webDriverAction) {
        webDriverActionQueue.add(webDriverAction);
        actions.add(webDriverAction.getName());
    }

    public boolean hasMoreSteps() {
        return !webDriverActionQueue.isEmpty();
    }

    public boolean nextActionExpectsHttpRequest() {
        return webDriverActionQueue.peek().expectsHttpRequest();
    }

    public String nextActionName() {
        return webDriverActionQueue.peek().getName();
    }

    public WebDriverAction pollWebdriverAction() {
        return webDriverActionQueue.poll();
    }

    public List<String> getActions() {
        return actions;
    }

    public void addWebDriverAction(Optional<WebDriverAction> webDriverActionOptional) {
        webDriverActionOptional.ifPresent(this::addWebDriverAction);
    }

}
