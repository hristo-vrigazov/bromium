package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GeneratedInvocation;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.io.IOException;

public interface JsFunctionProvider <
        T extends GenerationInformation,
        V extends GeneratedInvocation,
        R extends GeneratedFunction<T, V>
        > {
    R get(String jsFunctionName) throws IOException;
}
