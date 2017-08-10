package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


/**
 * Created by hvrigazov on 09.06.17.
// */

public class ClickCssSelectorRecorderFunctionTest {

    @Test
    public void buildsDeclarationFunction() throws Exception {
        Mocks mocks = new Mocks();

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction(mocks.jsCollector);

        assertTrue(equalToIgnoringWhiteSpace(mocks.expected).matches(clickCssSelectorRecorderFunction.getJavascriptCode()));
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        Mocks mocks = new Mocks();

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction(mocks.jsCollector);

        assertNotNull(clickCssSelectorRecorderFunction.getInvocation(mocks.nameWebDriverActionConfiguration));
    }

    private static class Mocks {
        private JsCollector jsCollector;
        private String expected;
        private String eventName;
        private String cssSelector;
        private NameWebDriverActionConfiguration nameWebDriverActionConfiguration;
        private WebDriverActionConfiguration webDriverActionConfiguration;

        public Mocks() throws Exception {
            expected = "function ClickCssSelector(cssSelector, eventName) {\n" +
                    "\tdocument.arrive(cssSelector, options, function () {\n" +
                    "\t\tthis.addEventListener(\"click\", function(e) {\n" +
                    "\t\t\tvar parameters = {};\n" +
                    "\t\t\tparameters[\"event\"] = eventName;\n" +
                    "\t\t\tbromium.notifyEvent(parameters);\n" +
                    "\t\t});\n" +
                    "\t});\n" +
                    "}";

            cssSelector = "#title";
            eventName = "Click on title";

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

    }
}
