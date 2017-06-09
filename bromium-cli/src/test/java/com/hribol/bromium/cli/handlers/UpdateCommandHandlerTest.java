package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;
import com.hribol.bromium.cli.suppliers.UpdateCommandSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class UpdateCommandHandlerTest {

    @Test
    public void updateCommandIsRun() throws Exception {
        String pathToConfigurationFile = "configuration.json";

        Map<String, Object> opts = new HashMap<>();

        opts.put(OptUtils.APPLICATION, pathToConfigurationFile);

        PromptUtils promptUtils = mock(PromptUtils.class);
        UpdateCommand command = mock(UpdateCommand.class);
        UpdateCommandSupplier updateCommandSupplier = mock(UpdateCommandSupplier.class);
        when(updateCommandSupplier.get(pathToConfigurationFile, promptUtils)).thenReturn(command);

        CommandHandler commandHandler = new UpdateCommandHandler(promptUtils, updateCommandSupplier);
        commandHandler.handle(opts);

        verify(command).run();
    }
}
