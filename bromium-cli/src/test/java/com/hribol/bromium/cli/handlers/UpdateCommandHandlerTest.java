package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        UpdateCommandHandler.class,
        UpdateCommand.class,
        PromptUtils.class
})
public class UpdateCommandHandlerTest {

    @Test
    public void updateCommandIsRun() throws Exception {
        Map<String, Object> opts = new HashMap<>();

        opts.put(OptUtils.APPLICATION, "configuration.json");

        CommandHandler commandHandler = new UpdateCommandHandler();

        PromptUtils promptUtils = mock(PromptUtils.class);
        UpdateCommand command = mock(UpdateCommand.class);

        whenNew(PromptUtils.class).withNoArguments().thenReturn(promptUtils);
        whenNew(UpdateCommand.class).withAnyArguments().thenReturn(command);

        commandHandler.handle(opts);

        verify(command).run();
    }
}
