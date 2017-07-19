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
import static com.hribol.bromium.core.DependencyInjectionConstants.OUTPUT_FILE;
import static com.hribol.bromium.core.DependencyInjectionConstants.TIMEOUT;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordBrowserFactory {
    private Map<String, RecordBrowserSupplier> browserNameToSupplierMap;
    private int timeout;
    private String baseUrl;
    private String outputFile;

    @Inject
    public RecordBrowserFactory(@Named(TIMEOUT) int timeout,
                                @Named(BASE_URL) String baseUrl,
                                @Named(OUTPUT_FILE) String outputFile) {
        this.timeout = timeout;
        this.baseUrl = baseUrl;
        this.outputFile = outputFile;
        this.browserNameToSupplierMap = new HashMap<>();
        this.browserNameToSupplierMap.put(CHROME, this::getChrome);
    }

    public RecordBrowserBase create(String browserName,
                                    String pathToDriver,
                                    JavascriptInjector javascriptInjector) throws IOException {
        return this.browserNameToSupplierMap.get(browserName).get(pathToDriver, javascriptInjector,
                timeout, baseUrl, outputFile);
    }

    private RecordBrowserBase getChrome(String pathToDriver,
                                        JavascriptInjector javascriptInjector,
                                        int timeout,
                                        String baseUrl,
                                        String outputFile) throws IOException {
        return new ChromeRecordBrowser(pathToDriver, javascriptInjector, timeout, baseUrl, outputFile);
    }
}
