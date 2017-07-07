package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;
import com.hribol.bromium.cli.suppliers.UpdateCommandSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.junit.Test;

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
        ApplicationConfigurationParser applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        UpdateCommandSupplier updateCommandSupplier = mock(UpdateCommandSupplier.class);
        when(updateCommandSupplier.get(pathToConfigurationFile, promptUtils,
                applicationConfigurationParser, applicationConfigurationDumper)).thenReturn(command);

        CommandHandler commandHandler = new UpdateCommandHandler(promptUtils, updateCommandSupplier, applicationConfigurationParser, applicationConfigurationDumper);
        commandHandler.handle(opts);

        verify(command).run();
    }
}
