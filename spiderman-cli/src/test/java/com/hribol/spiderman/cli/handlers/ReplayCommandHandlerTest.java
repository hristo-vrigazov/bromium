package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.RecordCommand;
import com.hribol.spiderman.cli.commands.ReplayCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayCommandHandler.class,
        ReplayCommand.class,
        PromptUtils.class
})
public class ReplayCommandHandlerTest {
    @Test
    public void replayCommandHandlerIsRan() throws Exception {
        /**
         *
         String pathToDriver = getPathToDriver(opts);
         String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
         String pathToSerializedTest = getPathToTestCase(opts);
         String csvMeasurementsFileName = getMeasurementsFile(opts);
         int timeout = getTimeout(opts);
         int measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
         String baseURI = getBaseUrl(opts);
         String browserType = getBrowserType(opts);
         */

        Map<String, Object> opts = new HashMap<>();

        opts.put(OptUtils.DRIVER, "chromedriver");
        opts.put(OptUtils.APPLICATION, "configuration.json");
        opts.put(OptUtils.CASE, "case.json");
        opts.put(OptUtils.MEASUREMENTS, "measurements.csv");
        opts.put(OptUtils.PRECISION, "500");
        opts.put(OptUtils.BROWSER, CHROME);
        opts.put(OptUtils.TIMEOUT, "10");
        opts.put(OptUtils.URL, "http://tenniskafe.com");

        CommandHandler commandHandler = new ReplayCommandHandler();

        PromptUtils promptUtils = mock(PromptUtils.class);
        ReplayCommand command = mock(ReplayCommand.class);

        whenNew(PromptUtils.class).withNoArguments().thenReturn(promptUtils);
        whenNew(ReplayCommand.class).withAnyArguments().thenReturn(command);

        commandHandler.handle(opts);

        verify(command).run();
    }
}
