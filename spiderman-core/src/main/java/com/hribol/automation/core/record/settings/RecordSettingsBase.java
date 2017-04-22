package com.hribol.automation.core.record.settings;

import com.hribol.automation.core.suppliers.*;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordSettingsBase implements RecordSettings {

    private final String baseURI;
    private final RequestFilter requestFilter;
    private final ResponseFilter responseFilter;

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private VisibleWebDriverSupplier webDriverSupplier;

    public RecordSettingsBase(String baseURI,
                              RequestFilter requestFilter,
                              ResponseFilter responseFilter,
                              VisibleWebDriverSupplier webDriverSupplier) {
        this.baseURI = baseURI;
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
        this.webDriverSupplier = webDriverSupplier;
    }

    @Override
    public void cleanUpRecord() {
        driver.quit();
        proxy.stop();
    }

    @Override
    public void prepareRecord(int timeout) {
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        Proxy seleniumProxy = new SeleniumProxySupplier(proxy).get();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        this.driver = webDriverSupplier.get(desiredCapabilities);
        this.driver.manage().window().maximize();
    }

    @Override
    public void openBaseUrl() {
        driver.get(baseURI);
    }
}
