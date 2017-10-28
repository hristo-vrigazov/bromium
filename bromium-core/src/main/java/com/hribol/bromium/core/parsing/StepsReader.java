package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.TestScenarioSteps;

import java.io.IOException;
import java.io.InputStream;

/**
 * Reads {@link TestScenarioSteps} from a given {@link InputStream}
 */
public interface StepsReader {

    /**
     * Reads {@link TestScenarioSteps} from a given {@link InputStream}
     * @param inputStream the input stream that will be used
     * @return the steps
     * @throws IOException
     */
    TestScenarioSteps readSteps(InputStream inputStream) throws IOException;

}
