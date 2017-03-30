package execution.webdriver.parsers;

import execution.webdriver.WebdriverAction;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebDriverActionParameterParser {
    WebdriverAction create(Map<String, Object> parameters);
}
