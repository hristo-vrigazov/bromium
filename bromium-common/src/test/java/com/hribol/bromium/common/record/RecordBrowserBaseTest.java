package com.hribol.bromium.common.record;

import com.hribol.bromium.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.bromium.core.utils.JavascriptInjector;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertTrue;
/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordBrowserBaseTest {

    @Test
    public void integratesComponentsInCorrectWay() throws IOException, URISyntaxException, InterruptedException {
        WebDriver.Window window = Mockito.mock(WebDriver.Window.class);
        WebDriver.Options options = Mockito.mock(WebDriver.Options.class);
        Mockito.when(options.window()).thenReturn(window);
        WebDriver driver = Mockito.spy(WebDriver.class);
        Mockito.when(driver.manage()).thenReturn(options);
        // does not matter, will mock the supplier anyway
        String pathToChromeDriver = "chromedriver";
        String pathToJSInjectionFile = getClass().getResource("/eventsRecorder.js").getFile();
        JavascriptInjector javascriptInjector = new JavascriptInjector(pathToJSInjectionFile);

        VisibleWebDriverSupplier visibleWebDriverSupplier = Mockito.mock(VisibleWebDriverSupplier.class);
        Mockito.when(visibleWebDriverSupplier.get(Matchers.any())).thenReturn(driver);

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
