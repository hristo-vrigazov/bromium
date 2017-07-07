package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.ReplayCommand;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class ReplayCommandBuilderSupplier {
    public ReplayCommand.Builder get() {
        return new ReplayCommand.Builder();
    }
}
