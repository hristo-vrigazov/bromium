package com.hribol.spiderman.core.execution.application;

import java.util.Map;

/**
 * A factory for creating {@link ApplicationAction}
 */
public interface ApplicationActionFactory {
    ApplicationAction create(Map<String, String> testCaseStep);
}
