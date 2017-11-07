package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.dsl.bromium.Model;

/**
 * Used to convert the DSL's AST to {@link com.hribol.bromium.core.config.ApplicationConfiguration}
 */
public interface DslConfigurationConverter {
    ApplicationConfiguration convert(Model model);
}
