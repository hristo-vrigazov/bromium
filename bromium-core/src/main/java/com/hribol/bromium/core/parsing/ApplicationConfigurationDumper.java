package com.hribol.bromium.core.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.config.ApplicationConfiguration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Dumps an {@link ApplicationConfiguration} into a file
 */
public class ApplicationConfigurationDumper {

    /**
     * Writes an application configuration to a file
     * @param applicationConfiguration the configuration that should be serialized
     * @param outputFilename the file to which the configuration should be outputted
     * @throws IOException if an exception happens while writing to the file
     */
    public void dumpApplicationConfiguration(ApplicationConfiguration applicationConfiguration, String outputFilename) throws IOException {
        Writer writer = new FileWriter(outputFilename);
        Gson gson = new GsonBuilder().create();
        gson.toJson(applicationConfiguration, writer);
        writer.close();
    }
}
