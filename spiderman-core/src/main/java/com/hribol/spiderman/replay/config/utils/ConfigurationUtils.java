package com.hribol.spiderman.replay.config.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.spiderman.replay.config.config.ApplicationConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Utilities for reading {@link ApplicationConfiguration}
 */
public class ConfigurationUtils {

    /**
     * Creates an {@link ApplicationConfiguration} by a given file
     * @param file the file in which the configuration is written
     * @return the {@link ApplicationConfiguration}
     * @throws IOException if there is a problem when reading from file
     */
    public static ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return parseApplicationConfiguration(fileInputStream);
    }

    public static ApplicationConfiguration parseApplicationConfiguration(InputStream inputStream) throws IOException {
        Gson gson = new GsonBuilder().create();
        String configuration = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(configuration, ApplicationConfiguration.class);
    }

    public static ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return parseApplicationConfiguration(new File(filename));
    }

    public static void dumpApplicationConfiguration(ApplicationConfiguration applicationConfiguration, String outputFilename) throws IOException {
        Writer writer = new FileWriter(outputFilename);
        Gson gson = new GsonBuilder().create();
        gson.toJson(applicationConfiguration, writer);
        writer.close();
    }

    public static List<Map<String, String>> readSteps(String pathToSerializedTest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathToSerializedTest);
        return readSteps(fileInputStream);
    }

    public static List<Map<String, String>> readSteps(InputStream inputStream) throws IOException {
        String stepsRaw = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(stepsRaw, List.class);
    }

    public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
        Map<String, String> queryPairs = new LinkedHashMap<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            queryPairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }
        return queryPairs;
    }
}
