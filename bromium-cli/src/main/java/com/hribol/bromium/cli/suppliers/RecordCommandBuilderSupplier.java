package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.RecordCommand;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class RecordCommandBuilderSupplier {
    public RecordCommand.Builder get() {
        return new RecordCommand.Builder();
    }
}
