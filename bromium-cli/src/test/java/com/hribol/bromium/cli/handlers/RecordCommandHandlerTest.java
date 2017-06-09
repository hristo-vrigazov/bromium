package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.suppliers.RecordCommandSupplier;
import com.hribol.bromium.common.record.RecordBrowserBase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class RecordCommandHandlerTest {
    @Test
    public void recordCommandHandlerIsRan() throws Exception {
        Map<String, Object> opts = new HashMap<>();

        String pathToDriver = "chromedriver";
        String pathToConfiguration = "config.json";
        String baseUrl = "http://something.com";
        String testCaseFile = "case.json";
        String timeout = "10";

        opts.put(OptUtils.DRIVER, pathToDriver);
        opts.put(OptUtils.APPLICATION, pathToConfiguration);
        opts.put(OptUtils.URL, baseUrl);
        opts.put(OptUtils.OUTPUT, testCaseFile);
        opts.put(OptUtils.BROWSER, CHROME);
        opts.put(OptUtils.TIMEOUT, timeout);

        RecordBrowserBase recordBrowserBase = mock(RecordBrowserBase.class);
        PromptUtils promptUtils = mock(PromptUtils.class);
        RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToConfiguration)).thenReturn(recordBrowserBase);

        RecordCommandSupplier recordCommandSupplier = mock(RecordCommandSupplier.class);

        CommandHandler commandHandler = new RecordCommandHandler(promptUtils, recordBrowserFactory, recordCommandSupplier);

        RecordCommand command = mock(RecordCommand.class);
        when(recordCommandSupplier.get(pathToDriver, pathToConfiguration, baseUrl, testCaseFile,
                Integer.parseInt(timeout), CHROME, recordBrowserFactory, promptUtils)).thenReturn(command);

        commandHandler.handle(opts);

        verify(command).run();
    }
}
