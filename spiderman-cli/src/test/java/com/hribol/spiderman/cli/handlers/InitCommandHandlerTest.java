package com.hribol.spiderman.cli.handlers;


import com.hribol.spiderman.cli.commands.InitCommand;
import com.hribol.spiderman.cli.commands.PromptUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.verifyNew;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        InitCommandHandler.class,
        InitCommand.class,
        PromptUtils.class
})
public class InitCommandHandlerTest {

    @Test
    public void initCommandIsCreatedAndRan() throws Exception {
        Map<String, Object> opts = new HashMap<>();
        InitCommandHandler initCommandHandler = new InitCommandHandler();

        PromptUtils promptUtils = mock(PromptUtils.class);
        InitCommand initCommand = mock(InitCommand.class);

        whenNew(PromptUtils.class).withNoArguments().thenReturn(promptUtils);
        whenNew(InitCommand.class).withArguments(promptUtils).thenReturn(initCommand);

        initCommandHandler.handle(opts);

        verifyNew(InitCommand.class).withArguments(promptUtils);
        verify(initCommand).run();
    }
}
