package com.hribol.bromium.core.providers;

import com.google.inject.throwingproviders.CheckedProvider;

import java.io.IOException;

/**
 * Created by hvrigazov on 08.07.17.
 */
public interface IOProvider<T> extends CheckedProvider<T> {
    @Override
    T get() throws IOException;
}
