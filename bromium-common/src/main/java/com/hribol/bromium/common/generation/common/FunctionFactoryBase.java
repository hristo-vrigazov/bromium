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
 * Represents a base factory for creating generated functions by given information.
 * @param <T> the generated function class
 * @param <V> the information needed to generate the function
 */
public abstract class FunctionFactoryBase<T extends GeneratedFunction, V extends GenerationFunctionInformation>
        implements GeneratedFunctionFactory<T,V> {

    private Map<String, T> typeToGeneratedFunction;
    private Supplier<T> emptyGeneratedFunctionSupplier;
    protected JsCollector jsCollector;

    /**
     * Creates a new base factory for creating generated functions by given information.
     * @param emptyGeneratedFunctionSupplier the supplier of the default generated function
     * @param jsCollector the js collector passed to the generated functions so that they can write into it.
     */
    public FunctionFactoryBase(Supplier<T> emptyGeneratedFunctionSupplier, JsCollector jsCollector) {
        this.emptyGeneratedFunctionSupplier = emptyGeneratedFunctionSupplier;
        this.jsCollector = jsCollector;
        this.typeToGeneratedFunction = new HashMap<>();
        addPredefined();
        addCustom();
    }

    /**
     * A method for adding custom actions
     */
    protected abstract void addCustom();

    /**
     * A method for adding predefind actions (compile-time)
     */
    protected abstract void addPredefined();

    /**
     * {@inheritDoc}
     */
    @Override
    public T create(V generationFunctionInformation) {
        return Optional
                .ofNullable(typeToGeneratedFunction.get(generationFunctionInformation.getKey()))
                .orElse(emptyGeneratedFunctionSupplier.get());
    }

    /**
     * Registers a given type to be dispatched to a given generated function
     * @param webDriverActionType the type to be dispatched
     * @param generatedFunction the generated function to be created
     */
    protected void add(String webDriverActionType, T generatedFunction) {
        typeToGeneratedFunction.put(webDriverActionType, generatedFunction);
    }
}
