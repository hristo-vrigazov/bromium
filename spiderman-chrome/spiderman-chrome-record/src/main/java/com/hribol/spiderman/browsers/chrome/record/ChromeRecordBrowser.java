package com.hribol.spiderman.browsers.chrome.record;

import com.hribol.spiderman.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.record.JavascriptInjector;
import com.hribol.spiderman.record.RecordBrowserBase;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver, JavascriptInjector javascriptInjector) throws IOException {
        super(pathToChromeDriver, javascriptInjector);
    }

    @Override
    public String getSystemProperty() {
        return ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;
    }

    @Override
    public VisibleWebDriverSupplier getVisibleWebDriverSupplier() {
        return new VisibleChromeDriverSupplier();
    }
}
