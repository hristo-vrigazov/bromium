package unit.utils;

import com.hribol.spiderman.core.utils.LoadingTimes;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class LoadingTimesTest {
    @Test
    public void loadingTimesDumpsFile() throws UnsupportedEncodingException, FileNotFoundException {
        List<Long> loadingMeasurements = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        actions.add("INITIAL_LOADING");
        loadingMeasurements.add(756661733L);
        actions.add("CLICK_ON_BUTTON");
        loadingMeasurements.add(750434651L);

        LoadingTimes loadingTimes = new LoadingTimes(loadingMeasurements, actions);
        String pathname = "loadingTimes.csv";
        File file = new File(pathname);

        loadingTimes.dump(file);
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.delete());

        loadingTimes.dump(pathname);
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.delete());
    }
}
