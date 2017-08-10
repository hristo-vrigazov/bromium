package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 10.08.17.
 */
public class RecorderFunctionMocks {
    private JsCollector jsCollector;
    private String expected;
    private String eventName;
    private String cssSelector;
    private NameWebDriverActionConfiguration nameWebDriverActionConfiguration;
    private WebDriverActionConfiguration webDriverActionConfiguration;

    public RecorderFunctionMocks(String expected) throws Exception {
        this.expected = expected;

        cssSelector = "#title";
        eventName = "Event name";

        webDriverActionConfiguration = mock(WebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue()).thenReturn(cssSelector);


        jsCollector = new JsCollector();

        nameWebDriverActionConfiguration = mock(NameWebDriverActionConfiguration.class);
        when(nameWebDriverActionConfiguration.getEventName()).thenReturn(eventName);
        when(nameWebDriverActionConfiguration.getWebDriverActionConfiguration()).thenReturn(webDriverActionConfiguration);
        when(nameWebDriverActionConfiguration.getGenerationFunctionInformation()).thenReturn(webDriverActionConfiguration);
    }

    public JsCollector getJsCollector() {
        return jsCollector;
    }

    public NameWebDriverActionConfiguration getNameWebDriverActionConfiguration() {
        return nameWebDriverActionConfiguration;
    }
}
