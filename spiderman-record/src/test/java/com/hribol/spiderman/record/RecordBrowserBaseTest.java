package com.hribol.spiderman.record;

import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.replay.config.utils.JavascriptInjector;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordBrowserBaseTest {

    @Test
    public void integratesComponentsInCorrectWay() throws IOException, URISyntaxException, InterruptedException {
        WebDriver.Window window = mock(WebDriver.Window.class);
        WebDriver.Options options = mock(WebDriver.Options.class);
        when(options.window()).thenReturn(window);
        WebDriver driver = spy(WebDriver.class);
        when(driver.manage()).thenReturn(options);
        // does not matter, will mock the supplier anyway
        String pathToChromeDriver = "chromedriver";
        String pathToJSInjectionFile = getClass().getResource("/eventsRecorder.js").getFile();
        JavascriptInjector javascriptInjector = new JavascriptInjector(pathToJSInjectionFile);

        VisibleWebDriverSupplier visibleWebDriverSupplier = mock(VisibleWebDriverSupplier.class);
        when(visibleWebDriverSupplier.get(any())).thenReturn(driver);

        RecordBrowserBase recordBrowserBase = new RecordBrowserBase(pathToChromeDriver, javascriptInjector) {
            @Override
            public String getSystemProperty() {
                return "webdriver.executable.path";
            }

            @Override
            public VisibleWebDriverSupplier getVisibleWebDriverSupplier() {
                return visibleWebDriverSupplier;
            }
        };

        recordBrowserBase.record("http://tenniskafe.com", 123);
        String outputFileName = "tmp.json";
        recordBrowserBase.dumpActions(outputFileName);
        File outputFile = new File(outputFileName);
        assertTrue(outputFile.exists());
        assertTrue(outputFile.delete());
        recordBrowserBase.cleanUp();
    }
}
