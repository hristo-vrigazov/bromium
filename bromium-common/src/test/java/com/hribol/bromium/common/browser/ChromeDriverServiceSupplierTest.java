package com.hribol.bromium.common.browser;

import com.hribol.bromium.common.browsers.ChromeDriverServiceSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.io.IOException;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 10.10.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ChromeDriverServiceSupplier.class)
public class ChromeDriverServiceSupplierTest {

    @Test
    public void canStartDriverService() throws Exception {
        String pathToDriver = "chromedriver";
        String screenToUse = ":1";
        ChromeDriverService.Builder builder = mock(ChromeDriverService.Builder.class, RETURNS_MOCKS);

        ChromeDriverServiceSupplier chromeDriverServiceSupplier = new ChromeDriverServiceSupplier();

        whenNew(ChromeDriverService.Builder.class).withNoArguments().thenReturn(builder);
        chromeDriverServiceSupplier.getDriverService(pathToDriver, screenToUse);

        verify(builder).usingDriverExecutable(eq(new File(pathToDriver)));
    }

}
