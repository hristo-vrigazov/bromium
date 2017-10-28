package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 19.07.17.
 */
public class JsonStepsDumperTest {

    @Test
    public void dumpsSteps() throws IOException {
        Map<String, String> testStep = new HashMap<>();
        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        String outputFilename = "tmp.json";
        testScenarioSteps.add(testStep);

        StepsDumper stepsDumper = new JsonStepsDumper();

        stepsDumper.dump(testScenarioSteps, outputFilename);

        File outputFile = new File(outputFilename);
        assertTrue(outputFile.exists());
        assertTrue(outputFile.delete());
    }
}
