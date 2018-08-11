package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.TableActionContext;

import java.util.function.Function;

public class ASTRecorderJsContextConverter implements ASTNodeConverter<ActionContext, Function<String, String>> {

    @Override
    public Function<String, String> convert(ActionContext actionContext) {
        return actionContext == null ?
                invocation -> "var context = document;\n" + invocation :
                invocation -> getActionContextMultiple(actionContext);
    }

    private String getActionContextMultiple(ActionContext actionContext) {
        if (actionContext instanceof TableActionContext) {
            return getTableActionContext((TableActionContext) actionContext);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + actionContext);
    }

    private String getTableActionContext(TableActionContext actionContext) {
        return null;
    }

}
