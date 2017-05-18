package core.execution.factory;

/**
 * A {@link WebDriverActionFactory} which uses only the predefined actions
 */
public class PredefinedWebDriverActionFactory extends WebDriverActionFactoryBase {
    public PredefinedWebDriverActionFactory(String baseURL) {
        super(baseURL);
    }

    @Override
    protected void addCustom() {
    }
}
