package com.hribol.spiderman.cli.factory;

import com.hribol.spiderman.browsers.chrome.record.ChromeRecordBrowser;
import com.hribol.spiderman.record.JavascriptInjector;
import com.hribol.spiderman.record.RecordBrowserBase;
import org.junit.Test;
import org.junit.runner.RunWith;
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
        RecordBrowserFactory.class,
        JavascriptInjector.class,
        RecordBrowserSupplier.class
})
public class RecordBrowserFactoryTest {
    @Test
    public void suppliesChromeDriver() throws Exception {
        String pathToDriver = "chromedriver";
        String pathToJSFile = "injection.js";

        JavascriptInjector javascriptInjector = mock(JavascriptInjector.class);
        ChromeRecordBrowser chromeRecordBrowser = mock(ChromeRecordBrowser.class);
        whenNew(JavascriptInjector.class).withArguments(pathToJSFile).thenReturn(javascriptInjector);
        whenNew(ChromeRecordBrowser.class).withArguments(pathToDriver, javascriptInjector).thenReturn(chromeRecordBrowser);
        RecordBrowserFactory recordBrowserFactory = new RecordBrowserFactory();
        assertEquals(chromeRecordBrowser, recordBrowserFactory.create(CHROME, pathToDriver, pathToJSFile));
    }
}
