package execution.webdriver.parsers;

import actions.ClickClassByText;
import execution.webdriver.WebdriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 30.03.17.
 */
public class ClickClassByTextParser implements WebDriverActionParameterParser {
    @Override
    public WebdriverAction create(Map<String, Object> parameters) {
        String initialCollectorClass = (String) parameters.get("initialCollectorClass");
        String text = (String) parameters.get("text");
        String eventName = (String) parameters.get("event");
        boolean expectsHttpRequest = (boolean) parameters.get("expectsHttp");
        return new ClickClassByText(initialCollectorClass, text, eventName, expectsHttpRequest);
    }
}
