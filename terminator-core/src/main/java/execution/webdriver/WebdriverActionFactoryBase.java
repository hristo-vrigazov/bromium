package execution.webdriver;

import execution.webdriver.parsers.ClickClassByTextParser;
import execution.webdriver.parsers.WebDriverActionParameterParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvrigazov on 18.03.17.
 */
public abstract class WebdriverActionFactoryBase implements WebdriverActionFactory {

    protected Map<String, WebDriverActionParameterParser> typeToCreatorMap;

    public WebdriverActionFactoryBase() {
        typeToCreatorMap = new HashMap<>();
        addPredefined();
        addCustom();
    }

    private void addPredefined() {
        typeToCreatorMap.put("CLICK_CLASS_BY_TEXT", new ClickClassByTextParser());
    }

    protected abstract void addCustom();

    @Override
    public WebdriverAction create(String webdriverActionType, Map<String, Object> parameters) {
        return typeToCreatorMap.get(webdriverActionType).create(parameters);
    }
}
