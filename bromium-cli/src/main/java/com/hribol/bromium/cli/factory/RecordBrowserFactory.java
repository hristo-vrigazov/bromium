package com.hribol.bromium.cli.factory;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.utils.JavascriptInjector;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URL;
import static com.hribol.bromium.core.DependencyInjectionConstants.TIMEOUT;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordBrowserFactory {
    private Map<String, RecordBrowserSupplier> browserNameToSupplierMap;
    private int timeout;
    private String baseUrl;

    @Inject
    public RecordBrowserFactory(@Named(TIMEOUT) int timeout,
                                @Named(BASE_URL) String baseUrl) {
        this.timeout = timeout;
        this.baseUrl = baseUrl;
        this.browserNameToSupplierMap = new HashMap<>();
        this.browserNameToSupplierMap.put(CHROME, this::getChrome);
    }

    public RecordBrowserBase create(String browserName,
                                    String pathToDriver,
                                    JavascriptInjector javascriptInjector) throws IOException {
        return this.browserNameToSupplierMap.get(browserName).get(pathToDriver, javascriptInjector, timeout, baseUrl);
    }

    private RecordBrowserBase getChrome(String pathToDriver,
                                        JavascriptInjector javascriptInjector,
                                        int timeout,
                                        String baseUrl) throws IOException {
        return new ChromeRecordBrowser(pathToDriver, javascriptInjector, timeout, baseUrl);
    }
}
