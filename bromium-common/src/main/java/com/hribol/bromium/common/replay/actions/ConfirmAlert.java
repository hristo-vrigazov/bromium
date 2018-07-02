package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import org.openqa.selenium.WebDriver;

import static com.hribol.bromium.core.utils.WebDriverActions.CONFIRM_ALERT;

public class ConfirmAlert implements WebDriverAction {
    private boolean expectHttpRequest;

    public ConfirmAlert(boolean expectHttpRequest) {
        this.expectHttpRequest = expectHttpRequest;
    }

    /**
     * The implementations of this method should consist of the driver executing
     * the action. For example, <code>driver.findElement(By.id("someid")).click()</code>
     * would be an implementation of an action called ClickId for example.
     *
     * @param driver            the instance of driver through which the action will be executed
     * @param replayingState    the current state of the replay
     * @param eventSynchronizer the object which will be used for synchronization
     */
    @Override
    public void execute(WebDriver driver, ReplayingState replayingState, EventSynchronizer eventSynchronizer) {
        driver.switchTo().alert().accept();
    }

    /**
     * The name of the action, which will be written in the measurements and in the
     * logs
     *
     * @return the name of the action
     */
    @Override
    public String getName() {
        return CONFIRM_ALERT;
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
        return expectHttpRequest;
    }
}
