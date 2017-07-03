package com.hribol.bromium.cli.handlers;


import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.suppliers.InitCommandSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class InitCommandHandlerTest {

    @Test
    public void initCommandIsCreatedAndRan() throws Exception {
        Map<String, Object> opts = new HashMap<>();

        PromptUtils promptUtils = mock(PromptUtils.class);
        InitCommand initCommand = mock(InitCommand.class);
        InitCommandSupplier initCommandSupplier = mock(InitCommandSupplier.class);
        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        when(initCommandSupplier.get(promptUtils, applicationConfigurationDumper)).thenReturn(initCommand);

        InitCommandHandler initCommandHandler = new InitCommandHandler(promptUtils, initCommandSupplier, applicationConfigurationDumper);

        initCommandHandler.handle(opts);

        verify(initCommandSupplier).get(promptUtils, applicationConfigurationDumper);
        verify(initCommand).run();
    }
}
