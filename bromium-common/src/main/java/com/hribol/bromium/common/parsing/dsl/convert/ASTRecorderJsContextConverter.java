package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.TableActionContext;

import java.util.function.Function;

public class ASTRecorderJsContextConverter implements ASTNodeConverter<ActionContext, Function<String, String>> {

    @Override
    public Function<String, String> convert(ActionContext actionContext) {
        return actionContext == null ?
                invocation -> "var parameters = {};\n\t" +
                        "var parametersEnrichmentFunctions = [];\n\t"+
                        "var context = document;\n\t" + invocation :
                invocation -> getActionContextMultiple(invocation, actionContext);
    }

    private String getActionContextMultiple(String invocation, ActionContext actionContext) {
        if (actionContext instanceof TableActionContext) {
            return getTableActionContext(invocation, (TableActionContext) actionContext);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + actionContext);
    }

    private String getTableActionContext(String invocation, TableActionContext actionContext) {
        actionContext.getTableLocator();
        return null;
    }

}
