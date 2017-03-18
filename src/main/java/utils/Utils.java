package utils;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import config.ApplicationConfiguration;

import java.io.File;
import java.io.IOException;
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

    public static List<Map<String, String>> readSteps(String pathToSerializedTest) throws IOException {
        Gson gson = new GsonBuilder().create();
        String testCase = Files.toString(new File(pathToSerializedTest), Charsets.UTF_8);
        return gson.fromJson(testCase, List.class);
    }
}
