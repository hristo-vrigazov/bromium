package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_NAME;

public class ClickName extends ActionWithJSPreconditionBase {

    private String name;

    public ClickName(String name, SearchContextFunction contextProvider) {
        super(contextProvider);
        this.name = name;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver,
                                                           ReplayingState replayingState,
                                                           Function<SearchContext, SearchContext> contextProvider) {
        SearchContext searchContext = contextProvider.apply(driver);
        By locator = By.name(this.name);
        searchContext.findElement(locator).click();
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_NAME, name);
    }
}
