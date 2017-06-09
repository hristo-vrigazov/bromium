package com.hribol.bromium.cli.factory;

import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.common.record.RecorderTypeRegistry;
import com.hribol.bromium.common.record.RecordingJavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.ApplicationActionRecorder;
import com.hribol.bromium.common.record.application.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.record.factory.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.record.javascript.generation.RecorderFunctionFactory;
import com.hribol.bromium.common.record.application.IncludeInvokeRecorderGenerator;
import com.hribol.bromium.record.javascript.generation.WebDriverActionRecorderGenerator;
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
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(pathToApplicationConfiguration);
        String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/template.js"));
        RecorderFunctionFactory recorderFunctionFactory = new PredefinedRecorderFunctionFactory();
        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(recorderFunctionFactory);
        WebDriverActionRecorderGenerator webDriverActionRecorderGenerator = new IncludeInvokeRecorderGenerator(recorderTypeRegistry);
        ApplicationActionRecorder applicationActionRecorder = new RecordingWebDriverActionsOnly(webDriverActionRecorderGenerator);
        JavascriptGenerator recordingJavascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionRecorder);
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
