package execution.application;

import actions.PageLoading;
import execution.webdriver.WebdriverAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ApplicationPageLoading implements ApplicationAction {

    private String url;
    private String eventName;

    public ApplicationPageLoading(String url, String eventName) {
        this.url = url;
        this.eventName = eventName;
    }

    @Override
    public Optional<WebdriverAction> getPrecondition() {
        return Optional.empty();
    }

    @Override
    public Optional<WebdriverAction> getWebdriverAction() {
        return Optional.of(new PageLoading(url, eventName));
    }

    @Override
    public Optional<WebdriverAction> getPostcondition() {
        return Optional.empty();
    }
}
