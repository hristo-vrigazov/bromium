package com.hribol.bromium.core.providers;

import com.google.inject.throwingproviders.CheckedProvider;

import java.io.IOException;

/**
 * Guice provider that can throw {@link IOException}
 */
public interface IOProvider<T> extends CheckedProvider<T> {
    @Override
    T get() throws IOException;
}
