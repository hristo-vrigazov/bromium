package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.replay.invocations.ClickCssSelectorReplayInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * A {@link ReplayFunction} for {@link com.hribol.bromium.common.replay.actions.ClickCssSelector}
 */
public class ClickCssSelectorReplayFunction extends ElementArrivedReplayFunction {

    public ClickCssSelectorReplayFunction(JsCollector jsCollector) {
        super(CLICK_CSS_SELECTOR, jsCollector, ClickCssSelectorReplayInvocation::new);
    }
}
