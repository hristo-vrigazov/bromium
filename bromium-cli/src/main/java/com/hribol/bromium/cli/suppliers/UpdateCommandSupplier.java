package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class UpdateCommandSupplier {
    public UpdateCommand get(String pathToApplicationConfiguration, PromptUtils promptUtils) {
        return new UpdateCommand(pathToApplicationConfiguration, promptUtils);
    }
}
