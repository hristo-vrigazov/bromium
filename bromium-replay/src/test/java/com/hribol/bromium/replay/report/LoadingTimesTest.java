package com.hribol.bromium.replay.report;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class LoadingTimesTest {

    private String pathname = "loadingTimes.csv";
    File file = new File(pathname);

    @Test
    public void loadingTimesDumpsFile() throws UnsupportedEncodingException, FileNotFoundException {
        List<Long> loadingMeasurements = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        List<Date> actionTimestamps = new ArrayList<>();

        actions.add("INITIAL_LOADING");
        loadingMeasurements.add(756661733L);
        actions.add("CLICK_ON_BUTTON");
        loadingMeasurements.add(750434651L);
        actionTimestamps.add(new Date());
        actionTimestamps.add(new Date());
        actionTimestamps.add(new Date());

        LoadingTimes loadingTimes = new LoadingTimes(actions, loadingMeasurements, actionTimestamps);

        loadingTimes.dump(file);
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.delete());

        loadingTimes.dump(pathname);
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.delete());
    }

    @Test
    public void emptyLoadingTimesDoNotDumpAnything() throws UnsupportedEncodingException, FileNotFoundException {
        LoadingTimes loadingTimes = LoadingTimes.empty();

        loadingTimes.dump(file);
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.delete());
    }
}
