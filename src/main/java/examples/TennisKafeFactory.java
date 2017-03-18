package examples;

import config.ApplicationActionConfiguration;
import config.ApplicationConfiguration;
import execution.ApplicationAction;
import execution.ApplicationActionFactory;
import execution.TestCaseToApplicationActionConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class TennisKafeFactory implements ApplicationActionFactory {

    private String url;
    private Map<String, ApplicationActionConfiguration> nameToConfiguration;
    private TestCaseToApplicationActionConverter testCaseToApplicationActionConverter;

    public TennisKafeFactory(String url, ApplicationConfiguration applicationConfiguration) {
        this.nameToConfiguration = new HashMap<>();
        this.url = url;

        for (ApplicationActionConfiguration applicationActionConfiguration: applicationConfiguration.getApplicationActionConfigurationList()) {
            nameToConfiguration.put(applicationActionConfiguration.getName(), applicationActionConfiguration);
        }

        this.testCaseToApplicationActionConverter = new TestCaseToApplicationActionConverter();
    }

    @Override
    public ApplicationAction getInitialPageLoading() {
        return new TennisKafeHomePageLoading(url);
    }

    @Override
    public ApplicationAction create(Map<String, String> testCaseStep) {
//        String text = testCaseStep.get("text");
//        return new ClickMegaMenu(text);
        String name = testCaseStep.get("event");
        ApplicationActionConfiguration applicationActionConfiguration = nameToConfiguration.get(name);
        return testCaseToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep);
    }
}
