package core.parsers;

import core.actions.ClickCssSelector;
import core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.CSS_SELECTOR;
import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;

/**
 * Parser for {@link core.actions.ClickCssSelector}
 */
public class ClickCssSelectorParser implements WebDriverActionParameterParser {


    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String eventName = parameters.get(EVENT);
        return new ClickCssSelector(cssSelector, eventName, expectHttpRequest);
    }
}
