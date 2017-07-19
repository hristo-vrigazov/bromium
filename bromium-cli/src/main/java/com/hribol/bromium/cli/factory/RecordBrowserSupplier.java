package com.hribol.bromium.cli.factory;

import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.common.record.RecordBrowserBase;

import java.io.IOException;

/**
 * Created by hvrigazov on 28.04.17.
 */
public interface RecordBrowserSupplier {
    RecordBrowserBase get(String pathToChromeDriver,
                          JavascriptInjector javascriptInjector,
                          int timeout,
                          String baseUrl) throws IOException;
}
