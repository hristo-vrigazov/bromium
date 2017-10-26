package com.hribol.bromium.core.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.TestScenarioSteps;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads {@link TestScenarioSteps} from a given {@link InputStream}
 */
public class StepsReader {

    /**
     * Reads {@link TestScenarioSteps} from a given {@link InputStream}
     * @param inputStream the input stream that will be used
     * @return the steps
     * @throws IOException
     */
    public TestScenarioSteps readSteps(InputStream inputStream) throws IOException {
        String stepsRaw = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(stepsRaw, TestScenarioSteps.class);
    }
}
