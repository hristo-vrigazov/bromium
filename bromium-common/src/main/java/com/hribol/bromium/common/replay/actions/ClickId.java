package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_ID;

public class ClickId extends ActionWithJSPreconditionBase {

    private final String elementId;

    public ClickId(String elementId, Function<WebDriver, SearchContext> contextProvider) {
        super(contextProvider);
        this.elementId = elementId;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<WebDriver, SearchContext> contextProvider) {
        contextProvider.apply(driver).findElement(By.id(elementId)).click();
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_ID, elementId);
    }
}
