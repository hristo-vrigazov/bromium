package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class InitCommandSupplier {
    public InitCommand get(PromptUtils promptUtils) {
        return new InitCommand(promptUtils);
    }
}
