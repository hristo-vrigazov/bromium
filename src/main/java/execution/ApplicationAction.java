package execution;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface ApplicationAction {
    WebdriverAction getPrecondition();
    WebdriverAction getWebdriverAction();
    WebdriverAction getPostcondition();
}
