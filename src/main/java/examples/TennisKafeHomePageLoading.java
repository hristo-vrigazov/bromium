package examples;

import actions.PageLoading;
import execution.ApplicationAction;
import execution.WebdriverAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class TennisKafeHomePageLoading implements ApplicationAction {

    private String url;
    private String eventName;

    public TennisKafeHomePageLoading(String url) {
        this.url = url;
        this.eventName = "TENNIS_KAFE_INITIAL_PAGE_LOADING";
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
