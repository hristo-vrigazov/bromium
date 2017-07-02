package com.hribol.bromium.cli.factory;

import com.google.inject.Inject;
import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.common.generation.record.RecordingJavascriptGenerator;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.JavascriptInjector;
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
    private JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator;

    @Inject
    public RecordBrowserFactory(JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator) {
        this.browserNameToSupplierMap = new HashMap<>();
        this.browserNameToSupplierMap.put(CHROME, this::getChrome);
        this.applicationActionGenerator = applicationActionGenerator;
    }

    public RecordBrowserBase create(String browserName, String pathToDriver, String pathToApplicationConfiguration) throws IOException {
        String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/record.js"));
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
        JavascriptGenerator<ApplicationConfiguration> recordingJavascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionGenerator);
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
