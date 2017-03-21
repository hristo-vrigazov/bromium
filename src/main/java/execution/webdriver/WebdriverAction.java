package execution.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebdriverAction {
    void execute(WebDriver driver);
    String getName();
    boolean expectsHttpRequest();
}
