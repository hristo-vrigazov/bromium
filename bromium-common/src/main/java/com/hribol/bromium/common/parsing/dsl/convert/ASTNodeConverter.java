package com.hribol.bromium.common.parsing.dsl.convert;

/**
 * Used to convert the DSL's AST to {@link com.hribol.bromium.core.config.ApplicationConfiguration}
 */
public interface ASTNodeConverter<ASTNode, Output> {
    Output convert(ASTNode node);
}
