package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.VersionCommand;
import com.hribol.bromium.cli.suppliers.VersionCommandSupplier;
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
public class VersionCommandHandlerTest {

    @Test
    public void versionCommandHandlerIsRan() throws Exception {
        String pathToApplicationConfiguration = "configuration.json";
        Map<String, Object> opts = new HashMap<>();

        opts.put(OptUtils.APPLICATION, pathToApplicationConfiguration);

        PromptUtils promptUtils = mock(PromptUtils.class);
        VersionCommand command = mock(VersionCommand.class);
        VersionCommandSupplier versionCommandSupplier = mock(VersionCommandSupplier.class);
        when(versionCommandSupplier.get(pathToApplicationConfiguration, promptUtils)).thenReturn(command);

        CommandHandler commandHandler = new VersionCommandHandler(promptUtils, versionCommandSupplier);
        commandHandler.handle(opts);

        verify(command).run();
    }

}
