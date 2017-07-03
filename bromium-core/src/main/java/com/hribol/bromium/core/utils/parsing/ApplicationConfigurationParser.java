package com.hribol.bromium.core.utils.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class ApplicationConfigurationParser {

    public ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return parseApplicationConfiguration(fileInputStream);
    }

    public ApplicationConfiguration parseApplicationConfiguration(InputStream inputStream) throws IOException {
        Gson gson = new GsonBuilder().create();
        String configuration = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(configuration, ApplicationConfiguration.class);
    }

    public ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return parseApplicationConfiguration(new File(filename));
    }
}
