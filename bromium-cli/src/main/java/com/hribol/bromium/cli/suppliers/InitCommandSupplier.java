package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.core.suppliers.ApplicationConfigurationSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class InitCommandSupplier {
    public InitCommand get(PromptUtils promptUtils,
                           ApplicationConfigurationDumper applicationConfigurationDumper,
                           ApplicationConfigurationSupplier applicationConfigurationSupplier) {
        return new InitCommand(promptUtils, applicationConfigurationDumper, applicationConfigurationSupplier);
    }
}
