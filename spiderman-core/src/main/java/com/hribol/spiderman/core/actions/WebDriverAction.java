package com.hribol.spiderman.core.actions;

import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverAction {
    void execute(WebDriver driver);
    String getName();
    boolean expectsHttpRequest();
}
