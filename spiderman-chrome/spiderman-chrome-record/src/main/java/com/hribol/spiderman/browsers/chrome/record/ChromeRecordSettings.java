package com.hribol.spiderman.browsers.chrome.record;

import com.hribol.spiderman.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.spiderman.record.settings.RecordSettingsBase;
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
