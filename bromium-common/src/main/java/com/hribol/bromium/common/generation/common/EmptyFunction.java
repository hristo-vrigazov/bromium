package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GeneratedInvocation;
import com.hribol.bromium.core.generation.GenerationInformation;

/**
 * Represents an empty function. Used as a default when generating javascript
 */
public class EmptyFunction implements GeneratedFunction {
    @Override
    public String getJavascriptCode() {
        return "";
    }

    @Override
    public GeneratedInvocation getInvocation(GenerationInformation generationInformation) {
        return new EmptyInvocation();
    }
}
