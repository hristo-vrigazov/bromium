package com.hribol.spiderman.record.settings;

import com.hribol.spiderman.core.suppliers.VisibleChromeDriverSupplier;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ChromeRecordSettings extends RecordSettingsBase {
    public ChromeRecordSettings(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(baseURI, requestFilter, responseFilter, new VisibleChromeDriverSupplier());
    }

}
