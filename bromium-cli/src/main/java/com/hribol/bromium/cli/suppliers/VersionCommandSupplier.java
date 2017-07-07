package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.VersionCommand;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class VersionCommandSupplier {
    public Command get(String pathToApplicationConfiguration,
                       PromptUtils promptUtils,
                       ApplicationConfigurationParser applicationConfigurationParser,
                       ApplicationConfigurationDumper applicationConfigurationDumper) {
        return new VersionCommand(pathToApplicationConfiguration, promptUtils, applicationConfigurationParser, applicationConfigurationDumper);
    }
}
