package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.suppliers.RecordCommandBuilderSupplier;
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
        ParsedOptions parsedOptions = mock(ParsedOptions.class);
        Map<String, Object> opts = new HashMap<>();

        String pathToDriver = "chromedriver";
        String pathToConfiguration = "config.json";
        String baseUrl = "http://something.com";
        String testCaseFile = "case.json";
        int timeout = 10;
        String browserType = CHROME;

        when(parsedOptions.getPathToDriver()).thenReturn(pathToDriver);
        when(parsedOptions.getPathToApplicationConfiguration()).thenReturn(pathToConfiguration);
        when(parsedOptions.getBaseUrl()).thenReturn(baseUrl);
        when(parsedOptions.getOutputFile()).thenReturn(testCaseFile);
        when(parsedOptions.getBrowserType()).thenReturn(browserType);
        when(parsedOptions.getTimeout()).thenReturn(10);

        RecordBrowserBase recordBrowserBase = mock(RecordBrowserBase.class);
        PromptUtils promptUtils = mock(PromptUtils.class);
        RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToConfiguration)).thenReturn(recordBrowserBase);

        RecordCommand.Builder builder = mock(RecordCommand.Builder.class, RETURNS_DEEP_STUBS);

        RecordCommandBuilderSupplier recordCommandBuilderSupplier = mock(RecordCommandBuilderSupplier.class);
        when(recordCommandBuilderSupplier.get()).thenReturn(builder);

        CommandHandler commandHandler = new RecordCommandHandler(promptUtils,
                recordBrowserFactory,
                recordCommandBuilderSupplier,
                parsedOptions);

        RecordCommand command = mock(RecordCommand.class);

        when(builder
                .pathToDriver(pathToDriver)
                .pathToApplicationConfiguration(pathToConfiguration)
                .baseUrl(baseUrl)
                .outputFile(testCaseFile)
                .browserType(CHROME)
                .timeout(10)
                .recordBrowserFactory(recordBrowserFactory)
                .promptUtils(promptUtils)
                .build()).thenReturn(command);


        commandHandler.handle(opts);

        verify(command).run();
    }
}
