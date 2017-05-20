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

    /**
     * Adds an action to the queue
     * @param webDriverAction the action to add
     */
    public void addWebDriverAction(WebDriverAction webDriverAction) {
        webDriverActionQueue.add(webDriverAction);
        actions.add(webDriverAction.getName());
    }

    /**
     * Indicates whether the scenario has more steps
     * @return whether the scenario has more steps
     */
    public boolean hasMoreSteps() {
        return !webDriverActionQueue.isEmpty();
    }

    /**
     * Indicates whether the next action expects HTTP request after
     * it is executed.
     * @return whether the next action expects HTTP request after
     * it is executed.
     */
    public boolean nextActionExpectsHttpRequest() {
        return webDriverActionQueue.peek().expectsHttpRequest();
    }

    /**
     * Gets the name of the next action
     * @return the name of the next action
     */
    public String nextActionName() {
        return webDriverActionQueue.peek().getName();
    }

    /**
     * Polls the next webDriverAction
     * @return the next {@link WebDriverAction}
     */
    public WebDriverAction pollWebDriverAction() {
        return webDriverActionQueue.poll();
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
