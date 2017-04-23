package com.hribol.spiderman.core.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class LoadingTimes {
    private List<Long> loadingTimes;
    private List<String> actions;

    public LoadingTimes(List<Long> loadingTimes, List<String> actions) {
        this.loadingTimes = loadingTimes;
        this.actions = actions;
    }

    public void dump(File file) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        dump(writer);
    }

    private void dump(PrintWriter writer) {
        for (int i = 0; i < loadingTimes.size(); i++) {
            double seconds = ConfigurationUtils.toSeconds(loadingTimes.get(i));
            String action = actions.get(i);
            writer.println(action + "," + seconds);
        }
        writer.close();
    }

    public void dump(String fileName) throws UnsupportedEncodingException, FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        dump(writer);
    }
}
