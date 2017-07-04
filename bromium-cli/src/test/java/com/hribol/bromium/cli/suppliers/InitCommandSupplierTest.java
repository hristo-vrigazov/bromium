package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.core.suppliers.ApplicationConfigurationSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 04.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(InitCommandSupplier.class)
public class InitCommandSupplierTest {

    @Test
    public void createsCorrectInstance() throws Exception {
        PromptUtils promptUtils = mock(PromptUtils.class);
        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);
        ApplicationConfigurationSupplier applicationConfigurationSupplier = mock(ApplicationConfigurationSupplier.class);

        InitCommand expected = mock(InitCommand.class);

        PowerMockito.whenNew(InitCommand.class)
                .withArguments(promptUtils, applicationConfigurationDumper, applicationConfigurationSupplier)
                .thenReturn(expected);

        InitCommandSupplier initCommandSupplier = new InitCommandSupplier();
        InitCommand actual = initCommandSupplier.get(promptUtils, applicationConfigurationDumper, applicationConfigurationSupplier);

        assertEquals(expected, actual);
    }

}
