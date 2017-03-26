package execution.webdriver;

import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public interface WebdriverActionFactory {
    WebdriverAction create(String webdriverActionType, Map<String, Object> parameters);
}
