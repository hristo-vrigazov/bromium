package com.hribol.bromium.record.javascript.generation.functions;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.invocations.ClickCssSelectorRecorderFunctionInvocation;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class ClickCssSelectorRecorderFunction implements RecorderFunction {
    @Override
    public String getJavascriptCode() {
        return "function clickCssSelector(cssSelector, eventName) {\n" +
                "    document.arrive(cssSelector, options, function () {\n" +
                "        this.addEventListener('click', (e) => {\n" +
                "            var parameters = {\n" +
                "                \"event\": eventName\n" +
                "            };\n" +
                "            bromium.notifyEvent(parameters);\n" +
                "        });\n" +
                "    });\n" +
                "}";
    }

    @Override
    public RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        String cssSelector = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue();

        return new ClickCssSelectorRecorderFunctionInvocation(cssSelector, eventName);
    }
}
