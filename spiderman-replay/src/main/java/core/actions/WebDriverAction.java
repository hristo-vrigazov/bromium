package core.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.WebDriver;

/**
 * Encapsulated selenium {@link org.openqa.selenium.WebDriver} action.
 * The action is executed using the {@link #execute(WebDriver, ReplayFiltersFacade)} method.
 * The name of the event, which is written in the measurements file can
 * be accessed through the {@link #getName()} method. Every action also
 * has to tell whether it expects an HTTP query after it, so that it is known
 * whether we should block the execution and wait until resources are loaded
 * through HTTP requests, or not block the execution. This is achieved using the
 * {@link #expectsHttpRequest()}.
 */
public interface WebDriverAction {
    /**
     * The implementations of this method should consist of the driver executing
     * the action. For example, <code>driver.findElement(By.id("someid")).click()</code>
     * would be an implementation of an action called ClickId for example.
     * @param driver the instance of driver through which the action will be executed
     */
    void execute(WebDriver driver, ReplayFiltersFacade replayFiltersFacade);

    /**
     * The name of the action, which will be written in the measurements and in the
     * logs
     * @return the name of the action
     */
    String getName();

    /**
     * Whether after the action, the execution should be blocked until an HTTP request
     * is sent or no
     * @return true if the execution should be blocked until HTTP request is sent, false
     * otherwise
     */
    boolean expectsHttpRequest();
}
