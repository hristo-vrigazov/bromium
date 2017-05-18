package core.parsers;

import core.actions.ElementByCssToBeClickable;
import core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.CSS_SELECTOR;
import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;

/**
 * Created by hvrigazov on 18.05.17.
 */
public class ElementByCssToBeClickableParser implements WebDriverActionParameterParser {
    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String eventName = parameters.get(EVENT);
        return new ElementByCssToBeClickable(cssSelector, eventName);
    }
}
