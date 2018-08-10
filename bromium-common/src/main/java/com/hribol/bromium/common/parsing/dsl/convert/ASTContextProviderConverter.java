package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.ClassByText;
import com.hribol.bromium.dsl.bromium.CssSelector;
import com.hribol.bromium.dsl.bromium.Locator;
import com.hribol.bromium.dsl.bromium.RowIndex;
import com.hribol.bromium.dsl.bromium.RowLocator;
import com.hribol.bromium.dsl.bromium.RowSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Function;

public class ASTContextProviderConverter implements ASTNodeConverter<ActionContext, ContextProvider> {

    @Override
    public ContextProvider convert(ActionContext actionContext) {
        //TODO: implement
        ContextProvider contextProvider = new ContextProvider();
        contextProvider.setFunction(parameterValues -> webDriver -> webDriver);
        return contextProvider;
    }

    private Function<SearchContext, WebElement> getTableActionContext(Function<SearchContext, WebElement> tableLocator,
                                                                      Function<SearchContext, List<WebElement>> rowsLocator,
                                                                      Function<List<WebElement>, WebElement> rowSelector) {
        return initialSearchContext -> {
            WebElement webElement = tableLocator.apply(initialSearchContext);
            List<WebElement> rows = rowsLocator.apply(webElement);
            return rowSelector.apply(rows);
        };
    }

    private Function<SearchContext, WebElement> getLocator(Locator locator) {
        return null;
    }

    private Function<SearchContext, WebElement> getCssSelector(CssSelector cssSelector) {
        return searchContext -> searchContext.findElement(By.cssSelector(cssSelector.getSelector().getContent()));
    }

    private Function<SearchContext, WebElement> getClassByText(ClassByText classByText) {
        String initialCollectorClass = classByText.getKlass().getContent();
        //TODO: how to resolve exposed parameters?
        String text = classByText.getText().getContent();
        return searchContext -> searchContext.findElements(By.className(initialCollectorClass))
                .stream()
                .filter(webElement -> elementTextIsEqualToAndIsDisplayed(text, webElement))
                .findFirst()
                .orElseThrow(() -> new ElementNotSelectableException("Element with class " + initialCollectorClass + " and text " + text + " was not found" ));
    }

    private Function<List<WebElement>, WebElement> getRowSelector(RowSelector rowSelector) {
        if (rowSelector instanceof RowLocator) {
            return getRowLocator((RowLocator) rowSelector);
        }

        return getRowIndex((RowIndex) rowSelector);
    }

    private Function<List<WebElement>, WebElement> getRowLocator(RowLocator rowLocator) {
        return getRowLocator(getLocator(rowLocator.getRowLocator()));
    }

    private Function<List<WebElement>, WebElement> getRowLocator(Function<SearchContext, WebElement> rowLocator) {
        return webElements -> webElements
                .stream()
                .filter(webElement -> searchContextContains(webElement, rowLocator))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Could not find element which contains"));
    }

    private Function<List<WebElement>, WebElement> getRowIndex(RowIndex rowIndex) {
        return getRowIndex(rowIndex.getIndex());
    }

    private Function<List<WebElement>, WebElement> getRowIndex(int rowIndex) {
        return webElements -> webElements.get(rowIndex);
    }

    private boolean searchContextContains(SearchContext searchContext,
                                          Function<SearchContext, WebElement> locator) {
        try {
            locator.apply(searchContext);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean elementTextIsEqualToAndIsDisplayed(String text, WebElement webElement) {
        boolean textIsCorrect = webElement.getText().trim().equals(text);
        boolean elementIsDisplayed = webElement.isDisplayed();
        return textIsCorrect && elementIsDisplayed;
    }


}
