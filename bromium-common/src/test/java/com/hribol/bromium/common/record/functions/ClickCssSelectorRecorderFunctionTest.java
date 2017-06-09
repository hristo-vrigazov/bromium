package com.hribol.bromium.common.record.functions;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.builder.JsCollector;
import com.hribol.bromium.common.record.invocations.ClickCssSelectorRecorderFunctionInvocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.record.javascript.generation.builder.JsFunctionNames.CLICK_CSS_SELECTOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.06.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ClickCssSelectorRecorderFunction.class
})
public class ClickCssSelectorRecorderFunctionTest {

    @Test
    public void buildsDeclarationFunction() throws Exception {
        Mocks mocks = new Mocks();

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction(mocks.jsCollector);

        assertEquals(mocks.expected, clickCssSelectorRecorderFunction.getJavascriptCode());
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        Mocks mocks = new Mocks();

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction(mocks.jsCollector);

        assertNotNull(clickCssSelectorRecorderFunction.getInvocation(mocks.eventName, mocks.webDriverActionConfiguration));
    }

    private static class Mocks {
        private JsCollector jsCollector;
        private String expected;
        private String eventName;
        private String cssSelector;
        private WebDriverActionConfiguration webDriverActionConfiguration;
        private ClickCssSelectorRecorderFunctionInvocation clickCssSelectorRecorderFunctionInvocation;

        public Mocks() throws Exception {
            expected = "function clickCssSelector(cssSelector, eventName) {\n" +
                    "\tdocument.arrive(cssSelector, options, function () {\n" +
                    "\t\tthis.addEventListener(click, function(e) {\n" +
                    "\t\t\tvar parameters = {\n" +
                    "\t\t\t\tevent: eventName,\n" +
                    "\t\t\t};\n" +
                    "\t\t\tbromium.notifyEvent(parameters)\n" +
                    "\t\t});\n" +
                    "\t});\n" +
                    "}\n";

            cssSelector = "#title";
            eventName = "Click on title";

            webDriverActionConfiguration = mock(WebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
            when(webDriverActionConfiguration
                    .getParametersConfiguration()
                    .get(CSS_SELECTOR)
                    .getValue()).thenReturn(cssSelector);
            
            clickCssSelectorRecorderFunctionInvocation = mock(ClickCssSelectorRecorderFunctionInvocation.class);
            
            whenNew(ClickCssSelectorRecorderFunctionInvocation.class)
                    .withArguments(cssSelector, eventName)
                    .thenReturn(clickCssSelectorRecorderFunctionInvocation);
            
            jsCollector = mock(JsCollector.class, RETURNS_DEEP_STUBS);


            when(jsCollector
                    .declareFunction(CLICK_CSS_SELECTOR)
                    .withParameters(CSS_SELECTOR, "eventName")
                    .startBody()
                    .whenCssSelectorArrives("cssSelector")
                    .attachListenerForEvent("click")
                    .startCollectingParameters("parameters")
                    .parameter("event", "eventName")
                    .buildParameters()
                    .notifyBromium("parameters")
                    .endListener()
                    .endArriveHandler()
                    .endBody()
                    .build()).thenReturn(expected);
        }

    }
}
