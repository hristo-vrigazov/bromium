package com.hribol.bromium.browsers.chrome.replay;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.browsers.chrome.base.InvisibleChromeDriverSupplier;
import com.hribol.bromium.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.bromium.common.replay.ReplayManagerBase;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverReplayManager extends ReplayManagerBase<ChromeDriverService> {


    public ChromeDriverReplayManager(RequestFilter requestFilter,
                                     ResponseFilter responseFilter,
                                     int timeout,
                                     String screenToUse) {
        super(requestFilter,
                responseFilter,
                new InvisibleChromeDriverSupplier(),
                new VisibleChromeDriverSupplier(),
                timeout,
                screenToUse);
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
