package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.replay.actions.WebDriverAction;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by hvrigazov on 24.05.17.
 */
public class TestScenarioActions implements Iterable<WebDriverAction> {

    private Collection<WebDriverAction> webDriverActions;

    public TestScenarioActions(Collection<WebDriverAction> webDriverActions) {
        this.webDriverActions = webDriverActions;
    }

    @Override
    public Iterator<WebDriverAction> iterator() {
        return webDriverActions.iterator();
    }

}
