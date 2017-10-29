package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

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
        ReplayFunction get(JsCollector jsCollector);
    }

    private ReplayFunctionProvider provider;
    private String jsFunctionName;

    @Test
    public void buildsDeclarationFunction() throws Exception {
        Mocks mocks = new Mocks();
        ReplayFunction replayFunction = provider.get(mocks.jsCollector);
        assertEquals(mocks.expected, replayFunction.getJavascriptCode());
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        Mocks mocks = new Mocks();
        ReplayFunction replayFunction = provider.get(mocks.jsCollector);
        assertNotNull(replayFunction.getInvocation(mocks.stepAndWebDriverActionConfiguration));
    }

    public class Mocks {
        private JsCollector jsCollector;
        private String expected;
        private String cssSelector;
        private StepAndWebDriverActionConfiguration stepAndWebDriverActionConfiguration;
        private WebDriverActionConfiguration webDriverActionConfiguration;

        public Mocks() throws Exception {
            expected = "generatedCode";
            cssSelector = "#title";

            webDriverActionConfiguration = mock(WebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
            when(webDriverActionConfiguration
                    .getParametersConfiguration()
                    .get(CSS_SELECTOR)
                    .getValue()).thenReturn(cssSelector);


            jsCollector = mock(JsCollector.class, RETURNS_DEEP_STUBS);

            stepAndWebDriverActionConfiguration = mock(StepAndWebDriverActionConfiguration.class);
            when(stepAndWebDriverActionConfiguration.getWebDriverActionConfiguration()).thenReturn(webDriverActionConfiguration);
            when(stepAndWebDriverActionConfiguration.getGenerationFunctionInformation()).thenReturn(webDriverActionConfiguration);

            when(jsCollector
                    .declareFunction(jsFunctionName)
                    .withParameters(CSS_SELECTOR, HASHCODE)
                    .startBody()
                    .whenCssSelectorArrives(CSS_SELECTOR)
                    .notifySatisfiedCondition(HASHCODE)
                    .endArriveHandler()
                    .whenCssSelectorLeaves(CSS_SELECTOR)
                    .notifyNotSatisfiedCondition(HASHCODE)
                    .endLeaveHandler()
                    .endBody()
                    .build()).thenReturn(expected);
        }

    }

}
