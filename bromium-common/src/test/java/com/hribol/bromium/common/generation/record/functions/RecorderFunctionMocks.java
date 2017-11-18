package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 10.08.17.
 */
public class RecorderFunctionMocks {
    private JsCollector jsCollector;
    private String eventName;
    private String textAlias;
    private String initialCollectorClass;

    public String getEventName() {
        return eventName;
    }

    public String getCssSelector() {
        return cssSelector;
    }

    public WebDriverActionConfiguration getWebDriverActionConfiguration() {
        return webDriverActionConfiguration;
    }

    private String cssSelector;
    private NameWebDriverActionConfiguration nameWebDriverActionConfiguration;
    private WebDriverActionConfiguration webDriverActionConfiguration;

    public RecorderFunctionMocks() throws Exception {
        cssSelector = "#title";
        eventName = "Event name";
        textAlias = "text-alias";
        initialCollectorClass = "a-button";

        webDriverActionConfiguration = mock(WebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue()).thenReturn(cssSelector);

        when(webDriverActionConfiguration
                .getParametersConfiguration()
                .get(TEXT)
                .getAlias()).thenReturn(textAlias);

        when(webDriverActionConfiguration
                .getParametersConfiguration()
                .get(INITIAL_COLLECTOR_CLASS)
                .getValue()).thenReturn(initialCollectorClass);

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

    public String getTextAlias() {
        return textAlias;
    }

    public String getInitialCollectorClass() {
        return initialCollectorClass;
    }
}
