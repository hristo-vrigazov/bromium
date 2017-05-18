package core.parsers;

import static com.hribol.spiderman.replay.config.utils.Constants.CSS_SELECTOR;
import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;
import static com.hribol.spiderman.replay.config.utils.Constants.TEXT;

import java.util.Map;

import core.actions.TypeTextInElementFoundByCssSelector;
import core.actions.WebDriverAction;

/**
 * Created by hvrigazov on 12.05.17.
 */
public class TypeTextInElementFoundByCssSelectorParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String eventName = parameters.get(EVENT);
        String text = parameters.get(TEXT);
        return new TypeTextInElementFoundByCssSelector(cssSelector, text, eventName, expectHttpRequest);
    }
}
