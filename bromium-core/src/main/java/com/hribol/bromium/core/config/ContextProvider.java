package com.hribol.bromium.core.config;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class ContextProvider {
    private Function<WebDriver, SearchContext> function;

    public Function<WebDriver, SearchContext> getFunction() {
        return function;
    }

    public void setFunction(Function<WebDriver, SearchContext> function) {
        this.function = function;
    }
}
