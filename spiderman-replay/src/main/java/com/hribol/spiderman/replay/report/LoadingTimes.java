package com.hribol.spiderman.replay.report;

import com.hribol.spiderman.replay.config.utils.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A class for loading times of an execution
 */
public class LoadingTimes {
    private List<Long> waitingTimes;
    private List<Date> actionTimestamps;
    private List<String> actions;
    private SimpleDateFormat simpleDateFormat;

    public static LoadingTimes empty() {
        return new LoadingTimes(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public LoadingTimes(List<String> actions, List<Long> waitingTimes, List<Date> actionTimestamps) {
        this.waitingTimes = waitingTimes;
        this.actions = actions;
        this.actionTimestamps = actionTimestamps;
        this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
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
        writer.println(simpleDateFormat.format(actionTimestamps.get(0)) + ",START,0");

        for (int i = 0; i < waitingTimes.size(); i++) {
            double seconds = Utils.toSeconds(waitingTimes.get(i));
            String action = actions.get(i);
            Date date = actionTimestamps.get(i + 1);
            String dateAsString = simpleDateFormat.format(date);
            writer.println(dateAsString + "," + action + "," + seconds);
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
