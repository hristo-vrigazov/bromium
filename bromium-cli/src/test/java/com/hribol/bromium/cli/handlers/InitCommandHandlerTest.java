package com.hribol.bromium.cli.handlers;


import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.suppliers.InitCommandSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyNew;
import static org.powermock.api.mockito.PowerMockito.whenNew;

public class InitCommandHandlerTest {

    @Test
    public void initCommandIsCreatedAndRan() throws Exception {
        Map<String, Object> opts = new HashMap<>();

        PromptUtils promptUtils = mock(PromptUtils.class);
        InitCommand initCommand = mock(InitCommand.class);
        InitCommandSupplier initCommandSupplier = mock(InitCommandSupplier.class);
        when(initCommandSupplier.get(promptUtils)).thenReturn(initCommand);

        InitCommandHandler initCommandHandler = new InitCommandHandler(promptUtils, initCommandSupplier);

        initCommandHandler.handle(opts);

        verify(initCommandSupplier).get(promptUtils);
        verify(initCommand).run();
    }
}
