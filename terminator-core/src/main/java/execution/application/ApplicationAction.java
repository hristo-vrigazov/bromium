package execution.application;

import execution.webdriver.WebdriverAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface ApplicationAction {
    Optional<WebdriverAction> getPrecondition();
    Optional<WebdriverAction> getWebdriverAction();
    Optional<WebdriverAction> getPostcondition();
}
