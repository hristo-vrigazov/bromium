package com.hribol.bromium.integration.tests.record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hribol.bromium.integration.tests.TestUtils.Events.CLICK_DELETE_ON_CHOSEN_ROW;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.TABLE_DELETE_ROW;

public class DeleteTableRowIT extends BaseRecordClickIT {
    public DeleteTableRowIT() {
        super(TABLE_DELETE_ROW, CLICK_DELETE_ON_CHOSEN_ROW, DeleteTableRowIT::getElement);
    }

    private static WebElement getElement(WebDriver driver) {
        return driver.findElements(By.tagName("li"))
                .stream()
                .filter(DeleteTableRowIT::filterElement)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Element was not found!"))
                .findElement(By.className("delete-button"));
    }

    private static boolean filterElement(WebElement webElement) {
        try {
            webElement.findElement(By.id("chosen"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
