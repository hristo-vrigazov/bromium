package com.hribol.bromium.cli.factory;

import com.hribol.spiderman.replay.config.utils.JavascriptInjector;
import com.hribol.spiderman.record.RecordBrowserBase;

import java.io.IOException;

/**
 * Created by hvrigazov on 28.04.17.
 */
public interface RecordBrowserSupplier {
    RecordBrowserBase get(String pathToChromeDriver, JavascriptInjector javascriptInjector) throws IOException;
}
