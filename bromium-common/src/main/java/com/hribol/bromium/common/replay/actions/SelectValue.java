package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.SELECT_VALUE;

public class SelectValue extends ActionWithJSPreconditionBase {

    private final String cssSelector;
    private final String value;

    public SelectValue(String cssSelector, String value, Function<WebDriver, SearchContext> contextProvider) {
        super(contextProvider);
        this.cssSelector = cssSelector;
        this.value = value;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<WebDriver, SearchContext> contextProvider) {
        WebElement element = contextProvider.apply(driver).findElement(By.cssSelector(cssSelector));
        Select select = new Select(element);
        select.selectByValue(value);
    }

    @Override
    public String getJSEventToWaitFor() {
        return SELECT_VALUE + " " + cssSelector + " " + value;
    }
}
