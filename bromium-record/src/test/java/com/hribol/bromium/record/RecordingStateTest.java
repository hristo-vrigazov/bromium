package com.hribol.bromium.record;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class RecordingStateTest {

    @Test
    public void maintainsState() {
        Map<String, String> step1 = new HashMap<>();
        step1.put("s", "x");

        RecordingState recordingState = new RecordingState();
        recordingState.storeTestCaseStep(step1);

        assertTrue(recordingState.getTestScenarioSteps().contains(step1));
    }

}
