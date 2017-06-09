package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.VersionCommand;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class VersionCommandSupplier {
    public Command get(String pathToApplicationConfiguration, PromptUtils promptUtils) {
        return new VersionCommand(pathToApplicationConfiguration, promptUtils);
    }
}
