package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_NAME;

public class ClickName extends ActionWithJSPreconditionBase {

    private String name;
    private Function<WebDriver, SearchContext> contextProvider;

    public ClickName(String name, Function<WebDriver, SearchContext> contextProvider) {
        this.name = name;
        this.contextProvider = contextProvider;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {
        SearchContext searchContext = contextProvider.apply(driver);
        By locator = By.name(this.name);
        searchContext.findElement(locator).click();
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_NAME, name);
    }
}
