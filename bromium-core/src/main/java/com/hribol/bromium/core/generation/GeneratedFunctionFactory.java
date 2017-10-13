package com.hribol.bromium.core.generation;

/**
 * Represents a factory which creates subclasses of {@link GeneratedFunction} by given information for the generation,
 * that is, an instances of subclasses of {@link GenerationFunctionInformation}
 */
public interface GeneratedFunctionFactory<T extends GeneratedFunction, V extends GenerationFunctionInformation> {

    /**
     * Creates generated functions by given generation function information
     * @param generationFunctionInformation - the information needed for generation
     * @return the generated function
     */
    T create(V generationFunctionInformation);
}
