package core.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by hvrigazov on 18.05.17.
 */
public class TextOfElementFoundByCssSelectorToBe implements WebDriverAction {

    private final String cssSelector;
    private final String text;
    private final String eventName;

    public TextOfElementFoundByCssSelectorToBe(String cssSelector, String text, String eventName) {
        this.cssSelector = cssSelector;
        this.text = text;
        this.eventName = eventName;
    }

    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
        By by = By.cssSelector(cssSelector);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBe(by, text));
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean expectsHttpRequest() {
        return false;
    }
}
