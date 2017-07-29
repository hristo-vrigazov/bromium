package com.hribol.bromium.core.utils.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class StepsReaderTest {

    @Test
    public void readsStepsFromInputStream() throws IOException {
        InputStream testCaseInputStream = getClass().getResourceAsStream("/testCase.json");
        StepsReader stepsReader = new StepsReader();
        TestScenarioSteps steps = stepsReader.readSteps(testCaseInputStream);

        Map<String, String> firstStep = steps.get(0);
        assertEquals(firstStep.get(EVENT), "Load initial page");
    }
}
