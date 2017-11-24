package com.hribol.bromium.common.browser;

import com.hribol.bromium.common.browsers.DriverServiceSupplierBase;
import org.junit.Test;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 10.10.17.
 */
public class DriverServiceSupplierBaseTest {

    private String driverExecutableFileName = "driver";
    private String screenToUse = ":1";
    private File driverExecutableFile = new File(driverExecutableFileName);

    @Test
    public void invokesTheCorrectMethodsOfTheBuilder() throws IOException {
        DriverService.Builder builder = mock(DriverService.Builder.class, RETURNS_DEEP_STUBS);

        DriverServiceSupplierBase driverServiceSupplierBase = new DriverServiceSupplierBase() {
            @Override
            protected DriverService.Builder getBuilder() {
                return builder;
            }
        };

        DriverService driverService = driverServiceSupplierBase.getDriverService(driverExecutableFileName, screenToUse);

        verify(builder).usingDriverExecutable(eq(driverExecutableFile));
    }

}
