package test.chrome.replay;

import com.hribol.bromium.browsers.chrome.replay.ChromeDriverReplaySettings;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.service.DriverService;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        DriverService.Builder.class,
        ChromeDriverService.Builder.class,
        DriverService.class,
        ChromeDriverService.class,
        ChromeDriverReplaySettings.class
})
public class ChromeDriverReplaySettingsTest {

    @Test
    public void createsDriverService() throws Exception {
        String pathToExecutable = "chromedriver";
        String screenToUse = ":1";
        File executableFile = new File(pathToExecutable);
        RequestFilter requestFilter = mock(RequestFilter.class);
        ResponseFilter responseFilter = mock(ResponseFilter.class);
        ChromeDriverReplaySettings chromeDriverReplaySettings = new ChromeDriverReplaySettings(requestFilter, responseFilter);

        ChromeDriverService expected = mock(ChromeDriverService.class);

        ChromeDriverService.Builder builder = mock(ChromeDriverService.Builder.class);
        when(builder.usingDriverExecutable(executableFile)).thenReturn(builder);
        when(builder.usingAnyFreePort()).thenReturn(builder);
        when(builder.withEnvironment(anyMap())).thenReturn(builder);
        when(builder.build()).thenReturn(expected);

        whenNew(ChromeDriverService.Builder.class).withNoArguments().thenReturn(builder);

        ChromeDriverService actual = chromeDriverReplaySettings.getDriverService(pathToExecutable, screenToUse);

        assertEquals(expected, actual);
    }
}
