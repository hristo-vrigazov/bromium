package com.hribol.bromium.core.providers;

import com.google.inject.throwingproviders.CheckedProvider;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 08.07.17.
 */
public interface IOURIProvider<T> extends CheckedProvider<T> {
    @Override
    T get() throws IOException, URISyntaxException;
}
