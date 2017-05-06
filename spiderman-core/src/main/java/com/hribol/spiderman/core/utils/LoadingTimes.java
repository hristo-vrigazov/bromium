package com.hribol.spiderman.core.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * A class for loading times of an execution
 */
public class LoadingTimes {
    private List<Long> loadingTimes;
    private List<String> actions;

    public LoadingTimes(List<Long> loadingTimes, List<String> actions) {
        this.loadingTimes = loadingTimes;
        this.actions = actions;
    }

    /**
     * Writes a csv file with actions and measurements
     * @param file the file in which the data is written
     * @throws FileNotFoundException if the path to file is not valid
     * @throws UnsupportedEncodingException if an unsupported exception is specified
     */
    public void dump(File file) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        dump(writer);
    }

    private void dump(PrintWriter writer) {
        for (int i = 0; i < loadingTimes.size(); i++) {
            double seconds = Utils.toSeconds(loadingTimes.get(i));
            String action = actions.get(i);
            writer.println(action + "," + seconds);
        }
        writer.close();
    }

    /**
     * Writes a csv file with actions and measurements
     * @param fileName the filename in which the data is written
     * @throws FileNotFoundException if the path to file is not valid
     * @throws UnsupportedEncodingException if an unsupported exception is specified
     */
    public void dump(String fileName) throws UnsupportedEncodingException, FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        dump(writer);
    }
}
