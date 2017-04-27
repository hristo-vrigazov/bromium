package com.hribol.spiderman.browsers.chrome.record;

import com.hribol.spiderman.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.spiderman.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.record.RecordBrowserBase;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver, String pathToJsInjectionFile) throws IOException {
        super(pathToChromeDriver, pathToJsInjectionFile);
    }

    @Override
    protected String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }

    @Override
    protected VisibleWebDriverSupplier getVisibleWebDriverSupplier() {
        return new VisibleChromeDriverSupplier();
    }
}
