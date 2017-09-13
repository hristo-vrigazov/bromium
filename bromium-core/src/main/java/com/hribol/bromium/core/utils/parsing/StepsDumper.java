package com.hribol.bromium.core.utils.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.bromium.core.TestScenarioSteps;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Dumps recorded {@link TestScenarioSteps}
 */
public class StepsDumper {

    public void dump(TestScenarioSteps testScenarioSteps, String outputFile) throws IOException {
        Writer writer = new FileWriter(outputFile);
        Gson gson = new GsonBuilder().create();
        gson.toJson(testScenarioSteps, writer);
        writer.close();
    }

}
