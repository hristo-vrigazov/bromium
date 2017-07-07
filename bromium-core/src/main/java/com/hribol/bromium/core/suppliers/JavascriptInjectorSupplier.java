package com.hribol.bromium.core.suppliers;

import com.hribol.bromium.core.utils.JavascriptInjector;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class JavascriptInjectorSupplier {
    public JavascriptInjector get(Reader reader) throws IOException {
        return new JavascriptInjector(reader);
    }
}
