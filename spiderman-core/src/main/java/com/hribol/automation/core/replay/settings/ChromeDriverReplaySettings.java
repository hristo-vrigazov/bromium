package com.hribol.automation.core.replay.settings;

import com.google.common.collect.ImmutableMap;
import com.hribol.automation.core.suppliers.InvisibleChromeDriverSupplier;
import com.hribol.automation.core.suppliers.VisibleChromeDriverSupplier;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverReplaySettings extends ReplaySettingsBase<ChromeDriverService> {

    public ChromeDriverReplaySettings(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(baseURI,
                requestFilter,
                responseFilter,
                new InvisibleChromeDriverSupplier(),
                new VisibleChromeDriverSupplier());
    }

    @Override
    public ChromeDriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        return new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY", screenToUse))
                .build();
    }

}
