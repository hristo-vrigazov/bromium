package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.spiderman.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.spiderman.cli.factory.RecordBrowserFactory;
import com.hribol.spiderman.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.record.RecordBrowserBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ChromeRecordBrowser.class,
        RecordBrowserBase.class,
        RecordBrowserFactory.class
})
public class RecordBrowserFactoryTest {
    @Test
    public void suppliesChromeDriver() throws Exception {
        String pathToDriver = "chromedriver";
        String pathToJSFile = "injection.js";

        ChromeRecordBrowser chromeRecordBrowser = mock(ChromeRecordBrowser.class);
        whenNew(ChromeRecordBrowser.class).withArguments(pathToDriver, pathToJSFile).thenReturn(chromeRecordBrowser);
        RecordBrowserFactory recordBrowserFactory = new RecordBrowserFactory();
        assertEquals(chromeRecordBrowser, recordBrowserFactory.create(CHROME, pathToDriver, pathToJSFile));
    }
}