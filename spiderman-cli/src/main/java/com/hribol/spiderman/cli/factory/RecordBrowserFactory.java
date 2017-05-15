package com.hribol.spiderman.cli.factory;

import com.hribol.spiderman.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.spiderman.record.RecordBrowserBase;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordBrowserFactory {
    private Map<String, RecordBrowserSupplier> browserNameToSupplierMap;

    public RecordBrowserFactory() {
        this.browserNameToSupplierMap = new HashMap<>();
        this.browserNameToSupplierMap.put(CHROME, this::getChrome);
    }

    public RecordBrowserBase create(String browserName, String pathToDriver, String pathToJSInjectionFile) throws IOException {
        return this.browserNameToSupplierMap.get(browserName).get(pathToDriver, pathToJSInjectionFile);
    }

    private RecordBrowserBase getChrome(String pathToDriver, String pathToJSInjectionFile) throws IOException {
        return new ChromeRecordBrowser(pathToDriver, pathToJSInjectionFile);
    }
}
