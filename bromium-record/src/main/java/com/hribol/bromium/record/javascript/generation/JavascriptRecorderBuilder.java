package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 07.06.17.
 */
public interface JavascriptRecorderBuilder {
    boolean isActionWithTheSameTypeIncluded(WebDriverActionConfiguration webDriverActionConfiguration);

    String getRecordingCodeForType(WebDriverActionConfiguration webDriverActionConfiguration);

    void registerRecordingType(WebDriverActionConfiguration webDriverActionConfiguration);

    String getInvocationCodeForType(WebDriverActionConfiguration webDriverActionConfiguration);

    void registerInvocationOfRecordingType(WebDriverActionConfiguration webDriverActionConfiguration);
}
