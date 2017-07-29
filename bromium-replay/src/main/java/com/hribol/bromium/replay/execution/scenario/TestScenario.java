package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a test scenarion, which is just a list of {@link WebDriverAction} and
 * their appropriate names.
 */
public class TestScenario {
    private Queue<WebDriverAction> webDriverActionQueue;

    public TestScenario() {
        webDriverActionQueue = new LinkedList<>();
    }

    public TestScenarioActions steps() {
        return new TestScenarioActions(webDriverActionQueue);
    }
    /**
     * Adds an action to the queue
     * @param webDriverAction the action to add
     */
    public void addWebDriverAction(WebDriverAction webDriverAction) {
        webDriverActionQueue.add(webDriverAction);
    }

    /**
     * Gets a list of the names of all actions
     * @return a list of the names of all actions
     */
    public List<String> getActions() {
        return webDriverActionQueue.stream()
                .map(WebDriverAction::getName)
                .collect(Collectors.toList());
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
