package com.hribol.bromium.cli.factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.common.record.RecordingInjectionModule;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.common.record.RecordingJavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.ApplicationActionGenerator;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringReader;
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

    public RecordBrowserBase create(String browserName, String pathToDriver, String pathToApplicationConfiguration) throws IOException {
        Injector injector = Guice.createInjector(new RecordingInjectionModule());
        ApplicationActionGenerator applicationActionGenerator = injector.getInstance(ApplicationActionGenerator.class);
        String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/template.js"));
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
        JavascriptGenerator recordingJavascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionGenerator);
        String recordingJavascript = recordingJavascriptGenerator.generate(applicationConfiguration);
        System.out.println(recordingJavascript);
        StringReader stringReader = new StringReader(recordingJavascript);
        JavascriptInjector javascriptInjector = new JavascriptInjector(stringReader);
        return this.browserNameToSupplierMap.get(browserName).get(pathToDriver, javascriptInjector);
    }

    private RecordBrowserBase getChrome(String pathToDriver, JavascriptInjector javascriptInjector) throws IOException {
        return new ChromeRecordBrowser(pathToDriver, javascriptInjector);
    }
}
