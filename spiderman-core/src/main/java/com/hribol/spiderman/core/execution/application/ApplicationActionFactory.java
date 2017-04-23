package com.hribol.spiderman.core.execution.application;

import java.util.Map;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface ApplicationActionFactory {
    ApplicationAction getInitialPageLoading();

    ApplicationAction create(Map<String, String> testCaseStep);
}
