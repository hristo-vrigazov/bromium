package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
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
        RecordCommandHandler.class,
        RecordCommand.class,
        PromptUtils.class
})
public class RecordCommandHandlerTest {
    @Test
    public void recordCommandHandlerIsRan() throws Exception {
        Map<String, Object> opts = new HashMap<>();

        opts.put(OptUtils.DRIVER, "chromedriver");
        opts.put(OptUtils.JS, "ico.js");
        opts.put(OptUtils.URL, "http://something.com");
        opts.put(OptUtils.OUTPUT, "case.json");
        opts.put(OptUtils.BROWSER, CHROME);
        opts.put(OptUtils.TIMEOUT, "10");

        CommandHandler commandHandler = new RecordCommandHandler();

        PromptUtils promptUtils = mock(PromptUtils.class);
        RecordCommand command = mock(RecordCommand.class);

        whenNew(PromptUtils.class).withNoArguments().thenReturn(promptUtils);
        whenNew(RecordCommand.class).withAnyArguments().thenReturn(command);

        commandHandler.handle(opts);

        verify(command).run();
    }
}
