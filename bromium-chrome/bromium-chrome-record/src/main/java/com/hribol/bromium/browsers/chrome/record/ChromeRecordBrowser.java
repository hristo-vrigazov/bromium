package com.hribol.bromium.browsers.chrome.record;

import com.hribol.bromium.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.bromium.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.record.RecordResponseFilter;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver,
                               JavascriptInjector javascriptInjector,
                               int timeout,
                               String baseUrl,
                               RecordResponseFilter recordResponseFilter) throws IOException {
        super(pathToChromeDriver, javascriptInjector, timeout, baseUrl, recordResponseFilter);
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
