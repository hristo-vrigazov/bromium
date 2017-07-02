package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GeneratedFunctionFactory;
import com.hribol.bromium.core.generation.GenerationFunctionInformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by hvrigazov on 01.07.17.
 */
public abstract class FunctionFactoryBase<T extends GeneratedFunction, V extends GenerationFunctionInformation>
        implements GeneratedFunctionFactory<T,V> {

    private Map<String, T> typeToGeneratedFunction;
    private Supplier<T> emptyGeneratedFunctionSupplier;
    protected JsCollector jsCollector;

    public FunctionFactoryBase(Supplier<T> emptyGeneratedFunctionSupplier, JsCollector jsCollector) {
        this.emptyGeneratedFunctionSupplier = emptyGeneratedFunctionSupplier;
        this.jsCollector = jsCollector;
        this.typeToGeneratedFunction = new HashMap<>();
        addPredefined();
        addCustom();
    }

    protected abstract void addCustom();
    protected abstract void addPredefined();

    @Override
    public T create(V generationFunctionInformation) {
        return Optional
                .ofNullable(typeToGeneratedFunction.get(generationFunctionInformation.getKey()))
                .orElse(emptyGeneratedFunctionSupplier.get());
    }

    protected void add(String webDriverActionType, T generatedFunction) {
        typeToGeneratedFunction.put(webDriverActionType, generatedFunction);
    }
}
