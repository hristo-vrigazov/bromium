package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_NAME;

public class ClickName extends ActionWithJSPreconditionBase {

    private String name;

    public ClickName(String name) {
        this.name = name;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {
        driver.findElement(By.name(name)).click();
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_NAME, name);
    }
}
