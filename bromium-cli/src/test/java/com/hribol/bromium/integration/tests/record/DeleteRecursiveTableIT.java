package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.Events.DELETE_ROW_IN_NAMED_TABLE;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.TABLE_RECURSIVE_DEMO_PAGE;

public class DeleteRecursiveTableIT extends BaseRecordClickIT {

    public DeleteRecursiveTableIT() {
        super(TABLE_RECURSIVE_DEMO_PAGE,
                ImmutableMap.of(
                        EVENT, DELETE_ROW_IN_NAMED_TABLE,
                        "rowName", "table1",
                        "tableName", "Element 2"),
                DeleteRecursiveTableIT::getElement);
    }

    private static WebElement getElement(WebDriver driver) {
        return driver.findElements(By.tagName("ol"))
                .stream()
                .filter(webElement -> webElement.findElement(By.className("tableName")).getText().equals("table1"))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Table not found!"))
                .findElements(By.tagName("li"))
                .stream()
                .filter(webElement -> webElement.findElement(By.className("rowName")).getText().equals("Element 2"))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Table not found!"));

    }

}
