package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.dsl.bromium.ActionContext;

public class ASTContextProviderConverter implements ASTNodeConverter<ActionContext, ContextProvider> {

    @Override
    public ContextProvider convert(ActionContext actionContext) {
        //TODO: implement
        ContextProvider contextProvider = new ContextProvider();
        contextProvider.setFunction(webDriver -> webDriver);
        return contextProvider;
    }
}
