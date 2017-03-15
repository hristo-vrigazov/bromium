package execution;

import config.ApplicationConfiguration;

import java.util.Map;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface ApplicationActionFactory {
    ApplicationAction getInitialPageLoading();

    ApplicationAction create(ApplicationConfiguration applicationConfiguration,
                                    Map<String, String> testCaseStep);
}
