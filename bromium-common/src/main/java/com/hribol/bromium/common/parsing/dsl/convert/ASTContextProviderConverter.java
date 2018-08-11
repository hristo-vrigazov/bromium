package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.dsl.bromium.ActionContext;

public class ASTContextProviderConverter implements ASTNodeConverter<ActionContext, ContextProvider> {

    private ASTRecorderJsContextConverter astRecorderJsContextConverter;
    private ASTJavaContextConverter astJavaContextConverter;

    @Inject
    public ASTContextProviderConverter(ASTRecorderJsContextConverter astRecorderJsContextConverter,
                                       ASTJavaContextConverter astJavaContextConverter) {
        this.astRecorderJsContextConverter = astRecorderJsContextConverter;
        this.astJavaContextConverter = astJavaContextConverter;
    }

    @Override
    public ContextProvider convert(ActionContext actionContext) {
        ContextProvider contextProvider = new ContextProvider();
        contextProvider.setFunction(astJavaContextConverter.convert(actionContext));
        contextProvider.setRecorderContextProvider(astRecorderJsContextConverter.convert(actionContext));
        return contextProvider;
    }

}
