package com.hribol.spiderman.record;

import com.hribol.spiderman.record.settings.ChromeRecordSettings;
import com.hribol.spiderman.record.settings.RecordSettings;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.net.URI;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver, String pathToJsInjectionFile) {
        super(pathToChromeDriver, pathToJsInjectionFile);
    }

    @Override
    protected RecordSettings createRecordSettings(URI baseURI) {
        return new ChromeRecordSettings(baseURI.toString(), recordRequestFilter, recordResponseFilter);
    }

    @Override
    protected String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }
}
