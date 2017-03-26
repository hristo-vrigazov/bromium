package execution.webdriver;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebdriverActionCreator {
    WebdriverAction create(Map<String, Object> parameters);
}
