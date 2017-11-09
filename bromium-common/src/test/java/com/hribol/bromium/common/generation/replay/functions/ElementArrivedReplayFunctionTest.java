package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.text.MessageFormat;

import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 02.07.17.
 */
public abstract class ElementArrivedReplayFunctionTest {

    public ElementArrivedReplayFunctionTest(ReplayFunctionProvider provider, String jsFunctionName) {
        this.provider = provider;
        this.jsFunctionName = jsFunctionName;
    }

    public interface ReplayFunctionProvider {
        ReplayFunction get(JsCollector jsCollector, ElementArrivedReplayFunction.ElementArrivedInvocationProvider invocationProvider);
    }

    private ReplayFunctionProvider provider;
    private String jsFunctionName;

    @Test
    public void buildsDeclarationFunction() throws Exception {
        Mocks mocks = new Mocks();
        ReplayFunction replayFunction = provider.get(mocks.jsCollector, mocks.invocationProvider);
        assertEquals(mocks.expected, replayFunction.getJavascriptCode());
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        Mocks mocks = new Mocks();
        ReplayFunction replayFunction = provider.get(mocks.jsCollector, mocks.invocationProvider);
        assertNotNull(replayFunction.getInvocation(mocks.stepAndWebDriverActionConfiguration));
    }

    public class Mocks {
        private JsCollector jsCollector;
        private String expected;
        private String cssSelector;
        private StepAndWebDriverActionConfiguration stepAndWebDriverActionConfiguration;
        private WebDriverActionConfiguration webDriverActionConfiguration;
        private ElementArrivedReplayFunction.ElementArrivedInvocationProvider invocationProvider;
        private ReplayFunctionInvocation invocation;
        private String hashCode;

        public Mocks() throws Exception {
            expected = "function " + jsFunctionName + "(cssSelector, hashCode) {\n" +
                    "\tdocument.arrive(cssSelector, options, function () {\n" +
                    "\t\tbromium.notifySatisfiedCondition(hashCode);\n" +
                    "\t});\n" +
                    "\tdocument.leave(cssSelector, function () {\n" +
                    "\t\tbromium.notifyNotSatisfiedCondition(hashCode);\n" +
                    "\t});\n" +
                    "}\n";
            cssSelector = "#title";

            webDriverActionConfiguration = mock(WebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
            when(webDriverActionConfiguration
                    .getParametersConfiguration()
                    .get(CSS_SELECTOR)
                    .getValue()).thenReturn(cssSelector);


            jsCollector = new JsCollector();

            stepAndWebDriverActionConfiguration = mock(StepAndWebDriverActionConfiguration.class);
            when(stepAndWebDriverActionConfiguration.getWebDriverActionConfiguration()).thenReturn(webDriverActionConfiguration);
            when(stepAndWebDriverActionConfiguration.getGenerationFunctionInformation()).thenReturn(webDriverActionConfiguration);

            invocation = mock(ReplayFunctionInvocation.class);
            invocationProvider = mock(ElementArrivedReplayFunction.ElementArrivedInvocationProvider.class);

            hashCode = String.valueOf(MessageFormat.format("{0} {1}", jsFunctionName, cssSelector).hashCode());
            when(invocationProvider.get(cssSelector, hashCode)).thenReturn(invocation);
        }

    }

}
