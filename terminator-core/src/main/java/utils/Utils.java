package utils;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import config.ApplicationConfiguration;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 16.03.17.
 */
public class Utils {
    public static double toSeconds(long nanoseconds) {
        return nanoseconds / 1000000000.0;
    }

    public static ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        Gson gson = new GsonBuilder().create();
        String configuration = Files.toString(file, Charsets.UTF_8);
        ApplicationConfiguration applicationConfiguration = gson.fromJson(configuration, ApplicationConfiguration.class);
        return applicationConfiguration;
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
        Gson gson = new GsonBuilder().create();
        String testCase = Files.toString(new File(pathToSerializedTest), Charsets.UTF_8);
        return gson.fromJson(testCase, List.class);
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
