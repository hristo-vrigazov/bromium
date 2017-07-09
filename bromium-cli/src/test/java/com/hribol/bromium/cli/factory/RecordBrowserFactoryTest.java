package com.hribol.bromium.cli.factory;

import com.hribol.bromium.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.utils.JavascriptInjector;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.openqa.selenium.remote.BrowserType.CHROME;


public class RecordBrowserFactoryTest {

    private final String pathToDriver = "/chromedriver";

    @Test
    public void canCreateChromeDriver() throws Exception {
        JavascriptInjector javascriptInjector = mock(JavascriptInjector.class);

        RecordBrowserFactory recordBrowserFactory = new RecordBrowserFactory();

        RecordBrowserBase recordBrowserBase = recordBrowserFactory.create(CHROME, pathToDriver, javascriptInjector);

        assertNotNull(recordBrowserBase);
        assertTrue(recordBrowserBase instanceof ChromeRecordBrowser);
    }
}
