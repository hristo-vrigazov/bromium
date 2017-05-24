package com.hribol.spiderman.replay.execution.scenario;

import com.hribol.spiderman.replay.actions.WebDriverAction;

import java.util.*;

/**
 * Represents a test scenarion, which is just a list of {@link WebDriverAction} and
 * their appropriate names.
 */
public class TestScenario {
    private Queue<WebDriverAction> webDriverActionQueue;
    private List<String> actions;

    public TestScenario() {
        webDriverActionQueue = new LinkedList<>();
        actions = new ArrayList<>();
    }

    public TestScenarioSteps steps() {
        return new TestScenarioSteps(webDriverActionQueue);
    }
    /**
     * Adds an action to the queue
     * @param webDriverAction the action to add
     */
    public void addWebDriverAction(WebDriverAction webDriverAction) {
        webDriverActionQueue.add(webDriverAction);
        actions.add(webDriverAction.getName());
    }

    /**
     * Gets a list of the names of all actions
     * @return a list of the names of all actions
     */
    public List<String> getActions() {
        return actions;
    }

    /**
     * Adds a precondition or postcondition of an action, represented by
     * an {@link Optional}.
     * @param webDriverActionOptional an option of the action which should be added
     *                                if present
     */
    public void addWebDriverAction(Optional<WebDriverAction> webDriverActionOptional) {
        webDriverActionOptional.ifPresent(this::addWebDriverAction);
    }

}
