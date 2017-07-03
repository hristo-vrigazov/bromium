package com.hribol.bromium.core.utils.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.config.ApplicationConfiguration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class ApplicationConfigurationDumper {

    public void dumpApplicationConfiguration(ApplicationConfiguration applicationConfiguration, String outputFilename) throws IOException {
        Writer writer = new FileWriter(outputFilename);
        Gson gson = new GsonBuilder().create();
        gson.toJson(applicationConfiguration, writer);
        writer.close();
    }
}
