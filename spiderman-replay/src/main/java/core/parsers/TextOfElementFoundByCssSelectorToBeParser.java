package core.parsers;

import core.actions.TextOfElementFoundByCssSelectorToBe;
import core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.replay.config.utils.Constants.CSS_SELECTOR;
import static com.hribol.spiderman.replay.config.utils.Constants.EVENT;

/**
 * Created by hvrigazov on 18.05.17.
 */
public class TextOfElementFoundByCssSelectorToBeParser implements WebDriverActionParameterParser {

    private final String TEXT = "text";

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String cssSelector = parameters.get(CSS_SELECTOR);
        String text = parameters.get(TEXT);
        String event = parameters.get(EVENT);
        return new TextOfElementFoundByCssSelectorToBe(cssSelector, text, event);
    }
}
