package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.config.ApplicationConfiguration;

import java.io.IOException;

/**
 * Created by hvrigazov on 18.11.17.
 */
public interface ApplicationConfigurationDumper {

    /**
     * Writes an application configuration to a file
     * @param applicationConfiguration the configuration that should be serialized
     * @param outputFilename the file to which the configuration should be outputted
     * @throws IOException if an exception happens while writing to the file
     */
    void dumpApplicationConfiguration(ApplicationConfiguration applicationConfiguration, String outputFilename) throws IOException;
}
