package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.ParameterValues;
import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.ClassByText;
import com.hribol.bromium.dsl.bromium.CssSelector;
import com.hribol.bromium.dsl.bromium.Locator;
import com.hribol.bromium.dsl.bromium.RowIndex;
import com.hribol.bromium.dsl.bromium.RowLocator;
import com.hribol.bromium.dsl.bromium.RowSelector;
import com.hribol.bromium.dsl.bromium.TableActionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ASTContextProviderConverter implements ASTNodeConverter<ActionContext, ContextProvider> {

    @Override
    public ContextProvider convert(ActionContext actionContext) {
        ContextProvider contextProvider = new ContextProvider();
        contextProvider.setFunction(
                actionContext == null ?
                        parameterValues -> searchContext -> searchContext :
                        parameterValues -> searchContext -> getActionContext(parameterValues, actionContext).apply(searchContext)
        );
        return contextProvider;
    }

    private Function<SearchContext, WebElement> getActionContext(ParameterValues parameterValues, ActionContext actionContext) {
        return searchContext -> getActionContextMultiple(parameterValues, actionContext).apply(searchContext).get(0);
    }

    private Function<SearchContext, List<WebElement>> getActionContextMultiple(ParameterValues parameterValues, ActionContext actionContext) {
        if (actionContext instanceof TableActionContext) {
            return getTableActionContext(parameterValues, (TableActionContext) actionContext);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + actionContext);
    }

    private Function<SearchContext, List<WebElement>> getTableActionContext(ParameterValues parameterValues,
                                                                            TableActionContext tableActionContext) {
        Function<SearchContext, WebElement> tableLocator = getLocator(parameterValues, tableActionContext.getTableLocator());
        Function<List<WebElement>, List<WebElement>> rowSelector = getRowSelector(parameterValues, tableActionContext.getRowSelector());
        Function<SearchContext, List<WebElement>> rowLocator = getLocatorMultiple(parameterValues, tableActionContext.getRowsLocator());
        return compileTableActionContext(tableLocator, rowLocator, rowSelector);
    }

    private Function<SearchContext, List<WebElement>> compileTableActionContext(Function<SearchContext, WebElement> tableLocator,
                                                                                Function<SearchContext, List<WebElement>> rowsLocator,
                                                                                Function<List<WebElement>, List<WebElement>> rowSelector) {
        return initialSearchContext -> {
            WebElement webElement = tableLocator.apply(initialSearchContext);
            List<WebElement> rows = rowsLocator.apply(webElement);
            return rowSelector.apply(rows);
        };
    }

    private Function<SearchContext, List<WebElement>> getLocatorMultiple(ParameterValues parameterValues, Locator locator) {
        if (locator instanceof CssSelector) {
            return getCssSelector(parameterValues, (CssSelector) locator);
        } else if (locator instanceof ClassByText) {
            return getClassByText(parameterValues, (ClassByText) locator);
        } else if (locator instanceof ActionContext) {
            return getActionContextMultiple(parameterValues, (ActionContext) locator);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + locator);
    }

    private Function<SearchContext, WebElement> getLocator(ParameterValues parameterValues, Locator locator) {
        return searchContext -> getLocatorMultiple(parameterValues, locator).apply(searchContext).get(0);
    }

    private Function<SearchContext, List<WebElement>> getCssSelector(ParameterValues parameterValues, CssSelector cssSelector) {
        return searchContext -> searchContext.findElements(By.cssSelector(cssSelector.getSelector().getContent()));
    }

    private Function<SearchContext, List<WebElement>> getClassByText(ParameterValues parameterValues, ClassByText classByText) {
        String initialCollectorClass = classByText.getKlass().getContent();
        String text = parameterValues.get(classByText.getText().getExposedParameter().getName());
        return searchContext -> searchContext.findElements(By.className(initialCollectorClass))
                .stream()
                .filter(webElement -> elementTextIsEqualToAndIsDisplayed(text, webElement))
                .collect(Collectors.toList());
    }

    private Function<List<WebElement>, List<WebElement>> getRowSelector(ParameterValues parameterValues, RowSelector rowSelector) {
        if (rowSelector instanceof RowLocator) {
            return getRowLocator(parameterValues, (RowLocator) rowSelector);
        } else if (rowSelector instanceof RowIndex) {
            return getRowIndex(parameterValues, (RowIndex) rowSelector);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + rowSelector);
    }

    private Function<List<WebElement>, List<WebElement>> getRowLocator(ParameterValues parameterValues, RowLocator rowLocator) {
        return getRowLocator(getLocator(parameterValues, rowLocator.getRowLocator()));
    }

    private Function<List<WebElement>, List<WebElement>> getRowLocator(Function<SearchContext, WebElement> rowLocator) {
        return webElements -> webElements
                .stream()
                .filter(webElement -> searchContextContains(webElement, rowLocator))
                .collect(Collectors.toList());
    }

    private Function<List<WebElement>, List<WebElement>> getRowIndex(ParameterValues parameterValues, RowIndex rowIndex) {
        //TODO: think about aliasing
        String indexRaw = parameterValues.get(rowIndex.getIndex().getExposedParameter().getName());
        return getRowIndex(Integer.parseInt(indexRaw));
    }

    private Function<List<WebElement>, List<WebElement>> getRowIndex(int rowIndex) {
        return webElements -> Collections.singletonList(webElements.get(rowIndex));
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
