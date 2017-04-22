package com.hribol.automation.core.record;

import com.hribol.automation.core.record.filters.RecordRequestFilter;
import com.hribol.automation.core.record.filters.RecordResponseFilter;
import com.hribol.automation.core.record.settings.ChromeRecordSettings;
import com.hribol.automation.core.record.settings.RecordSettings;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver, String pathToJsInjectionFile) {
        super(pathToChromeDriver, pathToJsInjectionFile);
    }

    @Override
    protected RecordSettings createExecutionSettings() {
        Supplier<String> injectionCodeSupplier = () -> javascriptInjector.getInjectionCode();
        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(baseURI, injectionCodeSupplier);
        RecordRequestFilter recordRequestFilter = new RecordRequestFilter(domainSpecificActionList);
        return new ChromeRecordSettings(this.baseURI.toString(), recordRequestFilter, recordResponseFilter);
    }

    @Override
    protected String getSystemProperty() {
        return "webdriver.chrome.driver";
    }
}
