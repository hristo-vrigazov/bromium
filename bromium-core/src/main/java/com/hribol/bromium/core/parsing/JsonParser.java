package com.hribol.bromium.core.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonParser implements ApplicationConfigurationParser {

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            return parseApplicationConfiguration(fileInputStream);
        }
    }

    private ApplicationConfiguration parseApplicationConfiguration(InputStream inputStream) throws IOException {
        Gson gson = new GsonBuilder().create();
        String configuration = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(configuration, ApplicationConfiguration.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return parseApplicationConfiguration(new File(filename));
    }
}
