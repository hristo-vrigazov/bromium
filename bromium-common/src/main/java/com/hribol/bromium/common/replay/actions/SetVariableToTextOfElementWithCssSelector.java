package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.WebDriverActions.SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR;

public class SetVariableToTextOfElementWithCssSelector implements WebDriverAction {
    private final String variable;
    private final String selector;
    private final int step;

    public SetVariableToTextOfElementWithCssSelector(String variable, String selector, int step) {
        this.variable = variable;
        this.selector = selector;
        this.step = step;
    }

    @Override
    public void execute(WebDriver driver, ReplayingState replayingState, EventSynchronizer eventSynchronizer) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("bromium.triggerStep('" + step + "');");
    }

    @Override
    public String getName() {
        return SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR + " " + selector + " " + variable;
    }
}
