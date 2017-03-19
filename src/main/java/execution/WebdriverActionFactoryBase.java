package execution;

import actions.ClickClassByText;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public abstract class WebdriverActionFactoryBase implements WebdriverActionFactory {

    protected Map<String, WebdriverActionCreator> typeToCreatorMap;

    public WebdriverActionFactoryBase() {
        typeToCreatorMap = new HashMap<>();
        addPredefined();
        addCustom();
    }

    private void addPredefined() {
        typeToCreatorMap.put("CLICK_CLASS_BY_TEXT", this::clickClassByText);
    }

    protected abstract void addCustom();

    @Override
    public WebdriverAction create(String webdriverActionType, Map<String, Object> parameters) {
        return typeToCreatorMap.get(webdriverActionType).create(parameters);
    }

    private WebdriverAction clickClassByText(Map<String, Object> parameters) {
        String initialCollectorClass = (String) parameters.get("initialCollectorClass");
        String text = (String) parameters.get("text");
        String eventName = (String) parameters.get("event");
        boolean expectsHttpRequest = (boolean) parameters.get("expectsHttp");
        return new ClickClassByText(initialCollectorClass, text, eventName, expectsHttpRequest);
    }
}
