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
 * Parses an {@link ApplicationConfiguration}
 */
public class JsonApplicationConfigurationParser {

    /**
     * Parses an {@link ApplicationConfiguration} from a file. The {@link FileInputStream} that is created
     * is always closed after this method, regardless of whether the reading fails.
     * @param file the file from which we should read the configuration
     * @return the parsed configuration
     * @throws IOException
     */
    public ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            return parseApplicationConfiguration(fileInputStream);
        }
    }

    /**
     * Parses an {@link ApplicationConfiguration} from an input stream. Does not close the input stream
     * @param inputStream the input stream
     * @return the parsed application configuration
     * @throws IOException
     */
    public ApplicationConfiguration parseApplicationConfiguration(InputStream inputStream) throws IOException {
        Gson gson = new GsonBuilder().create();
        String configuration = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(configuration, ApplicationConfiguration.class);
    }

    /**
     * Parses an {@link ApplicationConfiguration} from an filename.
     * @param filename the input filename
     * @return the parsed application configuration
     * @throws IOException
     */
    public ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return parseApplicationConfiguration(new File(filename));
    }
}
