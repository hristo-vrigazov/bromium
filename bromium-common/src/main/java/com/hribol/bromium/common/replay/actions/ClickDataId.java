package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_DATA_ID;

public class ClickDataId extends ActionWithJSPreconditionBase {

    private final String dataId;
    private final boolean expectsHttpRequest;

    public ClickDataId(String dataId, boolean expectsHttpRequest) {
        this.dataId = dataId;
        this.expectsHttpRequest = expectsHttpRequest;
    }


    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {
        String dataId = this.dataId.startsWith("{{")
                ? replayingState.getValue(this.dataId)
                : this.dataId;
        By selector = By.cssSelector("input[data-id='" + dataId + "'");
        driver.findElement(selector).click();
    }

    /**
     * Gets the name of the event which has to happen
     *
     * @return the name of the event which has to happen
     */
    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_DATA_ID, dataId);
    }

    /**
     * Whether after the action, the execution should be blocked until an HTTP request
     * is sent or no
     *
     * @return true if the execution should be blocked until HTTP request is sent, false
     * otherwise
     */
    @Override
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }
}
