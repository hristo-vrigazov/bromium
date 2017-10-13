package com.hribol.bromium.core.generation;

/**
 * Generates javascript code by given generation information
 */
public interface JavascriptGenerator<T extends GenerationInformation> {

    /**
     * Generates javascript code by given generation information
     * @param generationInformation the information needed to generate the code
     * @return the generated code
     */
    String generate(T generationInformation);
}
