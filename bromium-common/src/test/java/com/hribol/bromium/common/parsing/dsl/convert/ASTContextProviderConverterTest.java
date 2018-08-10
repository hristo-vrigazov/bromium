package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.ParameterValues;
import com.hribol.bromium.dsl.bromium.ClickClassByText;
import com.hribol.bromium.dsl.bromium.ExposedParameter;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import com.hribol.bromium.dsl.bromium.impl.ClassByTextImpl;
import com.hribol.bromium.dsl.bromium.impl.ClickClassByTextImpl;
import com.hribol.bromium.dsl.bromium.impl.CssSelectorImpl;
import com.hribol.bromium.dsl.bromium.impl.ExposedParameterImpl;
import com.hribol.bromium.dsl.bromium.impl.ParameterValueImpl;
import com.hribol.bromium.dsl.bromium.impl.RowIndexImpl;
import com.hribol.bromium.dsl.bromium.impl.RowLocatorImpl;
import com.hribol.bromium.dsl.bromium.impl.TableActionContextImpl;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ASTContextProviderConverterTest {

    @Test
    public void correctlyConstructsFirstIndex() {
        baseIndexCorrectlyConstructs(0);
    }

    @Test
    public void correctlyConstructsSecondIndex() {
        baseIndexCorrectlyConstructs(1);
    }

    @Test
    public void correctlyConstructsRowLocatorFirst() {
        baseCorrectlyConstructs(0);
    }

    @Test
    public void correctlyConstructsRowLocatorSecond() {
        baseCorrectlyConstructs(1);
    }

    @Test
    public void correctlyConstructsClassByTextFirst() {
        baseCorrectlyConstructs(0);
    }

    @Test
    public void correctlyConstructsClassByTextSecond() {
        baseCorrectlyConstructs(1);
    }

    private void baseIndexCorrectlyConstructs(int index) {
        String tableCssSelector = ".entity-triggers-container";
        String rowsCssSelector = ".trigger-list-entry";

        CssSelectorImpl tableLocator = new CssSelectorImpl(){};
        tableLocator.setSelector(hardcoded(tableCssSelector));
        CssSelectorImpl rowsLocator = new CssSelectorImpl(){};
        rowsLocator.setSelector(hardcoded(rowsCssSelector));
        RowIndexImpl rowSelector = new RowIndexImpl(){};
        rowSelector.setIndex(index);

        TableActionContextImpl actionContext = new TableActionContextImpl(){};
        actionContext.setTableLocator(tableLocator);
        actionContext.setRowsLocator(rowsLocator);
        actionContext.setRowSelector(rowSelector);

        ParameterValues parameterValues = new ParameterValues();

        WebElement rowOne = mock(WebElement.class);
        WebElement rowTwo = mock(WebElement.class);
        List<WebElement> rows = Arrays.asList(rowOne, rowTwo);

        WebElement table = mock(WebElement.class);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(By.cssSelector(tableCssSelector))).thenReturn(Collections.singletonList(table));
        when(table.findElements(By.cssSelector(rowsCssSelector))).thenReturn(Arrays.asList(rowOne, rowTwo));

        ASTContextProviderConverter converter = new ASTContextProviderConverter();

        ContextProvider convert = converter.convert(actionContext);
        SearchContext searchContext = convert.getFunction().apply(parameterValues).apply(webDriver);

        Assert.assertNotNull(searchContext);
        Assert.assertEquals(rows.get(index), searchContext);
    }

    private void baseCorrectlyConstructs(int index) {
        int otherIndex = (index + 1) % 2;
        String tableCssSelector = ".entity-triggers-container";
        String rowsCssSelector = ".trigger-list-entry";
        String rowCssSelector = ".selected";

        CssSelectorImpl tableLocator = new CssSelectorImpl(){};
        tableLocator.setSelector(hardcoded(tableCssSelector));
        CssSelectorImpl rowsLocator = new CssSelectorImpl(){};
        rowsLocator.setSelector(hardcoded(rowsCssSelector));
        RowLocatorImpl rowSelector = new RowLocatorImpl(){};
        CssSelectorImpl rowSelectedByCssSelector = new CssSelectorImpl() {};
        rowSelectedByCssSelector.setSelector(hardcoded(rowCssSelector));
        rowSelector.setRowLocator(rowSelectedByCssSelector);

        TableActionContextImpl actionContext = new TableActionContextImpl(){};
        actionContext.setTableLocator(tableLocator);
        actionContext.setRowsLocator(rowsLocator);
        actionContext.setRowSelector(rowSelector);

        ParameterValues parameterValues = new ParameterValues();

        WebElement indicatorElement = mock(WebElement.class);
        WebElement rowOne = mock(WebElement.class);
        WebElement rowTwo = mock(WebElement.class);
        List<WebElement> rows = Arrays.asList(rowOne, rowTwo);

        WebElement table = mock(WebElement.class);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(By.cssSelector(tableCssSelector))).thenReturn(Collections.singletonList(table));
        when(table.findElements(By.cssSelector(rowsCssSelector))).thenReturn(Arrays.asList(rowOne, rowTwo));
        when(rows.get(index).findElements(By.cssSelector(rowCssSelector))).thenReturn(Arrays.asList(indicatorElement));
        when(rows.get(otherIndex).findElements(By.cssSelector(rowCssSelector))).thenThrow(new NoSuchElementException("Could not find it!"));

        ASTContextProviderConverter converter = new ASTContextProviderConverter();

        ContextProvider convert = converter.convert(actionContext);
        SearchContext searchContext = convert.getFunction().apply(parameterValues).apply(webDriver);

        Assert.assertNotNull(searchContext);
        Assert.assertEquals(rows.get(index), searchContext);
    }

    private void baseCorrectlyConstructsClassByText(int index) {
        int otherIndex = (index + 1) % 2;
        String tableCssSelector = ".entity-triggers-container";
        String rowsCssSelector = ".trigger-list-entry";
        String className = "displayName";
        String textAlias = "triggerName";
        String textValue = "googleKeyword";

        CssSelectorImpl tableLocator = new CssSelectorImpl(){};
        tableLocator.setSelector(hardcoded(tableCssSelector));
        CssSelectorImpl rowsLocator = new CssSelectorImpl(){};
        rowsLocator.setSelector(hardcoded(rowsCssSelector));
        RowLocatorImpl rowSelector = new RowLocatorImpl(){};
        ClassByTextImpl rowSelectedByCssSelector = new ClassByTextImpl() {};
        rowSelectedByCssSelector.setKlass(hardcoded(className));
        rowSelectedByCssSelector.setText(exposed(textAlias));
        rowSelector.setRowLocator(rowSelectedByCssSelector);

        TableActionContextImpl actionContext = new TableActionContextImpl(){};
        actionContext.setTableLocator(tableLocator);
        actionContext.setRowsLocator(rowsLocator);
        actionContext.setRowSelector(rowSelector);

        ParameterValues parameterValues = new ParameterValues();
        parameterValues.put(textAlias, textValue);

        WebElement indicatorElement = mock(WebElement.class);
        when(indicatorElement.getText()).thenReturn(textValue);

        WebElement rowOne = mock(WebElement.class);
        WebElement rowTwo = mock(WebElement.class);
        List<WebElement> rows = Arrays.asList(rowOne, rowTwo);

        WebElement table = mock(WebElement.class);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(By.cssSelector(tableCssSelector))).thenReturn(Collections.singletonList(table));
        when(table.findElements(By.cssSelector(rowsCssSelector))).thenReturn(Arrays.asList(rowOne, rowTwo));
        when(rows.get(index).findElements(By.className(className))).thenReturn(Arrays.asList(indicatorElement));
        when(rows.get(otherIndex).findElements(By.cssSelector(className))).thenThrow(new NoSuchElementException("Could not find it!"));

        ASTContextProviderConverter converter = new ASTContextProviderConverter();

        ContextProvider convert = converter.convert(actionContext);
        SearchContext searchContext = convert.getFunction().apply(parameterValues).apply(webDriver);

        Assert.assertNotNull(searchContext);
        Assert.assertEquals(rows.get(index), searchContext);
    }

    private ParameterValue hardcoded(String value) {
        ParameterValueImpl parameterValue = new ParameterValueImpl(){};
        parameterValue.setContent(value);
        return parameterValue;
    }

    private ParameterValue exposed(String alias) {
        ExposedParameter exposedParameter = new ExposedParameterImpl(){};
        exposedParameter.setName(alias);
        ParameterValueImpl parameterValue = new ParameterValueImpl(){};
        parameterValue.setExposedParameter(exposedParameter);
        return parameterValue;
    }

}
