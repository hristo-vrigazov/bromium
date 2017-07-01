package com.hribol.bromium.core.generation;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface JavascriptGenerator<T extends GenerationInformation> {
    String generate(T generationInformation);
}
