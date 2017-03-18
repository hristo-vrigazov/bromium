package examples;

import actions.ClickClassByText;
import execution.ApplicationAction;
import execution.WebdriverAction;

import java.util.Optional;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ClickMegaMenu implements ApplicationAction {

    private String text;

    public ClickMegaMenu(String text) {
        this.text = text;
    }

    @Override
    public Optional<WebdriverAction> getPrecondition() {
        return Optional.empty();
    }

    @Override
    public Optional<WebdriverAction> getWebdriverAction() {
        return Optional.of(new ClickClassByText("mega-menu-link", text, "CLICK_MEGA_MENU", false));
    }

    @Override
    public Optional<WebdriverAction> getPostcondition() {
        return Optional.empty();
    }
}
