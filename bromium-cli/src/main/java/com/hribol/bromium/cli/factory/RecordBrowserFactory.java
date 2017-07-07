package com.hribol.bromium.cli.factory;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.common.generation.helper.suppliers.RecordingJavascriptGeneratorSupplier;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.suppliers.JavascriptInjectorSupplier;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.Constants.RECORD_TEMPLATE_RESOURCE;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordBrowserFactory {
    private Map<String, RecordBrowserSupplier> browserNameToSupplierMap;
    private JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator;
    private String pathToRecordTemplateResource;
    private RecordingJavascriptGeneratorSupplier recordingJavascriptGeneratorSupplier;
    private JavascriptInjectorSupplier javascriptInjectorSupplier;
    private ApplicationConfigurationParser applicationConfigurationParser;

    @Inject
    public RecordBrowserFactory(JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator,
                                @Named(RECORD_TEMPLATE_RESOURCE) String pathToRecordTemplateResource,
                                RecordingJavascriptGeneratorSupplier recordingJavascriptGeneratorSupplier,
                                JavascriptInjectorSupplier javascriptInjectorSupplier,
                                ApplicationConfigurationParser applicationConfigurationParser) {
        this.applicationActionGenerator = applicationActionGenerator;
        this.pathToRecordTemplateResource = pathToRecordTemplateResource;
        this.recordingJavascriptGeneratorSupplier = recordingJavascriptGeneratorSupplier;
        this.javascriptInjectorSupplier = javascriptInjectorSupplier;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.browserNameToSupplierMap = new HashMap<>();
        this.browserNameToSupplierMap.put(CHROME, this::getChrome);
    }

    public RecordBrowserBase create(String browserName, String pathToDriver, String pathToApplicationConfiguration) throws IOException {
        String baseTemplate = IOUtils.toString(getClass().getResourceAsStream(pathToRecordTemplateResource));
        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser.parseApplicationConfiguration(pathToApplicationConfiguration);
        JavascriptGenerator<ApplicationConfiguration> recordingJavascriptGenerator = recordingJavascriptGeneratorSupplier.get(baseTemplate, applicationActionGenerator);
        String recordingJavascript = recordingJavascriptGenerator.generate(applicationConfiguration);
        System.out.println(recordingJavascript);
        StringReader stringReader = new StringReader(recordingJavascript);
        JavascriptInjector javascriptInjector = javascriptInjectorSupplier.get(stringReader);
        return this.browserNameToSupplierMap.get(browserName).get(pathToDriver, javascriptInjector);
    }

    private RecordBrowserBase getChrome(String pathToDriver, JavascriptInjector javascriptInjector) throws IOException {
        return new ChromeRecordBrowser(pathToDriver, javascriptInjector);
    }
}
