package com.hribol.bromium.core.providers;

import com.google.inject.throwingproviders.CheckedProvider;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Guice provider that can throw either {@link IOException} or {@link URISyntaxException}
 */
public interface IOURIProvider<T> extends CheckedProvider<T> {
    @Override
    T get() throws IOException, URISyntaxException;
}
