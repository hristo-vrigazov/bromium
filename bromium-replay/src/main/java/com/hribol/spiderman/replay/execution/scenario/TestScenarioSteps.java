package com.hribol.spiderman.replay.execution.scenario;

import com.hribol.spiderman.replay.actions.WebDriverAction;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by hvrigazov on 24.05.17.
 */
public class TestScenarioSteps implements Iterable<WebDriverAction> {

    private Collection<WebDriverAction> webDriverActions;

    public TestScenarioSteps(Collection<WebDriverAction> webDriverActions) {
        this.webDriverActions = webDriverActions;
    }

    @Override
    public Iterator<WebDriverAction> iterator() {
        return webDriverActions.iterator();
    }

}
