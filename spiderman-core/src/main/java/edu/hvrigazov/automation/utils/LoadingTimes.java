package edu.hvrigazov.automation.utils;

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

    public void dump(String fileName) throws UnsupportedEncodingException, FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");

        for (int i = 1; i < loadingTimes.size(); i++) {
            double seconds = ConfigurationUtils.toSeconds(loadingTimes.get(i));
            String action = actions.get(i - 1);
            writer.println(action + "," + seconds);
        }
        writer.close();
    }
}
